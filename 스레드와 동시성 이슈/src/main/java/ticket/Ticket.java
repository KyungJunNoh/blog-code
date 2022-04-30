package ticket;

public class Ticket {

    public static void main(String[] args){
        TicketDashBoard ticketDashBoard = new TicketDashBoard();

        for (int i = 0; i < 500; i++) {
            Thread buyThread1= new Thread(new BuyTicketThread(ticketDashBoard));
            Thread buyThread2 = new Thread(new BuyTicketThread(ticketDashBoard));

            buyThread1.start();
            buyThread2.start();
        }
    }
}
