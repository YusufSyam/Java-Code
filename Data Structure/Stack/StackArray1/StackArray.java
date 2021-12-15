package Stack.StackArray1;

class Stack{
    private int [] arrData= new int[5];
    int currSize= 0;

    Stack(){}

    Stack(int dataSize){
        this.arrData= new int[dataSize];
    }

    public void push(int data){
        if(!isFull()) {
            System.out.println("Push(memasukkan) data dengan angka "+data+" ke stack Stack");
            arrData[currSize++]= data;
        }
        else System.out.println("Stack penuh, fungsi push() data "+data+" tidak dijalankan");
    }

    public void pop(){
        if(!isEmpty()) {
            System.out.println("Pop(mengeluarkan) data dengan angka "+this.arrData[currSize-1]+" dari Stack");
            this.arrData[--currSize]= 0;
        }
        else System.out.println("Stack kosong, fungsi pop() tidak dijalankan");
    }

    public void peek(){
        if(isEmpty()) System.out.println("Stack kosong dan tidak memiliki data top(paling atas)");
        else System.out.println("Data top(paling atas) pada Stack: "+arrData[currSize-1]); 
    }

    public void bottomPeek(){
        if(isEmpty()) System.out.println("Stack kosong dan tidak memiliki data bottom(paliing bawah)");
        else System.out.println("Data bottom(paling bawah) pada Stack: "+arrData[0]); 
    }

    public void display(){
        if(isEmpty()) System.out.print("-- Stack Kosong --");
        else
            for(int i=0; i<currSize; i++) System.out.print(arrData[i]+ ((i==currSize-1)? "\n" : " -> "));
    }
    
    public boolean isFull(){ return arrData.length==currSize;}
    public boolean isEmpty(){ return currSize==0;}
    public int getSize(){ return arrData.length+1;}
    public int getCurrSize(){ return currSize+1;}

}

public class StackArray {
    public static void main(String[] args) {
        Stack stack1= new Stack();
        // Stack stack1= new Stack(6);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        stack1.pop();
        stack1.peek();
        // System.out.println(stack1.getSize());
        // System.out.println(stack1.getCurrSize());
        stack1.display();
    }
}
