package LinkedList.CircularChecking;

class SSL extends LinkedList{

    public SSL(){super();}

    public SSL(Node [] arrayNode){
        if(arrayNode.length==0) return;
        
        Node newNode;
        Node tempNode= new Node();
        for(int i=0; i<arrayNode.length; i++){
            
            if(i==0) {
                tempNode= arrayNode[i+1];
                newNode= new Node(arrayNode[i].data, tempNode);
                super.head= newNode;
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

    @Override
    public void insertHead(int data){
        Node newNode= new Node(data);

        if(super.head==null){
            super.head= newNode;
            super.head.nextNode= null;
        }else{
            newNode.nextNode= super.head;
            super.head= newNode;
        }
    }

    @Override
    public void insertTail(int data){
        Node newNode= new Node(data);

        if(super.head==null){
            super.head= newNode;
            super.head.nextNode= null;
        }else{
            Node currNode= super.head;
            while(currNode.nextNode!=null){
                currNode= currNode.nextNode;
            }

            currNode.nextNode= newNode;
            newNode.nextNode= null;
        }
    }

    @Override
    public void deleteHead(){
        if(super.head!=null) super.head= super.head.nextNode;
    }

    @Override
    public void deleteTail(){
        if(super.head==null) return;
        else if(super.head.nextNode==null) super.head= null;
        else{ 
            Node currNode= super.head;
            while(currNode.nextNode.nextNode!=null){
                currNode= currNode.nextNode;
            }
            currNode.nextNode= null;
        }
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

public class SinglyLinkedList{

    public static void main(String[] args) {
        Node[] arrNode= new Node[5];
        for(int i=0; i<arrNode.length; i++) arrNode[i]= new Node(i+1);

        LinkedList ssl1= new SSL(arrNode);
        ssl1.printLinkedList();

        ssl1.deleteHead();
        ssl1.deleteTail();
        ssl1.deleteAt(1);
        ssl1.insertHead(111);
        ssl1.insertTail(999);

        ssl1.printLinkedList();
    }
}
