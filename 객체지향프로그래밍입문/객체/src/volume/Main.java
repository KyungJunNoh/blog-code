package volume;

public class Main {

    public static void main(String[] args) {
        VolumeController volumeController = new VolumeController();        // VolumeController 를 사용하기 위한 생성자 사용

        volumeController.increase(3);           // 볼륨을 3 만큼 올림

        volumeController.volumeCheck();         // 볼륨을 확인
    }
}
