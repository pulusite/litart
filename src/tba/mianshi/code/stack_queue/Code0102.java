package tba.mianshi.code.stack_queue;

import java.util.Stack;

/**
 * 编写一个雷，用两个栈实现队列，支持队列的基本操作（add, poll, peek）
 * Created by zhangdong on 2018/12/8.
 */
public class Code0102 {
    private Stack<Integer> stackOut;
    private Stack<Integer> stackStore;

    public Code0102() {
        this.stackOut = new Stack<>();
        this.stackStore = new Stack<>();
    }

    public void add(int newNum){
//        ？？？？？？ 为啥不需要这一块呢
//        if (!stackOut.isEmpty()){
//            while (!stackOut.isEmpty()){
//                stackStore.push(stackOut.pop());
//            }
//        }
        stackStore.push(newNum);
    }

    public int poll(){
        if (stackOut.empty() && stackStore.empty()){
            throw new RuntimeException("queue is empty");
        }
        if (stackOut.isEmpty()){
            while (!stackStore.isEmpty()){
                stackOut.push(stackStore.pop());
            }
        }
        return stackOut.pop();
    }

    public int peek(){
        if (stackOut.empty() && stackStore.empty()){
            throw new RuntimeException("queue is empty");
        }
        if (stackOut.isEmpty()){
            while (!stackStore.isEmpty()){
                stackOut.push(stackStore.pop());
            }
        }
        return stackOut.peek();
    }

}
