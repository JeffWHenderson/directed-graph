public class GraphTestDrive{
  public static void main(String[] args){

      //AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7
    Node nodeA = new Node("A");
    Node nodeB = new Node("B");
    Node nodeC = new Node("C");
    Node nodeD = new Node("D");
    Node nodeE = new Node("E");

    Edge ab5 = new Edge(nodeA, nodeB, 5);
    Edge bc4 = new Edge(nodeB, nodeC, 4);
    Edge cd8 = new Edge(nodeC, nodeD, 8);
    Edge dc8 = new Edge(nodeD, nodeC, 8);
    Edge de6 = new Edge(nodeD, nodeE, 6);
    Edge ad5 = new Edge(nodeA, nodeD, 5);
    Edge ce2 = new Edge(nodeC, nodeE, 2);
    Edge eb3 = new Edge(nodeE, nodeB, 3);
    Edge ae7 = new Edge(nodeA, nodeE, 7);

    System.out.println("the edge is " + ae7.start.name + ae7.stop.name + ae7.distance);
  }
}
