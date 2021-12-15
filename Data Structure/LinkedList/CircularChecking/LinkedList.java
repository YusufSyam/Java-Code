package LinkedList.CircularChecking;

// import Node;

public abstract class LinkedList {
    protected Node head, tail;

    LinkedList(){
        this.head= null;
        this.tail= null;
    }

    public abstract void deleteHead();
    public abstract void deleteTail();
    public abstract void deleteAt(int data);
    public abstract void insertHead(int data);
    public abstract void insertTail(int data);

    protected int countingSize(){
        if(this.head==null) return 0;
        if(this.head.nextNode==null) return 1;

        Node currNode= this.head;
        int totalIndex= 0;
        while(currNode.nextNode!=null){
            currNode= currNode.nextNode;
            totalIndex++;
        }

        return ++totalIndex;
    }

    public void printLinkedList(){
        if(this.head==null) System.out.println("-- No Data --");
        else System.out.println(executePrintLinkedList(this.head));
    }

    public String executePrintLinkedList(Node node){
        if(node.nextNode==null) return node.data+"";
        return node.data+" -> "+executePrintLinkedList(node.nextNode);
    }

    // public void indexPrintLinkedList(){
    //     if(this.head==null) System.out.println("-- No Data --");
    //     else System.out.println(executeIndexPrintLinkedList(this.head, 0));
    // }

    // public String executeIndexPrintLinkedList(Node node, int index){
    //     if(node.nextNode==null) return index+"\t\tnull\n";
    //     return index+"\t\t"+node.data+"\n"+executeIndexPrintLinkedList(node.nextNode, index+1);
    // }
}
