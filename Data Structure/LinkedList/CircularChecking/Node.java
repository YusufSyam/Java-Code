package LinkedList.CircularChecking;

class Node{
    public int data;
    public Node nextNode;
    public Node prevNode;

    public Node(){
        this.nextNode= null;
        this.prevNode= null;
    }

    public Node(int data){
        this.data= data;
    }

    public Node(int data, Node nextNode){
        this.data= data;
        this.nextNode= nextNode;
    }

    public Node(int data, Node nextNode, Node prevNode){
        this.data= data;
        this.nextNode= nextNode;
        this.prevNode= prevNode;
    }
}
