public class Edge {
  public Town start; // should these be private with getters and setters???
  public Town stop;
  public int distance;

  public Edge(String start, String stop, int distance) {
    this.start = new Town(start);
    this.stop = new Town(stop);
    this.distance = distance;
    /* this should work but will make a lot of duplicate towns

     what i need is a loop that asks
      if this town exist already,
        don't  create..
        set this.start to thatTown
      else
        new Town(start) // or stop
        this.start = start;
      end
        ^^^^UGLY AND WOULD HAVE BUGS

      Maybe its better to create Towns seperately????

      what would be best is to take whole graph string and create both the TownNode and the Edges off of that!!!!
     */
  }
}

// AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7
