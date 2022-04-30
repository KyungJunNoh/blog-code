package selfStudy;

public class Account {

    private String name;
    private int stunum;

    Account(String name, int stunum){
        this.name = name;
        this.stunum = stunum;
    }

    public String getName() {
        return name;
    }

    public int getStunum() {
        return stunum;
    }
}
