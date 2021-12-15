package LinkedList.SinglyLinkedList1;

class Node{
    int data;
    Node nextNode;

    public Node(){}

    public Node(int data){
        this.data= data;
    }

    public Node(int data, Node nextNode){
        this.data= data;
        this.nextNode= nextNode;
    }
}

class SSL {
    Node head;

    public SSL(){
        this.head= null;
    }

    public SSL(Node [] arrayNode){
        if(arrayNode.length==0) return;
        
        Node newNode;
        Node tempNode= new Node();
        for(int i=0; i<arrayNode.length; i++){
            
            if(i==0) {
                tempNode= arrayNode[i+1];
                newNode= new Node(arrayNode[i].data, tempNode);
                this.head= newNode;
            }
            else if(i!=arrayNode.length-1){
                newNode= tempNode;
                tempNode= arrayNode[i+1];
                newNode.nextNode= tempNode;
            }
            else newNode= new Node(arrayNode[i].data, null);
    
            // System.out.println("Current Node: "+newNode.data+", Next Node: "+ (newNode.nextNode==null? "null" : newNode.nextNode.data));
        }
    }

    public void insertHead(int data){
        Node newNode= new Node(data);

        if(this.head==null){
            head= newNode;
            head.nextNode= null;
        }else{
            newNode.nextNode= this.head;
            this.head= newNode;
        }
    }

    public void insertTail(int data){
        Node newNode= new Node(data);

        if(this.head==null){
            head= newNode;
            head.nextNode= null;
        }else{
            Node currNode= head;
            while(currNode.nextNode!=null){
                currNode= currNode.nextNode;
            }

            currNode.nextNode= newNode;
            newNode.nextNode= null;
        }
    }

    public void deleteHead(){
        if(head!=null) head= head.nextNode;
    }

    public void deleteTail(){
        if(head==null) return;
        else if(head.nextNode==null) head= null;
        else{ 
            Node currNode= head;
            while(currNode.nextNode.nextNode!=null){
                currNode= currNode.nextNode;
            }
            currNode.nextNode= null;
        }
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

    public void printSLinkedList(){
        if(head==null) System.out.print("No Data");
        else System.out.println(realPrintSLinkedList(this.head));
    }

    public String realPrintSLinkedList(Node node){
        if(node.nextNode==null) return node.data+"";
        return node.data+" -> "+realPrintSLinkedList(node.nextNode);
    }

}

public class SinglyLinkedList{

    public static void main(String[] args) {
        Node[] arrNode= new Node[10];
        for(int i=0; i<arrNode.length; i++) arrNode[i]= new Node(i);

        SSL ssl1= new SSL(arrNode);

        // ssl1.insertTail(1);
        // ssl1.insertHead(10);
        // ssl1.insertHead(7);
        // ssl1.insertHead(8);
        // ssl1.insertTail(99);
        // ssl1.printSLinkedList();
        // ssl1.deleteTail();
        // ssl1.printSLinkedList();
        // ssl1.deleteHead();
        
        // Indeks ssl saat melakukan deleteAt() dimulai dari nol
        ssl1.deleteAt(2);

        ssl1.printSLinkedList();
    }
}
