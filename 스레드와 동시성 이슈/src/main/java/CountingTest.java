public class CountingTest {

    public static void main(String[] args) {
        Count count = new Count(); // 조회수의 로직이 담긴 Count 클래스를 생성

        for (int i = 0; i < 100; i++) { // 100명의 사용자가
            new Thread(){
                public void run(){
                    for (int j=0; j<100; j++){ // 100번씩 조회를 했을때
                        System.out.println(count.view());
                    }
                }
            }.start();
        }
    }
}
