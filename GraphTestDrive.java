public class GraphTestDrive{
  public static void main(String[] args){
    Node nodeA = new Node("A");
    Node nodeB = new Node("B");
    Node nodeC = new Node("C");
    Node nodeD = new Node("D");
    Node nodeE = new Node("E");

    Edge ab5 = new Edge(nodeA, nodeB, 5);

    System.out.println("the edge is " + ab5.start.name + ab5.stop.name + ab5.distance);
  }
}
