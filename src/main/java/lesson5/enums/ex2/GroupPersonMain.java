package lesson5.enums.ex2;

public class GroupPersonMain {
    public static void main(String[] args) {
        GroupPerson sam = new GroupPerson(7000, "Sam");
        sam.whichConcertMeCanVisit();

        Groups[] groups = Groups.values();
        for (Groups group: groups){
            System.out.println("Name of group is: " + group.getName() + ". Cost is: " + group.getTicketCost() + ".");
        }

        System.out.println(Groups2.QUEEN);
    }
}
