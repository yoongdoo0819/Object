package org.example;

import org.example.chapter1.step3.*;

public class Main {
    public static void main(String[] args) {



        Bag bag = new Bag(30L);
        Audience audience = new Audience(bag);
        System.out.println("audience ticket ? = " + audience.getBag().hasTicket());

        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();

        TicketOffice ticketOffice = new TicketOffice(0L, ticket1, ticket2, ticket3);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Theater theater = new Theater(ticketSeller);
        theater.enter(audience);

        System.out.println("audience ticket ? = " + audience.getBag().hasTicket());

    }
}