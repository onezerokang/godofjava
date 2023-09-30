package chap32;

public interface DefaultStaticInterface {
    static final String name = "GodOfJavaBook";
    static final int since = 2023;
    String getName();
    int getSince();
    default String getEmail() {
        return name + "@godofjava.com";
    }
}
