package chap12;

public class Equals {
    public static void main(String[] args) {
        Equals thisObject = new Equals();
        thisObject.equalsMethod();
    }

    public void equalsMethod() {
        MemberDTO member1 = new MemberDTO("james", "01012341234", "james@gmail.com");
        MemberDTO member2 = new MemberDTO("james", "01012341234", "james@gmail.com");

        if (member1.equals(member2)) {
            System.out.println("같은 회원입니다.");
        } else {
            System.out.println("다른 회원입니다.");
        }
    }
}
