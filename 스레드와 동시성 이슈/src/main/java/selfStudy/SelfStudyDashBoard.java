package selfStudy;

import java.util.ArrayList;
import java.util.List;

public class SelfStudyDashBoard {

    static long count = 50;
    List<Account> selfStudyList = new ArrayList<>();

    // 자습 신청
    public synchronized void request(Account account){
        if(count > 0){
            count -=1;
            System.out.println(account.getName() +"님의 자습신청의 자습신청이 완료되었습니다. 남은 자리 : " + count);
            selfStudyList.add(account);
        } else {
            System.out.println("자습 신청 인원이 가득 찼습니다" + account.getStunum());
        }
    }

    public void countSet(){
        System.out.println("총 신청된 인원 : " + selfStudyList.size() + "명");
    }
}
