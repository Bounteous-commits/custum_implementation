import java.util.*;

class circular{
    private int[] queue;
    private int front,rear,size,capacity;
    public circular(int capacity){
        this.capacity=capacity;
        queue=new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return capacity==size;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }

        rear=(rear+1)%capacity;
        queue[rear]=data;
        size++;
        System.out.println(data + "inserted");
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        int removed=queue[front];
        if(front==rear){
            front=0;
            rear=-1;

        }else{
            front=(front+1)%capacity;
        }
        size--;
        System.out.println("the removed element" + removed);
    }
}
class circular_queue{
    public static void main(String args[]){
        circular c=new circular(10);

    }
}