package tba.mianshi;

import java.util.Stack;

/**
 * Created by zhangdong on 2018/6/19.
 */
public class TwoStack2Queue {

    Stack<Integer> stack1 = new Stack<Integer>();//入队列
    Stack<Integer> stack2 = new Stack<Integer>();//出队列

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.empty() && stack2.empty()) {
            throw new RuntimeException("Queue is empty!");
        }
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
