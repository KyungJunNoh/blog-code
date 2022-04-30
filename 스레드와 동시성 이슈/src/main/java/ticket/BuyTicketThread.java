package ticket;

public class BuyTicketThread implements Runnable{

    TicketDashBoard ticketDashBoard;

    BuyTicketThread(TicketDashBoard ticketDashBoard){
        this.ticketDashBoard = ticketDashBoard;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            ticketDashBoard.buy();
        }

        ticketDashBoard.currentTicket();
    }
}
