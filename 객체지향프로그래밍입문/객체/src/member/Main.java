package member;

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
