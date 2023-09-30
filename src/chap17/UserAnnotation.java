package chap17;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 1
@Retention(RetentionPolicy.RUNTIME) // 2
public @interface UserAnnotation { // 3
    public int number(); // 4
    public String text() default "This is first annotation"; // 5
}
