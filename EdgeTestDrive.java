public class EdgeTestDrive{
  public static void main(String[] args){
    Edge ab5 = new Edge("A","B", 10);
    // ab5.start = "A";
    // ab5.stop = "B";
    // ab5.distance = 5;

    System.out.println("the edge is " + ab5.start + ab5.stop + ab5.distance);
  }
}

  //TODO: question: Can I instantiate Town instances when I create an edge... in Ruby psuedo => town.create(this.start) if Town.exist?

/*
  What about starting the node object with an acive boolean variable.. and if it has a start or and end node the variable can be switched to true.  Would that make it possible to set one string of AB5, BC4 to edge and create nodes based on those????j
*/
