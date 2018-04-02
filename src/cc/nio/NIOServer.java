package cc.nio;

import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;

/**
 * Created by dongzhang on 5/21/17.
 */
public class NIOServer {
    private Selector selector;

    public void initServer(int port) throws Exception{
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.socket().bind(new InetSocketAddress(port));
        this.selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
    }

    public void listen() throws Exception{
        System.out.println("服务器端启动成功！");
        while (true){
            selector.select();
            Iterator ite = this.selector.selectedKeys().iterator();
        }
    }

    public static void main(String[] args) {

    }
}
