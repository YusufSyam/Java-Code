import java.util.ArrayList;
import java.util.Collections;

class Node{
    int data;
    Node(int data){this.data= data;}
}

public class tesTerkecilArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        
        //add elements to ArrayList
        arrL.add(53);
        arrL.add(67);
        arrL.add(89);
        arrL.add(43);
        arrL.add(87);
        arrL.add(71);
        arrL.add(63);
        arrL.add(45);
        arrL.add(69);
        arrL.add(53);
        
        /*
         * To find minimum value in ArrayList, use
         * min method of Collections class.
         */
        
        System.out.println( "ArrayList Min Value: " + Collections.min(arrL) );

        System.out.println("Indeksnya: "+arrL.indexOf(Collections.min(arrL)));
        arrL.set(arrL.indexOf(Collections.min(arrL)), 5);
        
        System.out.println(arrL.get(3));
        System.out.println(arrL.indexOf(Collections.min(arrL)));
        /*
         * To find maximum value in ArrayList, use
         * max method of Collections class.
         */
        
        System.out.println( "ArrayList Max Value: " + Collections.max(arrL) );

        System.out.println();
        
        ArrayList<Node> arrN = new ArrayList<Node>();
        ArrayList<Integer> listAngkaNode = new ArrayList<Integer>();

        Node a= new Node(5);
        listAngkaNode.add(a.data);

        Node b= new Node(50);
        listAngkaNode.add(b.data);

        Node c= new Node(500);
        listAngkaNode.add(c.data);

        arrN.add(a);
        arrN.add(b);
        arrN.add(c);

        System.out.println( "Node ArrayList Min Value: " + Collections.min(listAngkaNode) );
        System.out.println("Indeksnya: "+listAngkaNode.indexOf(Collections.min(listAngkaNode)));
    }
}
