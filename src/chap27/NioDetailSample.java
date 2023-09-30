package chap27;

import java.nio.IntBuffer;

public class NioDetailSample {
    public static void main(String[] args) {
        NioDetailSample sample = new NioDetailSample();
        sample.checkBuffer();
    }

    private void checkBuffer() {
        try {
            IntBuffer buffer = IntBuffer.allocate(1024);
            for(int i=0; i<100; i++) {
                buffer.put(i);
            }
            System.out.println("Buffer capacity="+buffer.capacity()); // 1024
            System.out.println("Buffer limit="+buffer.limit()); // 1024
            System.out.println("Buffer position="+buffer.position()); // 100
            buffer.flip();
            System.out.println("Buffer flipped");
            System.out.println("Buffer limit="+buffer.limit()); // `100
            System.out.println("Buffer position="+buffer.position()); // 0
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
