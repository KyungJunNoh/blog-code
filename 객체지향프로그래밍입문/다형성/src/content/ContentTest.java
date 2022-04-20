package content;

public class ContentTest {

    public static void main(String[] args) {

        ContentSender cs1 = new SmsSender("약속 공지","노경준","4월 20일 저녁 7시까지 공원으로 오세요"); // ContentSender 객체에 LetterSender 객체를 넣음 (다형성)
        cs1.sendMsg("임창규");

        System.out.println();
        SmsSender ls = new SmsSender("문자 받았습니다.","임창규","알겠습니다.");
        ls.sendMsg("노경준");

        System.out.println();
        ContentSender cs2 = new KakaoSender("안녕","송시현","ㅎㅇ"); // ContentSender 객체에 KakaoSender 객체를 넣음 (다형성)
        cs2.sendMsg("송유현");
    }
}
