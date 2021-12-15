package LinkedList.CircularChecking;

class DLL extends LinkedList{

    public DLL(){super();}

    public DLL(Node [] arrayNode){
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
                    newNode.nextNode= null;
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
            super.head.nextNode= null;
        }
        else{
            newNode.nextNode= super.head;
            super.head.prevNode= newNode;

            if(super.tail==null) super.tail= super.head;

            super.head= newNode;
        }
        
        super.head.prevNode= null;
    }

    @Override
    public void insertTail(int data){
        Node newNode= new Node(data);

        if(super.tail==null){
            super.tail= newNode;
            super.head.nextNode= tail;

        }else{
            newNode.prevNode= super.tail;
            super.tail.nextNode= newNode;
            super.tail= newNode;
        }

        super.tail.nextNode= null;
    }

    @Override
    public void deleteHead(){
        if(super.head!=null){
            super.head= super.head.nextNode;
            super.head.prevNode= null;
        }
    }

    @Override
    public void deleteTail(){
        if(super.tail!=null) super.tail= super.tail.prevNode;
    }

    @Override
    public void deleteAt(int findIndex){
        if(super.head==null) return;
        if(findIndex==0) {
            deleteHead(); 
            return;
        }

        int totalIndex= super.countingSize();

        if(totalIndex==findIndex) {
            deleteTail();
            return;
        }
        else if(totalIndex<findIndex) return;
        else{
            Node currNode= new Node();
            currNode= super.head;

            for(int i=0; i<totalIndex; i++){
                if(i==findIndex-1){
                    currNode.nextNode= currNode.nextNode.nextNode;
                    break;
                }
                currNode= currNode.nextNode;
            }
        }
        
    }

}

public class DoublyLinkedList {
    
    public static void main(String[] args) {
        Node[] arrNode= new Node[5];
        for(int i=0; i<arrNode.length; i++) arrNode[i]= new Node(i+1);

        LinkedList dll1= new DLL(arrNode);
        dll1.printLinkedList();

        dll1.deleteHead();
        dll1.deleteTail();
        dll1.deleteAt(1);
        dll1.insertHead(111);
        dll1.insertTail(999);

        dll1.printLinkedList();
    }
}
