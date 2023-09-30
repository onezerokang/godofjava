package chap17;

public class AnnotationOverride extends Parent {

    public static void main(String[] args) {
        AnnotationOverride annotationOverride = new AnnotationOverride();
        annotationOverride.noMoreUse();
    }

    @Override
    public void printName() {
        System.out.println("AnnotationOverride");
    }

    @Deprecated
    public void noMoreUse() {

    }
}
