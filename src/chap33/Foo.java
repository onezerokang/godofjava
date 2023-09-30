package chap33;

import java.util.function.Function;

public class Foo {
    public static void main(String[] args) {
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        System.out.println(plus10.andThen(multiply2).apply(10)); // 40
        System.out.println(plus10.compose(multiply2).apply(10)); // 30
    }
}
