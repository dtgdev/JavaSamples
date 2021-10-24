package Algorithm;

import java.util.Stack;

public class Stack2 extends Stack<Integer> {

    //2,1,3,4
    Stack<Integer>  s2;

    public Stack2() {
        this.s2 = new Stack();

    }

    void push(int value){
        if ( min(value)){
            s2.push(value);//2 ,1
        }
        super.push(value); //3,2,1,4
    }

    boolean min(int value){
        if(s2.empty()){
            return true;
        }else {
            if(value < s2.peek()){
                return true;
            }else
                return false;
        }

    }
}
