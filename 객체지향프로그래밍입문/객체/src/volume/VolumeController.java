package volume;

public class VolumeController {
    private int volume = 0;

    public void volumeCheck() {
        System.out.println("volume = " + this.volume);
    }

    public void increase(int inc){
        this.volume += inc;
    }

    public void decrease(int dec) {
        this.volume -= dec;
    }

}
