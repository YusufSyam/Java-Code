package LinkedList.DoublyLinkedList1;

import java.util.Scanner;

class Node{
    int data;
    Node nextNode;
    Node prevNode;

    public Node(){}

    public Node(int data){
        this.data= data;
    }

    public Node(int data, Node nextNode, Node prevNode){
        this.data= data;
        this.nextNode= nextNode;
        this.prevNode= prevNode;
    }
}

class DLL {
    Node head;
    Node tail;

    public DLL(){
        this.head= null;
    }

    public DLL(Node [] arrayNode){
        if(arrayNode.length==0) return;
        
        Node newNode= new Node();;
        Node tempNextNode= new Node();
        Node tempPrevNode= new Node();
        for(int i=0; i<arrayNode.length; i++){
            
            if(i==0) {
                tempNextNode= arrayNode[i+1];
                newNode= new Node(arrayNode[i].data, tempNextNode, null);
                this.head= newNode;
            }
            else {
                tempPrevNode= newNode;
                newNode= tempNextNode;
                newNode.prevNode= tempPrevNode;

                if(i<arrayNode.length-1){
                    tempNextNode= arrayNode[i+1];
                    newNode.nextNode= tempNextNode;
                }
                else{
                    newNode.nextNode= null;
                    this.tail= newNode;
                } 
            }
            // System.out.println("Current Node: "+newNode.data+", Next Node: "+ (newNode.nextNode==null? "null" : newNode.nextNode.data));
        }
    }

    public void insertHead(int data){
        Node newNode= new Node(data);

        if(this.head==null){
            this.head= newNode;
            this.head.nextNode= null;
        }
        else{
            newNode.nextNode= this.head;
            this.head.prevNode= newNode;

            if(this.tail==null) this.tail= this.head;

            this.head= newNode;
        }
        
        this.head.prevNode= null;
    }

    public void insertTail(int data){
        Node newNode= new Node(data);

        if(this.tail==null){
            this.tail= newNode;
            this.head.nextNode= tail;

        }else{
            newNode.prevNode= this.tail;
            this.tail.nextNode= newNode;
            this.tail= newNode;
        }

        this.tail.nextNode= null;
    }

    public void deleteHead(){
        if(this.head!=null) this.head= this.head.nextNode;
    }

    public void deleteTail(){
        if(this.tail!=null) this.tail= this.tail.prevNode;
    }

    public void deleteAt(int findIndex){
        if(head==null) return;
        if(findIndex==0) {
            deleteHead(); 
            return;
        }

        Node currNode= head;
        int totalIndex= 0;
        while(currNode.nextNode!=null){
            currNode= currNode.nextNode;
            totalIndex++;
        }

        if(totalIndex==findIndex) {
            deleteTail();
            return;
        }
        else if(totalIndex<findIndex) return;
        else{
            currNode= head;

            for(int i=0; i<totalIndex; i++){
                if(i==findIndex-1){
                    currNode.nextNode= currNode.nextNode.nextNode;
                    break;
                }
                currNode= currNode.nextNode;
            }
        }
        
    }

    public void printDLinkedList(){
        if(head==null) System.out.print("-- No Data --");
        else{
            System.out.print("<o-<>---   Print Double Linked List   ---<>-o>\n1. Normal Print\n2. Table Print (With Index)\n3. Table Print (With Prev and Next Node)\n>> "); 
            String input= new Scanner(System.in).nextLine();

            if(input.equals("1")) System.out.println(normalPrintDLinkedList(this.head));
            else if(input.equals("2")) System.out.println("\nIndex\t\tData\n"+tablePrintDLinkedList(head, 0));
            else if(input.equals("3")) System.out.println("\nPrev\t\tData\t\tNext\n"+fullPrintDLinkedList(head));
            
        }
    }

    public String normalPrintDLinkedList(Node node){
        if(node.nextNode==null) return node.data+"";
        return node.data+" -> "+normalPrintDLinkedList(node.nextNode);
    }

    public String tablePrintDLinkedList(Node node, int index){
        if(node.nextNode==null) return index+"\t\tnull\n";
        return index+"\t\t"+node.data+"\n"+tablePrintDLinkedList(node.nextNode, index+1);
    }

    public String fullPrintDLinkedList(Node node){
        if(node.nextNode==null) return node.prevNode.data+"\t\t"+node.data+"\t\tnull\n";
        else if(node.prevNode==null) return "null\t\t"+node.data+"\t\t"+node.nextNode.data+"\n"+fullPrintDLinkedList(node.nextNode);
        else return node.prevNode.data+"\t\t"+node.data+"\t\t"+node.nextNode.data+"\n"+fullPrintDLinkedList(node.nextNode);
    }

}

public class DoublyLinkedList {
    public static void main(String[] args) {
        Node[] arrNode= new Node[10];
        for(int i=0; i<arrNode.length; i++) arrNode[i]= new Node(i);

        DLL dll1= new DLL(arrNode);
        //System.out.println(dll1.head.nextNode.nextNode.nextNode.nextNode.nextNode.prevNode.data);
        //System.out.println(dll1.head.nextNode.nextNode.prevNode.data);
        // System.out.println(dll1.head.nextNode.nextNode==dll1.tail);
        // System.out.println(dll1.head.nextNode.nextNode.data);
        // System.out.println(dll1.tail.data);
        // dll1.printDLinkedList();
        // DLL dll2= new DLL();
        // // dll2.insertHead(0);
        // // dll2.printDLinkedList();
        // DLL dll3= new DLL();
        // dll3.insertHead(9);
        // dll3.insertHead(0);
        // dll3.insertHead(1);
        // dll3.insertTail(3);

        // System.out.println(dll3.tail.data);
        // System.out.print(dll3.tail.prevNode.data);
        // dll3.printDLinkedList();
        dll1.deleteAt(2);
        dll1.printDLinkedList();
    }
}
