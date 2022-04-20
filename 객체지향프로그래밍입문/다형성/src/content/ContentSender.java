package content;

public abstract class ContentSender {
    String title;
    String nm;

    public ContentSender(String title, String nm) {
        super();
        this.title = title;
        this.nm = nm;
    }

    //추상메서드 --> 상속을 통해서 반드시 재정이 되어야지만 비로소 인스턴스를 생성할 수 있다.
    public abstract void sendMsg(String recipient);
}
