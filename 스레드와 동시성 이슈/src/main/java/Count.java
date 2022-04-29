public class Count {
    private int count;

    public synchronized int view(){
        return count++;
    }
}
