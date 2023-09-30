package chap28.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {
    public static void main(String[] args) {
        SocketServerSample sample = new SocketServerSample();
        sample.startSever();
    }

    private void startSever() {
        ServerSocket server = null;
        Socket client = null;
        try {
            server = new ServerSocket(9999); // 9999번 포트를 이용하여 SocketServer 객체 생성
            while(true) {
                System.out.println("Server:Waiting for request.");
                client = server.accept(); // 다른 원격 오출을 대기하는 상태가 된다. 연결이 완료되면 Socket 객체를 리턴하여 client 변수에 할당된다.
                System.out.println("Server:Accepted");
                InputStream stream = client.getInputStream(); // 데이터를 받기 위해서 InputStream 객체를 받았다. 전송할 때는 OutputStream 객체를 받아야 한다.
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(stream)
                );
                String data = null;
                StringBuilder receivedData = new StringBuilder();
                while((data = in.readLine()) != null) {
                    receivedData.append(data);
                }
                System.out.println("Received data:"+receivedData);
                in.close();
                stream.close();
                client.close();
                if(receivedData != null && "EXIT".equals(receivedData.toString())) {
                    System.out.println("Stop SocketServer");
                    break;
                }
                System.out.println("--------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                try {
                    server.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
