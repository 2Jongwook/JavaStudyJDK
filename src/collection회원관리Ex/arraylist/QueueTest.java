package collection회원관리Ex.arraylist;

import java.util.ArrayList;
import java.util.Queue;

class MyQueue {

    ArrayList<String> arrayList = new ArrayList<String>();

    public void enQueue(String data){
        arrayList.add(data);
    }

    public String deQueue(){
        if(arrayList.size() == 0){
            System.out.println("큐가 비어있습니다.");
            return null;
        }

        return arrayList.remove(0);
    }
}

public class QueueTest {
    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();

        myQueue.enQueue("A");
        myQueue.enQueue("B");
        myQueue.enQueue("C");

        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
    }
}
