package tba.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.Selector;
import java.util.Set;
import java.util.Iterator;

/**
 * Created by dongzhang on 4/8/17.
 */
public class MyServer {
    public static void main(String[] args) {
//        MyServer server = new MyServer(8080);
//        server.listen();
    }
    private ByteBuffer send = ByteBuffer.allocate(1024);
    private ByteBuffer receive =ByteBuffer.allocate(1024);

    public int port=0;
    ServerSocketChannel ssc=null;

    Selector selector=null;
    public MyServer(int port) throws IOException{
        //打开服务器套接字通道
        ServerSocketChannel serverSocketChannel= ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        ServerSocket serverSocket=serverSocketChannel.socket();
        serverSocket.bind(new InetSocketAddress(port));
        selector=Selector.open();

        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("Server Start -----8888");
        send.put("data come from server".getBytes());

    }
    //监听
    private void listen() throws IOException{
        while (true){
            selector.select();
            Set<SelectionKey> selectionKeys=selector.selectedKeys();
            Iterator<SelectionKey> iterator=selectionKeys.iterator();
            while (iterator.hasNext()){
                SelectionKey selectionKey=iterator.next();
                iterator.remove();
//                dealKey(selectionKey);
            }
        }
    }
    //处理请求
    private void dealKey(SelectionKey selectionKey){
//        ServerSocket
    }

}
