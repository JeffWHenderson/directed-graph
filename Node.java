class Node{

    private String name;
    boolean visited;

    public Node(String name) {
        this.name = name;
        this.visited = false;
    }

    public String getName() {
        return this.name;
    }

    public void setVisited(boolean val) {
    		this.visited = val;
    }
//    public void addEdge(Node Source, Node destination, int distance) {
//        Edge Edge = new Edge(source, destination, distance);
//        vertices.get(source).add(Edge);
//    }
}
