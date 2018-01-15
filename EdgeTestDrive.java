import java.util.Arrays;

public class EdgeTestDrive{
  public static void main(String[] args){
    Edge ab5 = new Edge("A","B", 10);

    System.out.println("the edge is " + ab5.start.name + ab5.stop.name + ab5.distance);
}

  //TODO: question: Can I instantiate Town instances when I create an edge... in Ruby psuedo => town.create(this.start) if Town.exist?

/*
  What about starting the node object with an acive boolean variable.. and if it has a start or and end node the variable can be switched to true.  Would that make it possible to set one string of AB5, BC4 to edge and create nodes based on those????j


  String s = "AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7";
  String[] tokens = s.split(". ");

    for (String t : tokens)
      System.out.println(t);
}
*/
