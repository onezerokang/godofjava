package chap25;

public class RunSupportThreads {
    public static void main(String[] args) {
        SleepThread thread = new SleepThread(2000);

        try {
            System.out.println("thread.getState() = " + thread.getState());
            thread.start();
            System.out.println("after start thread.getState() = " + thread.getState());
            Thread.sleep(1000);
            thread.join();
            thread.interrupt();
            System.out.println("after join thread.getState() = " + thread.getState());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
