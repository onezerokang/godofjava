package quiz.equalshashcode;

public class EqualsRunner {
    public static void main(String[] args) {
        Person p1 = new Person("철수", 20);
        Person p2 = new Person("철수", 20);

        // p1객체와 p2 객체의 속성값이 같지만, equals와 hashCode를 오버라이딩 하지 않았기에 주소값을 비교한다.
        System.out.println(p1.equals(p2)); // false
    }
}
