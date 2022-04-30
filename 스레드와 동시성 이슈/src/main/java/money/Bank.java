package money;

public class Bank {

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();
        for (int i = 0; i < 10; i++) {
            Thread deposit = new Thread(new DepositThread(account));
            Thread withdraw = new Thread(new WithdrawThread(account));

            deposit.start();
            withdraw.start();
        }
        Thread.sleep(1000);
        account.inquiry();
    }
}
