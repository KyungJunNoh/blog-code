package money;

public class Account {

    static long balance = 10000; // 잔액

    public synchronized void deposit(long amount) { // 입금
        balance = balance + amount;
    }

    public synchronized void withdraw(long amount) { // 출금
        balance = balance - amount;
    }

    public synchronized void inquiry() { // 잔액  조회
        System.out.println("현재 잔액은 " + balance + "원 입니다");
    }
}
