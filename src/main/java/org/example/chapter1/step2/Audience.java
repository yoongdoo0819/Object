package org.example.chapter1.step2;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }

    public Long buy(Ticket ticket) {
        if (this.bag.hasInvitation()) {
            this.bag.setTicket(ticket);
            return 0L;
        } else {
            this.bag.setTicket(ticket);
            this.bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
