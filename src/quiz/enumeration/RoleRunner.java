package quiz.enumeration;

import java.util.List;

public class RoleRunner {
    public static void main(String[] args) {
        System.out.println(Role.ADMIN.name()); // ADMIN
        System.out.println(Role.VIP.ordinal()); // 2
        System.out.println(Role.VIP.compareTo(Role.ADMIN)); // 2
        System.out.println(Role.valueOf("NORMAL")); // NORMAL
        System.out.println(Role.valueOf("NORMAL2")); // NORMAL
        System.out.println(List.of(Role.values())); //[ADMIN, NORMAL, VIP]
    }
}
