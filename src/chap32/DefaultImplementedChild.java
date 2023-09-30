package chap32;

public class DefaultImplementedChild implements DefaultStaticInterface {
    public static void main(String[] args) {
        DefaultImplementedChild child = new DefaultImplementedChild();
        System.out.println("child.getName() = " + child.getName());
        System.out.println("child.getSince() = " + child.getSince());
        System.out.println("child.getEmail() = " + child.getEmail());
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSince() {
        return since;
    }
}
