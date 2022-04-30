package selfStudy;

public class SelfStudyThread implements Runnable{
    SelfStudyDashBoard selfStudyDashBoard;
    Account account;

    SelfStudyThread(SelfStudyDashBoard selfStudyDashBoard,Account account){
        this.selfStudyDashBoard = selfStudyDashBoard;
        this.account = account;
    }

    @Override
    public void run() {
        selfStudyDashBoard.request(account);
    }
}
