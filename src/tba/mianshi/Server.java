package tba.mianshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zhangdong on 2018/6/4.
 */
public class Server {
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

        public static void main(String[] args){
            new Server();
        }
}
