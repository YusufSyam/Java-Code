package Queue;

// Queue Single Linked List
class Node{
    int data;
    Node nextNode;

    Node(int data){
        this.data= data;
    }
}

class Queue{
    Node front= null, rear= null;
    int currSize, capacity= 5;

    Queue(){}

    Queue(int capacity){
        this.capacity= capacity;
    }

    public void enqueue(int data){
        if(isFull()){
            dequeue();
            enqueue(data);
        }
        else{
            Node newNode= new Node(data);
            
            if(this.front==null){
                newNode.nextNode= null;
                this.front= newNode;

                if(this.rear==null) this.rear= newNode;
            }else{
                newNode.nextNode= this.rear;
                this.rear= newNode;
            }
            
            currSize++;
        }

    }

    public void dequeue(){
        if(!isEmpty()){
            Node currNode= this.rear;
            for(int i=0; i<currSize-2; i++) currNode= currNode.nextNode;

            currNode.nextNode= null;
            this.front= currNode;

            currSize--;
        }
    }

    public void display(){
        if(isEmpty()) System.out.print("-- Stack Kosong --");
        else{
            Node currNode= this.rear;
            for(int i=0; i<currSize; i++){
                System.out.print(currNode.data+ ((i==currSize-1)? "\n" : " -> "));
                currNode= currNode.nextNode;
            }
        }
    }

    public boolean isEmpty(){ return currSize==0; }
    public boolean isFull(){ return currSize==capacity; }
}

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue q1= new Queue();

        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
        q1.display();

        q1.enqueue(6);
        q1.display();

        q1.enqueue(7);
        q1.enqueue(8);
        q1.enqueue(9);
        q1.enqueue(10);
        q1.display();

        q1.dequeue();
        q1.display();
    }
}
