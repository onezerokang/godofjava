package chap25;

public class CommonCalculate {
    private int amount;
    private final Object lock = new Object();

    public CommonCalculate() {
        amount = 0;
    }

    public synchronized void plus(int value) {
        amount += value;
    }

    public synchronized void minus(int value) {
        amount -= value;
    }

    public void plusv2(int value) {
        synchronized(this) {
            amount += value;
        }
    }

    public void minusv2(int value) {
        synchronized (lock) {
            amount -= value;
        }
    }

    public int getAmount() {
        return amount;
    }
}
