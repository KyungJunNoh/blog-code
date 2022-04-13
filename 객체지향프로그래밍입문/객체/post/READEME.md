절차 지향 프로그래밍 과 객체지향 프로그래밍 의 차이
절차지향은 말 그대로 절차적( 순차적 )으로 흘러가는 코드를 말하고

객체지향 언어는

1. 캡슐화, 다형성, 클래스, 상속을 지원하는가?

2. 데이터 접근 제한을 걸 수 있는가?

이와 같은 성격이 있어야 객체지향 적인 프로그래밍이라고 할 수 있습니다.

경험
저는 프로그래밍을 시작할때 C언어로  시작을 했습니다.

C언어는 절차지향 프로그래밍언어의 대표적인 예로 프로그래밍을 입문했을때 절차적으로 코드를 술술 짜면 되서

C언어로 인해서 코딩에도 흥미를 느끼게 되는 계기였습니다.



C언어를 하다가 JAVA 를 시작을 했는데,

처음에는 너무 어려웠습니다. ( 지금도 어렵게 생각합니다.. )



객체가 뭐지? 생성자? 클래스? 등의 개념적인 문제도 있었고,

자바를 절차지향적으로 작성하기도 했었습니다.

객체 ?
객체는 "어떤기능을 제공하는지?" 가 핵심입니다.

내부적으로 가진 필드(데이터)로 정의하지 않습니다.



첫번째 예를 들겠습니다.



Main 클래스

public class Main {

    public static void main(String[] args) {
        Member member = new Member(); // 생성자로 member 객체를 사용할 준비 완료

        member.name = "노경준";        // member 의 이름을 설정
        member.age = 19;             // member 의 나이을 설정
        member.tall = 173;           // member 의 키을 설정
        member.weight = 65;          // member 의 몸무게을 설정

        member.memberInfo();         // member 의 정보를 가져오는 메소드 호출

        member.diet();               // 멤버가 다이어트를 하여 1kg가 빠짐

        member.memberInfo();         // member 의 정보를 가져오는 메소드 호출
    }

}


Member 클래스

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
멤버는 이름, 나이, 키, 몸무게를 가지고 있고

멤버는 다이어트를 했을때 몸무게가 1kg 줄어드는 기능을 가지고 있습니다.

그리고 멤버의 정보를 알 수 있는 memberInfo가 있습니다.



결과


위 코드의 순서

멤버의 정보를 설정 -> 멤버의 정보 확인 -> 멤버의 다이어트 -> 멤버의 정보 확인



두번째 예를 들겠습니다.



Main

public class Main {

    public static void main(String[] args) {
        VolumeController volumeController = new VolumeController();        // VolumeController 를 사용하기 위한 생성자 사용

        volumeController.increase(3);           // 볼륨을 3 만큼 올림

        volumeController.volumeCheck();         // 볼륨을 확인
    }
}


VolumeController

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
볼륨을 조절하는 객체가 있습니다

이 볼륨을 조절하는 객체는

볼륨을 올릴 수 있는 increase 라는 메소드와

볼륨을 줄일 수 있는 decrease 라는 메소드가 있습니다.





결과


위 코드의 순서

볼륨을 3 만큼 증가 -> 볼륨 확인

두 예제의 공통점
두 예제의 핵심 공통점은 각자의 객체가 기능을 가지고 있다는 점입니다.

객체와 객체는 기능을 사용해서 연결 됩니다.

기능을 사용한다는 말은 메소드를 호출 한다는 뜻입니다.
