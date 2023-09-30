package chap33;

import java.util.stream.Stream;

public class MethodReferenceSample {
    public static void main(String[] args) {
        MethodReferenceSample sample = new MethodReferenceSample();
        String[] stringArray = {"요다", "만두", "건빵"};
        sample.staticMethodReference(stringArray);
    }
    private static void printResult(String s) {
        System.out.println(s);
    }

    private void staticMethodReference(String[] stringArray) {
        Stream.of(stringArray).forEach(MethodReferenceSample::printResult);
    }
}
