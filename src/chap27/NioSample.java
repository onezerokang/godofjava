package chap27;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static java.io.File.separator;

public class NioSample {
    public static void main(String[] args) {
        NioSample sample = new NioSample();
        sample.basicWriteAndRead();
    }

    private void basicWriteAndRead() {
        String fileName = separator + "Users" + separator + "wonyoung" + separator + "dev" + separator + "godofjava" + separator + "nio.txt";
        try {
            writeFile(fileName, "My first NIO Sample");
            readFile(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    private void writeFile(String fileName, String data) throws Exception {
        FileChannel channel = new FileOutputStream(fileName).getChannel(); // FileChannel을 만들기 위해서는 FileOutPutStream의 getChannel() 메소드를 호출해야 한다.
        byte[] byteData = data.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(byteData); // ByteBuffer 객체를 생성한다.
        channel.write(buffer); // FileChannel 클래스에 선언된 write() 메소드에 buffer 객체를 넘겨주면 파일을 작성하다.
        channel.close();
    }

    private void readFile(String fileName) throws Exception {
        FileChannel channel = new FileInputStream(fileName).getChannel(); // 파일을 읽기 위한 객체도 FileInputStream의 getChannel() 메소드를 호출해야 한다.
        ByteBuffer buffer = ByteBuffer.allocate(1024); // ByteBuffer 클래스의 allocate() 메소드를 통해 buffer 객체를 만든다.
        channel.read(buffer); // 데이터를 버퍼에 담으라고 알려준다.
        buffer.flip(); // buffer에 담겨있는 데이터의 가장 앞으로 이동한다.
        while(buffer.hasRemaining()) {
            System.out.print((char)buffer.get()); // 한 바이트씩 읽는 작업을 수행한다.
        }
        channel.close();
    }
}
