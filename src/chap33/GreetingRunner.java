package chap33;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class GreetingRunner {
    public static void main(String[] args) {
        // UnaryOperator<String> hi = (s) -> "hi " + s;
        UnaryOperator<String> hi = Greeting::hi; // Greeting의 hi static method를 사용하겠다.

        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        // UnaryOperator<String> hello2 = greeting.hello; 이건 안 된다.

        Supplier<Greeting> newGreeting = Greeting::new;
        newGreeting.get();

        Function<String, Greeting> newGreeting2 = Greeting::new;
        newGreeting2.apply("name");

    }
}
