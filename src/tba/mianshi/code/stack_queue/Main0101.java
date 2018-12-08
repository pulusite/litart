package tba.mianshi.code.stack_queue;

import java.util.Stack;

/**
 * Created by zhangdong on 2018-12-07.
 */
public class Main0101 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public void push(int newNum){
        if (this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        } else if (newNum<=this.getMin()){
            this.stackData.push(newNum);
        }
    }

    public int pop(){
        if (this.stackData.isEmpty()){
            throw new RuntimeException("Your stack is empty.");
        }
        int value=this.stackData.pop();
        if (value==this.getMin()){
            this.stackMin.pop();
        }
        return value;
    }

    public int getMin(){
        if (this.stackMin.isEmpty()){
            throw new RuntimeException("Your stack is empty.");
        }
        return this.stackMin.peek();
    }
}