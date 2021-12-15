package LinkedList.CircularLinkedList1;

// Circular Double Linked List

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

class CLL {
    Node head;
    Node tail;

    public CLL(){}

    public CLL(Node [] arrayNode){
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
                    newNode.nextNode= this.head;
                    this.head.prevNode= newNode;
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
            this.head.nextNode= newNode;
            this.head.prevNode= newNode;
            this.tail= this.head;
            this.tail.nextNode= this.head;
            this.tail.prevNode= this.head;
        }else{
            newNode.nextNode= this.head;
            this.head.prevNode= newNode;

            if(this.tail==null) this.tail= this.head;

            this.head= newNode;
            this.head.prevNode= this.tail;
            this.tail.nextNode= this.head;
        }
    }

    public void insertTail(int data){
        Node newNode= new Node(data);

        if(this.head==null) {
            this.head= newNode;
            this.head.nextNode= newNode;
            this.head.prevNode= newNode;
            this.tail= this.head;
            this.tail.nextNode= this.head;
            this.tail.prevNode= this.head;
        }
        else if(this.tail==null){
            this.tail= newNode;
            this.tail.nextNode= head;
            this.tail.prevNode= head;
            this.head.nextNode= tail;
            this.head.prevNode= tail;
        }else{
            newNode.prevNode= this.tail;
            this.tail.nextNode= newNode;
            this.tail= newNode;
            this.tail.nextNode= head;
            this.head.prevNode= this.tail;
        }
    }

    public void deleteHead(){
        if(this.head.nextNode==this.head) this.head= null;
        else if(this.head.nextNode==this.tail){
            this.head= this.tail;
            this.head.nextNode= this.tail;
            this.head.prevNode= this.tail;
        }
        else if(this.head!=null){
            this.head= this.head.nextNode;
            this.head.prevNode= this.tail;
            this.tail.nextNode= this.head;
        }
    }

    public void deleteTail(){
        if(this.tail.prevNode==this.tail) this.head= null;
        else if(this.tail.prevNode==this.head){
            this.tail= this.head;
            this.tail.nextNode= this.head;
            this.tail.prevNode= this.head;
        }
        else if(this.tail!=null){
            this.tail= this.tail.prevNode;
            this.tail.nextNode= this.head;
            this.head.prevNode= this.tail;
        }
    }

    public void deleteAt(int findIndex){
        if(head==null) return;
        if(findIndex==0 || this.head.nextNode==this.head) {
            deleteHead(); 
            return;
        }

        Node currNode= head;
        int totalIndex= 0;
        while(currNode.nextNode!=head){
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
                if(i==findIndex){
                    Node tempPrevNode= currNode.prevNode;
                    Node tempNextNode= currNode.nextNode;
                    tempPrevNode.nextNode= tempNextNode;
                    break;
                }
                currNode= currNode.nextNode;
            }
        }
        
    }

    public void printCLinkedList(){
        if(head==null) System.out.print("-- No Data --");
        else{
            // System.out.print("<o-<>---   Print Double Linked List   ---<>-o>\n1. Normal Print\n2. Table Print (With Index)\n3. Table Print (With Prev and Next Node)\n>> "); 
            // String input= new Scanner(System.in).nextLine();

            // if(input.equals("1")) System.out.println(normalPrintCLinkedList(this.head));
            // else if(input.equals("2")) System.out.println("\nIndex\t\tData\n"+tablePrintCLinkedList(head, 0));
            // else if(input.equals("3")) System.out.println("\nPrev\t\tData\t\tNext\n"+fullPrintCLinkedList(head));

            System.out.println(normalPrintCLinkedList(this.head));
            
        }
    }

    public String normalPrintCLinkedList(Node node){
        if(node==this.tail || node==node.nextNode) return node.data+"";
        return node.data+" -> "+normalPrintCLinkedList(node.nextNode);
    }

    // public String tablePrintCLinkedList(Node node, int index){
    //     if(node.nextNode==null) return index+"\t\tnull\n";
    //     return index+"\t\t"+node.data+"\n"+tablePrintCLinkedList(node.nextNode, index+1);
    // }

    // public String fullPrintCLinkedList(Node node){
    //     if(node.nextNode==null) return node.prevNode.data+"\t\t"+node.data+"\t\tnull\n";
    //     else if(node.prevNode==null) return "null\t\t"+node.data+"\t\t"+node.nextNode.data+"\n"+fullPrintCLinkedList(node.nextNode);
    //     else return node.prevNode.data+"\t\t"+node.data+"\t\t"+node.nextNode.data+"\n"+fullPrintCLinkedList(node.nextNode);
    // }

}

public class CircularLinkedList {
    public static void main(String[] args) {
        CLL cll1= new CLL();

        cll1.insertHead(99);
        cll1.insertHead(98);
        cll1.insertHead(97);
        cll1.insertTail(1);
        cll1.insertTail(2);
        cll1.insertHead(5);
        cll1.insertTail(77);
        cll1.insertHead(1);
        // System.out.println(cll1.tail.data);
        // cll1.insertHead(2);
        // cll1.insertTail(5);
        cll1.printCLinkedList();
        // System.out.println(cll1.head.prevNode.prevNode.data);
        // System.out.print(cll1.tail.data);
        // cll1.deleteHead();
        // cll1.deleteTail();
        // System.out.println(cll1.head.prevNode.data);
        // System.out.println(cll1.tail.nextNode.data);
        // cll1.deleteTail();
        cll1.deleteAt(7);
        cll1.printCLinkedList();
    }
}
