package org.example.Chapter1.Step2;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        System.out.println("step2 - audience가 티켓 구매 시작");
        this.ticketSeller.sellTo(audience);
        System.out.println("step2 - audience가 티켓 구매 종료");
    }
}
