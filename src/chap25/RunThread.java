package chap25;

public class RunThread {
    public static void main(String[] args) {
        RunnableSample runnable = new RunnableSample();
        new Thread(runnable).start();

        ThreadSample thread = new ThreadSample();
        thread.start();

        System.out.println("RunThread is ended");
    }
}
