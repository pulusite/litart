package tba.mianshi.code.stack_queue;


import java.util.Stack;

/**
 * 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作
 *
 * Created by zhangdong on 2018/12/8.
 */
public class Code0101 {
    private Stack<Integer> stackMin=new Stack();
    private Stack<Integer> stackData=new Stack<>();

    public Code0101() {
        this.stackMin = new Stack<Integer>();
        this.stackData = new Stack<Integer>();
    }

    public void push(int newNum){
        if (stackMin.isEmpty() || newNum<=stackMin.peek()){
            stackMin.push(newNum);
        }
        stackData.push(newNum);
    }

    public int pop(){
        if (stackData==null){
            throw new RuntimeException("stack is null");
        }
        int value=stackData.pop();
        if (value==getMin()){
            stackMin.pop();
        }
        return value;
    }

    public int getMin(){
        if (stackMin==null){
            throw new RuntimeException("stack is null");
        }
        return stackMin.peek();
    }


}
