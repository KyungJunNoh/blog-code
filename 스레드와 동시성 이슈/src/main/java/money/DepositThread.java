package money;

public class DepositThread implements Runnable{

    Account account;

    DepositThread(Account account){
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) { // 1000번 반복
            account.deposit(1000); // 1000원 입금
        }
        account.inquiry(); // 잔액 조회
    }
}
