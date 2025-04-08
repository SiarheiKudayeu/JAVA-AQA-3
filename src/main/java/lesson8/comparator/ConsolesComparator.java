package lesson8.comparator;

public class ConsolesComparator{
    public int cost;
    public Name name;


    public ConsolesComparator(Name name, int cost) {
        this.cost = cost;
        this.name = name;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ",cost = " + cost;
    }


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
