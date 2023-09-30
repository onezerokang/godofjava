package chap32;

import java.util.StringJoiner;

public class StringJoinerSample {
    public static void main(String[] args) {
        String[] stringArray = new String[]{"StudyHard", "GodOfJava", "Book"};
        StringJoiner joiner = new StringJoiner(",", "{", "}");

        for (String s: stringArray) {
            joiner.add(s);
        }
        System.out.println(joiner);
    }
}
