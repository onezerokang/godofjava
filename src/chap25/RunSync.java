package chap25;

public class RunSync {
    public static void main(String[] args) {
        CommonCalculate calc = new CommonCalculate();
        ModifyAmountThread thread1 = new ModifyAmountThread(calc, true);
        ModifyAmountThread thread2 = new ModifyAmountThread(calc, true);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            System.out.println("calc.getAmount() = " + calc.getAmount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
