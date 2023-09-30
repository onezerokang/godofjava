package chap32;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalSample {
    public static void main(String[] args) {
        Optional<String> emptyString = Optional.empty(); // 데이터가 없는 Optional 객체 생성

        String common = null;
        Optional<String> nullableString = Optional.ofNullable(common); // 데이터에 null이 추가될 수 있는 상황

        common = "common";
        Optional<String> commonString = Optional.of(common); // 반드시 데이터가 들어갈 수 있는 상황

        System.out.println(Optional.of("present").isPresent()); // true
        System.out.println(Optional.ofNullable(null).isPresent()); // false
    }

    private void getOptionalData(Optional<String> data) throws Exception {
        String defaultValue = "default";
        String result1 = data.get(); // 데이터가 없으면 null이 리턴된다.
        String result2 = data.orElse(defaultValue); // 없을 경우 기본 갑을 리턴한다.
        Supplier<String> stringSupplier = new Supplier<>() {
            @Override
            public String get() {
                return "GodOfJava";
            }
        };

        String result3 = data.orElseGet(stringSupplier); // Supplier<T> 인터페이스를 활용하는 방법으로 orElseGet() 메소드를 사용할 수 있다.

        Supplier<Exception> exceptionSupplier = new Supplier<>() {
            @Override
            public Exception get() {
                return new Exception();
            }
        };

        String result4 = data.orElseThrow(exceptionSupplier); // 데이터가 없을 때 예외를 발생시킬 수 있다.
    }
}
