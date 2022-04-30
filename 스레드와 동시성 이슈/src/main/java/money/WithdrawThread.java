package money;

public class WithdrawThread implements Runnable {
    Account account;

    WithdrawThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) { // 1000번 반복
            account.withdraw(1000); // 1000원 출금
        }
        account.inquiry(); // 잔액 조회
    }
}
