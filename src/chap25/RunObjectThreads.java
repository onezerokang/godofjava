package chap25;

public class RunObjectThreads {
    public static void main(String[] args) {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);

        try {
            System.out.println("thread state="+thread.getState());
            thread.start();
            System.out.println("thread state(after start)="+thread.getState());

            Thread.sleep(100);
            System.out.println("thread state(after 0.1 sec)="+thread.getState());

            synchronized (monitor) {
                monitor.notify();
            }
            Thread.sleep(100);
            System.out.println("thread state(after notify)="+thread.getState());;

            thread.join();
            System.out.println("thread state(after join)="+thread.getState());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }
}

class StateThread extends Thread {
    private Object monitor;

    public StateThread(Object monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        try {
            for(int i=0; i< 10000; i++) {
                String a = "A";
            }
            synchronized (monitor) {
                monitor.wait();
            }
            System.out.println(getName() + " is notified.");
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
