package chap25;

public class RunMultiThreads {
    public static void main(String[] args) {
        RunnableSample[] runnable = new RunnableSample[5];
        ThreadSample[] thread = new ThreadSample[5];

        for(int i = 0; i < 5; i++) {
            runnable[i] = new RunnableSample();
            thread[i] = new ThreadSample();

            new Thread(runnable[i]).start();
            thread[i].start();
        }

        System.out.println("RunMultiThread's method is ended");
    }
}
