package lesson4.inner;

public class Gym {
    public String name;
    private String type;

    static String staticField;

    public void getCostOfEquipment(Equipment par){
        System.out.println("Cost of equipment " + par.name + " is " + par.getCost());
    }

    public Equipment[] equipment;

    public Gym(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public class Equipment{
        public String name;
        private int cost;

        public Equipment(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }

        public int getCost() {
            return cost;
        }

        public void tryAccessForOuterClass(){
            System.out.println("Name of my gym is: "+ Gym.this.name);
            System.out.println("Name of me: "+ this.name);
            System.out.println("Type of Gym: "+ type);
            getCostOfEquipment(this);
        }
    }

}
