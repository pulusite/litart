package tba.mianshi;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zhangdong on 2018/6/4.
 */
public class Socket_ {
    class Server {

        private ServerSocket serverSocket;
        private Socket socket;
        private BufferedReader in;
        private PrintWriter out;

        public Server(){
            try {
                serverSocket = new ServerSocket(8888);
                while(true){
                    socket = serverSocket.accept();
                    String RemoteIP = socket.getInetAddress().getHostAddress();
                    String RemotePort = ":"+socket.getLocalPort();
                    System.out.println("A client come in!IP:"+RemoteIP+RemotePort);
                    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    String line = in.readLine();
                    System.out.println("Client send is :"+line);
                    out = new PrintWriter(socket.getOutputStream(),true);
                    out.println("Your Message Received!");
                    out.close();
                    in.close();
                    socket.close();
                }
            } catch (IOException e) {
                out.println("wrong");
            }
        }

//        public static void main(String[] args){
//            new Server();
//        }
    }

    class Client {

        Socket socket;
        BufferedReader in;
        PrintWriter out;

        public Client(){
            try {
                System.out.println("Try to Connect to 127.0.0.1:10000");
                socket = new Socket("127.0.0.1",8888);
                System.out.println("The Server Connected!");
                System.out.println("Please enter some Character:");
                BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
                out = new PrintWriter(socket.getOutputStream(),true);
                out.println(line.readLine());
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println(in.readLine());
                out.close();
                in.close();
                socket.close();

            } catch (IOException e) {
                out.println("Wrong");
            }
        }

//        public static void main(String [] args){
//            new Client();
//        }
    }

    public static void main(String[] args) {
        Socket_ socket=new Socket_();
        Server server=socket.new Server();
        Client client=socket.new Client();
    }
//    @Test
//    public void test(){
//        new Server();
//        new Client();
//
//    }

}
