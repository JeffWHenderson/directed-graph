import java.util.ArrayList;

public class GraphTestDrive {


    public static void main(String[] args) {

    	/////////////////// Before Test Setup ///////////////////////
    	 Graph graph = new Graph();

    	 Node a = new Node("A");        //	AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7
    	 Node b = new Node("B");
    	 Node c = new Node("C");
    	 Node d= new Node("D");
    	 Node e= new Node("E");

    		graph.addNode(a);
    		graph.addNode(b);
   		  graph.addNode(c);
    		graph.addNode(d);
    		graph.addNode(e);

    		graph.addEdge(a, b, 5);
    		graph.addEdge(b, c, 4);
    		graph.addEdge(c, d, 8);
    		graph.addEdge(d, c, 8);
    		graph.addEdge(d, e, 6);
    		graph.addEdge(a, d, 5);
    		graph.addEdge(c, e, 2);
    		graph.addEdge(e, b, 3);
    		graph.addEdge(a, e, 7);


    		///////////////////DISPLAY #1 - 5///////////////////////////////////
	    		ArrayList<Node> routeABC = new ArrayList<Node>();
	    		routeABC.add(a);  routeABC.add(b);  routeABC.add(c);
	    		try {
	    			System.out.println(  graph.getDistance(routeABC)  );
	    		} catch (Exception x) {
	    			//System.out.println(x.getMessage(), x);
	    		}

	    		ArrayList<Node> routeAD = new ArrayList<Node>();
	    		routeAD.add(a);  routeAD.add(d);
	    		try {
	    			System.out.println(  graph.getDistance(routeAD)  );
	    		} catch (Exception x) {
	    			//System.out.println(x.getMessage(), x);
	    		}

	    		ArrayList<Node> routeADC = new ArrayList<Node>();
	    		routeADC.add(a);  routeADC.add(d);  routeADC.add(c);
	    		try {
	    			System.out.println(  graph.getDistance(routeADC)  );
	    		} catch (Exception x) {
	    			//System.out.println(x.getMessage(), x);
	    		}

	    		ArrayList<Node> routeAEBCD= new ArrayList<Node>();
	    		routeAEBCD.add(a);  routeAEBCD.add(e);  routeAEBCD.add(b); routeAEBCD.add(c);  routeAEBCD.add(d);
	    		try {
	    			System.out.println(  graph.getDistance(routeAEBCD)  );
	    		} catch (Exception x) {
	    			//System.out.println(x.getMessage(), x);
	    		}

	    		ArrayList<Node> routeAED = new ArrayList<Node>();
	    		routeAED.add(a);  routeAED.add(e);  routeAED.add(d);
	    		try {
		    		System.out.println(  graph.getDistance(routeAED)  );
	    		} catch (Exception x) {
	    			System.out.println(x.getMessage());
	    		}

    		///////////////////////DISPLAY #6///////////////////////////////////
        		System.out.println( graph.findRoutes(c, c, 3, 0) );

       //////////////////////// DISPLAY #7//////////////////////////////////
        		System.out.println( graph.findRouteWith_x_Stops(a, c, 4, 0) );

      //////////////////////// DISPLAY #8///////////////////////////////////////
        		System.out.println( graph.findShortestRoute(a, c) );

       ////////////////////// DISPLAY #9 /////////////////////////////////////////
        		System.out.println( graph.findShortestRoute(b, b) );

      //////////////////////  DISPLAY #10/////////////////////////////////////////
        		System.out.println( graph.numberOfRoutes(c, c, 30) );
    }
}
