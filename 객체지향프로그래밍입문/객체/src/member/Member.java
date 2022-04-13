package member;

public class Member {

    public String name;
    public int age;
    public int tall;
    public int weight;

    public void memberInfo(){
        System.out.println("이름 = " + name);
        System.out.println("나이 = " + age);
        System.out.println("키 = " + tall);
        System.out.println("몸무게 = " + weight);
    }

    public void diet(){
        this.weight-=1;
    }
}
