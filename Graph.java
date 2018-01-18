import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graph {
   	public HashMap<Node, Set<Edge>> vertices;

    Graph() {
    //    numVertices = 0;
        vertices = new HashMap<Node, Set<Edge>>();
    }

	void addNode(Node n) {
            vertices.put(n, new HashSet<Edge>());
      //      ++numVertices;
    }

    void addEdge(Node source, Node destination, int distance) {
            Edge Edge = new Edge(source, destination, distance);
            vertices.get(source).add(Edge);
           // source.addEdge(Edge);
    }


    ////////////////////////    This solves problems 1-5    ////////////////////////////////////////
    public int getDistance(ArrayList<Node> cities) throws Exception {
    		int distance = 0;
    		int depth = 0;

	    	for(int i = 0; i < cities.size() - 1; i++) {
	    		if(hasCity(cities, i)) {
	    				Set<Edge> cityEdges = this.vertices.get(cities.get(i)); //

	    					for(Edge cityEdge : cityEdges) {
	    						if(foundCity(cities, i, cityEdge)) {
	    							distance += cityEdge.getDistance();
	    							depth++;			// pull this out for readability
	    						}
	    					}
	    		} else
	    			distance = 0;
	    		}
	    		if( noRoutes(cities, distance, depth)) {
	    			throw new Exception("NO SUCH ROUTE");
	    		} else {
	    			return distance;
	    		}

	    	} // END getDistance

	private boolean noRoutes(ArrayList<Node> cities, int distance, int depth) {
		return distance == 0 || depth != cities.size() - 1;
	}

	private boolean foundCity(ArrayList<Node> cities, int i, Edge cityEdge) {
		return cityEdge.getDestination() == cities.get(i + 1);
	}

	private boolean hasCity(ArrayList<Node> cities, int i) {
		return this.vertices.containsKey(cities.get(i));
	}


////////////////////////// this solves problem 6 ////////////////////////////////

	public int findRoutes(Node start, Node destination, int maxDepth, int depth) {
		int routes = 0;
		if(hasCities(start, destination)) {
			depth++;
			if(depth > maxDepth)
				return 0;
			start.setVisited(true);

			Set<Edge> cityEdges = this.vertices.get(start);

			for(Edge cityEdge : cityEdges) {
				if(hasDestination(destination, cityEdge)) {
					routes++;
				}
				else if(!cityVisited(cityEdge)) {
					routes += findRoutes(cityEdge.getDestination(), destination, maxDepth, depth);
				}
			}
		}
	start.setVisited(false);
	return routes;
	} // END findRoutes

	private boolean cityVisited(Edge cityEdge) {
		return cityEdge.getDestination().visited;
	}

	private boolean hasDestination(Node destination, Edge cityEdge) {
		return cityEdge.getDestination() == destination;
	}

private boolean hasCities(Node start, Node destination) {
	return this.vertices.containsKey(start) && this.vertices.containsKey(destination);
}

	/////////////////////////// this solves 7 ///////////////////////////////////////
	public int findRouteWith_x_Stops(Node start, Node destination, int maxStops, int depth) {
		int routes = 0;
		if(hasCities(start, destination)) {
			depth++;
			if(depth > maxStops)
				return 0;

			Set<Edge> cityEdges = this.vertices.get(start);

			for(Edge cityEdge : cityEdges) {
				if(hasDestination(destination, cityEdge) && depth == maxStops) { // && depth == maxStops
					routes++;
				}
				else {
					routes += findRouteWith_x_Stops(cityEdge.getDestination(), destination, maxStops, depth);

				}
			}
		}
	return routes;
	} // END find4StopRoutes

////////////////////////////////////Solution for 8 and 9 ///////////////////////////////
	public int findShortestRoute(Node start, Node destination) {
		return shortestRoute(start, destination, 0, 0);
	}

	private int shortestRoute(Node start, Node destination, int shortest, int distance) {

		if(hasCities(start, destination)) {
			start.visited = true;
			Set<Edge> edges = this.vertices.get(start);

			for(Edge edge : edges) {
				if(hasDestination(destination, edge) || !cityVisited(edge))
					distance += edge.getDistance();

				if(edge.getDestination().equals(destination)) {
					if(shortest == 0 || distance < shortest)
						shortest = distance;
					start.visited = false;
					return shortest;
				}
				else if(!cityVisited(edge)) {
					shortest = shortestRoute(edge.getDestination(), destination, shortest, distance);
					distance -= edge.getDistance();
				}
			}

		}
		start.visited = false;
		return shortest;				// TODO clean up, junit, Packaging
	}
	/////////////////////////////////// Solution for 10 ////////////////////////////////////
	public int numberOfRoutes(Node start, Node end, int maximum){
		return getRoutes(start, end, 0, maximum);
	}

	private int getRoutes(Node start, Node destination, int total, int maximum) {
		int routes = 0;
		if(hasCities(start, destination)) {
			Set<Edge> edges = this.vertices.get(start);
			for(Edge edge : edges) {
				total += edge.getDistance();

				if(total <= maximum) {
					if(edge.getDestination().equals(destination)) {
						routes++;
						routes += getRoutes(edge.getDestination(), destination, total, maximum);
					}
					else {
						routes += getRoutes(edge.getDestination(), destination, total, maximum);
						total -= edge.getDistance();
					}
				}
				else
					total -= edge.getDistance();
			}
		}
		return routes;
	} // End of Get Routes
} // END of Graph class
