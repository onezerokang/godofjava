package quiz.equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class SetRunner {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        Person p1 = new Person("철수", 20);
        Person p2 = new Person("철수", 20);
        set.add(p1);
        set.add(p2);

        System.out.println(set.size()); // 1이 출력 돼야 하지만 hashCode를 오버라이딩 하지 않아 2가 출력된다.
    }
}
