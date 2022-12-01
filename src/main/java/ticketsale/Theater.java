package ticketsale;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    //오류 업이 수행 O, 변경 용이성 X, 의사소통 목적 X , 코드 중복
    public void enter(Audience audience){
        ticketSeller.sellTo(audience);
    }
}
