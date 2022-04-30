package selfStudy;

import java.util.ArrayList;
import java.util.List;

public class SelfStudy {

    public static void main(String[] args) throws InterruptedException {
        SelfStudyDashBoard selfStudyDashBoard = new SelfStudyDashBoard();
        List<Account> accountList = new ArrayList<>();

        // 학생 51명을 회원 가입
        for (int i = 1; i < 52; i++) {
            accountList.add(new Account("사용자"+i,i));
        }

        // 51번의 자습신청 진행
        // 자습신청의 정원은 50명으로 한정되어있다.
        // 자습신청을 신청에 성공했을때에는 "학생의 이름 + 자습신청이 완료되었습니다"를 출력
        // 자습신청인원이 가득차서 실패했을때에는 "자습신청 인원이 가득 찼습니다 + 신청에 실패한 학생의 번호"를 출력한다.
        for (int i = 0; i < 51; i++) {
            Thread thread = new Thread(new SelfStudyThread(selfStudyDashBoard, accountList.get(i)));

            thread.start();
        }

        Thread.sleep(1000); // 스레드가 완전히 종료될때까지 sleep
        selfStudyDashBoard.countSet(); // 총 신청된 인원을 출력
    }
}
