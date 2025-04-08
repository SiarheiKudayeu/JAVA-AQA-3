package lesson8.comparable;

public class Consoles implements Comparable<Consoles>{
    private int cost;
    private Name name;


    public Consoles(Name name, int cost) {
        this.cost = cost;
        this.name = name;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ",cost = " + cost;
    }

  /*  @Override
    public int compareTo(Consoles o) {
        return Integer.compare(this.cost, o.cost);
    }*/

    @Override
    public int compareTo(Consoles o) {
        return o.name.title.compareTo(this.name.title);
    }

/*    @Override
    public int compareTo(Consoles o) {
        if(this.cost > o.cost){
            return 1;
        }else if (this.cost < o.cost){
            return -1;
        }else {
            return 0;
        }
    }*/

    public enum Name {
        PLAYSTATION("PLAYSTATION"), XBOX("XBOX"), SWITCH("SWITCH");
        private String title;

        public String getTitle() {
            return title;
        }

        Name(String name) {
            this.title = name;
        }
    }
}
