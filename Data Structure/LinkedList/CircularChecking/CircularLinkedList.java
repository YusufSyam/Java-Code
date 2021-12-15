package LinkedList.CircularChecking;

// Circular Double Linked List
class CLL extends LinkedList{
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
                super.head= newNode;
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
                    newNode.nextNode= super.head;
                    super.head.prevNode= newNode;
                    super.tail= newNode;
                } 
            }
            // System.out.println("Current Node: "+newNode.data+", Next Node: "+ (newNode.nextNode==null? "null" : newNode.nextNode.data));
        }
    }

    @Override
    public void insertHead(int data){
        Node newNode= new Node(data);

        if(super.head==null){
            super.head= newNode;
            super.head.nextNode= newNode;
            super.head.prevNode= newNode;
            super.tail= super.head;
            super.tail.nextNode= super.head;
            super.tail.prevNode= super.head;
        }else{
            newNode.nextNode= super.head;
            super.head.prevNode= newNode;

            if(super.tail==null) super.tail= super.head;

            super.head= newNode;
            super.head.prevNode= super.tail;
            super.tail.nextNode= super.head;
        }
    }

    @Override
    public void insertTail(int data){
        Node newNode= new Node(data);

        if(super.head==null) {
            super.head= newNode;
            super.head.nextNode= newNode;
            super.head.prevNode= newNode;
            super.tail= super.head;
            super.tail.nextNode= super.head;
            super.tail.prevNode= super.head;
        }
        else if(super.tail==null){
            super.tail= newNode;
            super.tail.nextNode= head;
            super.tail.prevNode= head;
            super.head.nextNode= tail;
            super.head.prevNode= tail;
        }else{
            newNode.prevNode= super.tail;
            super.tail.nextNode= newNode;
            super.tail= newNode;
            super.tail.nextNode= head;
            super.head.prevNode= super.tail;
        }
    }

    @Override
    public void deleteHead(){
        if(super.head.nextNode==super.head) super.head= null;
        else if(super.head.nextNode==super.tail){
            super.head= super.tail;
            super.head.nextNode= super.tail;
            super.head.prevNode= super.tail;
        }
        else if(super.head!=null){
            super.head= super.head.nextNode;
            super.head.prevNode= super.tail;
            super.tail.nextNode= super.head;
        }
    }

    @Override
    public void deleteTail(){
        if(super.tail.prevNode==super.tail) super.head= null;
        else if(super.tail.prevNode==super.head){
            super.tail= super.head;
            super.tail.nextNode= super.head;
            super.tail.prevNode= super.head;
        }
        else if(super.tail!=null){
            super.tail= super.tail.prevNode;
            super.tail.nextNode= super.head;
            super.head.prevNode= super.tail;
        }
    }

    @Override
    protected int countingSize(){
        if(this.head==null) return 0;
        if(this.head.nextNode==null) return 1;

        Node currNode= this.head;
        int totalIndex= 0;
        
        System.out.println("Head = "+this.head.data);
        while(currNode.nextNode!=head){
            currNode= currNode.nextNode;
            totalIndex++;
        }

        return ++totalIndex;
    }

    @Override
    public void deleteAt(int findIndex){
        if(super.head==null) return;
        if(findIndex==0 || super.head.nextNode==super.head) {
            deleteHead(); 
            return;
        }
        System.out.println("uwau");

        int totalIndex= this.countingSize();

        if(totalIndex==findIndex) {
            deleteTail();
            return;
        }
        else if(totalIndex<findIndex) return;
        else{
            Node currNode= super.head;

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

    @Override
    public String executePrintLinkedList(Node node){
        if(node==this.tail || node==node.nextNode) return node.data+"";
        return node.data+" -> "+executePrintLinkedList(node.nextNode);
    }

}

public class CircularLinkedList {
    
    public static void main(String[] args) {
        Node[] arrNode= new Node[5];
        for(int i=0; i<arrNode.length; i++) arrNode[i]= new Node(i+1);

        LinkedList ccl1= new CLL(arrNode);
        ccl1.printLinkedList();

        ccl1.deleteHead();
        ccl1.printLinkedList();
        ccl1.deleteTail();
        ccl1.printLinkedList();
        ccl1.deleteAt(1);
        ccl1.printLinkedList();
        ccl1.insertHead(111);
        ccl1.printLinkedList();
        ccl1.insertTail(999);

        ccl1.printLinkedList();
    }
}
