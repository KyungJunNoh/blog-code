package ticket;

public class TicketDashBoard {

    static long ticket = 10000;

    public synchronized void buy() {
        ticket -= 1;
    }

    public void currentTicket(){
        System.out.println("현재 남은 티켓 : " + ticket);
    }
}
