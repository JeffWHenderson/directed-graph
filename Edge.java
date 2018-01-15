public class Edge {
  public String start; // should these be private with getters and setters???
  public String stop;
  public int distance;

  public Edge(String start, String stop, int distance) {
    this.start = start;
    this.stop = stop;
    this.distance = distance;
  }
}
