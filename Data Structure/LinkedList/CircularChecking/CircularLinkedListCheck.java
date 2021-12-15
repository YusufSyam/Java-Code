package LinkedList.CircularChecking;

// import LinkedList;
// import Node;

public class CircularLinkedListCheck {

    public static void main(String[] args) {
        Node[] arrNode= new Node[5];
        for(int i=0; i<arrNode.length; i++) arrNode[i]= new Node(i+1);
        
        LinkedList singly1= new SSL();
        System.out.println(isCircular(singly1));
        
        LinkedList singly2= new SSL(arrNode);
        System.out.println(isCircular(singly2));

        LinkedList doubly1= new DLL(arrNode);
        System.out.println(isCircular(doubly1));

        LinkedList circular1= new CLL(arrNode);
        System.out.println(isCircular(circular1));
    }

    public static boolean isCircular(LinkedList linkedList){
        if(linkedList.head==null) return true;
        if(!(linkedList.tail==null) && linkedList.tail.nextNode==linkedList.head) return true;

        int llSize= linkedList.countingSize();
        Node currNode= linkedList.head;

        for(int i=0; i<llSize; i++) currNode= currNode.nextNode;
        
        if(currNode!=null && currNode==linkedList.head) return true;
        
        return false;
    }

}
