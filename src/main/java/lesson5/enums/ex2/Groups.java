package lesson5.enums.ex2;

public enum Groups {
    METALLICA("METALLICA", 4000), ACDC("AC/DC", 6000),
    QUEEN("QUEEN", 10000);

    private String name;

    Groups(String name, int ticketCost) {
        this.name = name;
        this.ticketCost = ticketCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(int ticketCost) {
        this.ticketCost = ticketCost;
    }

    private int ticketCost;

}
