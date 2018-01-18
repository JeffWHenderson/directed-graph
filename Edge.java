class Edge {
    private Node source, destination;
    private int distance;

    public Edge(Node source, Node destination, int distance) {
        this.source = source;
        this.destination= destination;
        this.distance= distance;
    }

    Node getSource()	{
        return this.source;
    }

    Node getDestination() {
        return this.destination;
    }

    int getDistance()	{
        return this.distance;
    }
}
