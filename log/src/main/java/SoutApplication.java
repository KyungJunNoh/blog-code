public class SoutApplication {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("로그 입니다. " + i);
        }

        for (int i = 0; i < 10; i++) {
            System.err.println("에러 로그 입니다." + i);
        }
    }
}
