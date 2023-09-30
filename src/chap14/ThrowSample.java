package chap14;

public class ThrowSample {

    public static void main(String[] args) {
        ThrowSample sample = new ThrowSample();
//        sample.throwsException(13);
        sample.throwException(13);
    }

    public void throwException(int number) {
        try {
            if (number > 12) {
                throw new Exception("Number is over than 12");
            }
            System.out.println("number = " + number);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void throwsException(int number) throws Exception {
        if (number > 12) {
            throw new Exception("Number is over than 12");
        }
        System.out.println("number = " + number);
    }
}
