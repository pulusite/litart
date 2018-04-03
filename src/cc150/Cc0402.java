package cc150;

import java.util.LinkedList;

/**
 * Created by zhangdong on 8/20/17.
 * 有向图，两个结点之间是否存在一条路径
 * 广度优先搜索
 */
public class Cc0402 {
    public enum State {
        Unvisited, Visited, Visiting;
    }

    public static boolean search(Graph g,Node start, Node end){
        LinkedList<Node> q = new LinkedList<Node>();
//        for (Node u : g.getNodes()){
//            u.state = State.Unvisited;//标记所有结点未读
//        }
//        start.state= State.Visiting;
//        q.add(start);
//        Node u;
//        while (!q.isEmpty()){
//            u=q.removeFirst();
//            if (u!=null){
//                for (Node v : u.getAdjacent()){
//                    if (v.state==State.Unvisited){
//                        if (v== end){
//                            return true;
//                        } else {
//                            v.state=State.Visiting;
//                            q.add(v);
//                        }
//                    }
//                }
//                u.state=State.Visited;
//            }
//        }
        return false;
    }

}
