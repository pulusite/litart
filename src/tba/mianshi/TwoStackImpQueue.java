package tba.mianshi;

import java.util.Stack;

/**
 * Created by zhangdong on 5/2/18.
 */
public class TwoStackImpQueue {
    Stack<Integer> stackPush = new Stack<Integer>();
    Stack<Integer> stackPop = new Stack<Integer>();

    public void push(int node) {
        stackPush.push(node);
    }

    public int pop() {
        if (stackPush.empty() && stackPop.empty()) {
            throw new RuntimeException("Queue is empty!");
        }
        if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }
}
