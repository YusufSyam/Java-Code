package Stack.StackLinkedList1;

class Node{
    int data;
    Node nextNode;

    Node(int data){
        this.data= data;
    }
}

class Stack{
    Node bottom;
    Node top;
    int maxData;
    int currSize= 0;

    Stack(){
        this.maxData= 5;
    }

    Stack(int maxData){
        this.maxData= maxData;
    }

    public void push(int data){
        if(!isFull()){
            System.out.println("Push(memasukkan) data dengan angka "+data+" ke stack Stack");
            Node newNode= new Node(data);

            if(currSize==0){
                this.bottom= newNode;
                this.bottom.nextNode= null;
                this.top= this.bottom;
            }else{
                this.top.nextNode= newNode;
                newNode.nextNode= null;
                this.top= newNode;
            }
            
            currSize++;
        }
        else System.out.println("Stack penuh, fungsi push() data "+data+" tidak dijalankan");
    }

    public void pop(){
        if(!isEmpty()) {
            System.out.println("Pop(mengeluarkan) data dengan angka "+this.top.data+" dari Stack");

            // Di sini saya menyadari seharusnya pointernya ke bawah saja bukan ke atas
            Node currNode= this.bottom;
            for(int i=0; i<currSize; i++){
                if(i==currSize-2 || currSize==1){
                    currNode.nextNode= null;
                    this.top= currNode;
                    currSize--;
                    break;
                }

                currNode= currNode.nextNode;
            }
        }
        else System.out.println("Stack kosong, fungsi pop() tidak dijalankan");
    }

    public void peek(){
        if(isEmpty()) System.out.println("Stack kosong dan tidak memiliki data top(paling atas)");
        else System.out.println("Data top(paling atas) pada Stack: "+top.data+ ((currSize==1)? ", dalam kasus ini data top dan bottom sama" : "")); 
    }

    public void bottomPeek(){
        if(isEmpty()) System.out.println("Stack kosong dan tidak memiliki data bottom(paliing bawah)");
        else System.out.println("Data bottom(paling bawah) pada Stack: "+bottom.data+ ((currSize==1)? ", dalam kasus ini data top dan bottom sama" : "")); 
    }

    public void display(){
        if(isEmpty()) System.out.print("-- Stack Kosong --");
        else{
            Node currNode= this.bottom;
            for(int i=0; i<currSize; i++){
                System.out.print(currNode.data+ ((i==currSize-1)? "\n" : " -> "));
                currNode= currNode.nextNode;
            }
        }
    }

    public boolean isEmpty(){ return currSize==0;}
    public boolean isFull(){ return currSize==maxData;}
    public int getSize(){ return maxData;}
    public int getCurrSize(){ return currSize;}
}

public class StackLinkedList {
    public static void main(String[] args) {
        Stack stack1= new Stack(8);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        stack1.push(7);
        stack1.pop();
        stack1.peek();
        // stack1.bottomPeek();
        // System.out.println(stack1.getSize());
        // System.out.println(stack1.getCurrSize());
        // stack1.pop();
        // stack1.pop();
        // stack1.pop();
        // stack1.peek();
        stack1.display();

    }
}
