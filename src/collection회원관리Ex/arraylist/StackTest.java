package collection회원관리Ex.arraylist;

import java.util.ArrayList;

class Stack{
    private ArrayList<String> StackarrayList = new ArrayList<String>();

    public void push(String data){
        StackarrayList.add(data);
    }

    public String pop(){
        if(StackarrayList.size() == 0){
            System.out.println("스택이 비어있습니다.");
            return null;
        }
        return StackarrayList.remove(StackarrayList.size()-1);
    }
}

public class StackTest {
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
