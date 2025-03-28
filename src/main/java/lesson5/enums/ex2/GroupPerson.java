package lesson5.enums.ex2;

public class GroupPerson {
    private int money;
    private String name;

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public GroupPerson(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public void whichConcertMeCanVisit(){
        if(money < Groups.METALLICA.getTicketCost()){
            System.out.println(name + ", please stay at home!");
        }else if (money < Groups.ACDC.getTicketCost()){
            System.out.println("You can go to " + Groups.METALLICA.getName());
        }else if(money < Groups.QUEEN.getTicketCost()){
            System.out.println("You can go to " + Groups.METALLICA.getName() + " or " + Groups.ACDC);
        }else {
            System.out.println("You can go anywhere!");
        }
    }
}
