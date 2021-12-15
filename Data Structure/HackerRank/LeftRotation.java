import java.util.Scanner;

class Arr{
    private class Node{
        private String data;
        private Node nextNode;

        Node(String data){
            this.data= data;
            this.nextNode= null;
        }
    }

    private int maxData, rotate;
    private Node head, tail;

    Arr(int maxData, int rotate){
        this.maxData= maxData;
        this.rotate= rotate;
        this.head= null;
        this.tail= null;
    }

    void fillArr(String[] arrData){
        if(this.maxData!=arrData.length) return;

        if(arrData.length>0) this.head= new Node(arrData[0]);

        Node currNode;
        Node prevNode= this.head;
        for(int i=1; i<arrData.length; i++){
            currNode= new Node(arrData[i]);
            prevNode.nextNode= currNode;
            prevNode= currNode;

            if(i==arrData.length-1) this.tail= currNode;
        }
    }

    void rotating(){
        for(int i=0; i<rotate; i++){
            Node oldHead= this.head;
            Node newHead= oldHead.nextNode;

            this.head= newHead;

            this.tail.nextNode= oldHead;
            this.tail= oldHead;
            this.tail.nextNode= null;
        }
    }

    public void print(){
        if(head==null) System.out.print("No Data");
        else System.out.println(realPrint(this.head));
    }

    public String realPrint(Node node){
        if(node.nextNode==null) return node.data+"";
        return node.data+" "+realPrint(node.nextNode);
    }

}

public class LeftRotation{
    public static void main(String[] args) {
        Scanner xx= new Scanner(System.in);

        String line1= xx.nextLine();
        String[] line1Value= line1.split(" ");
        
        Arr arr= new Arr(Integer.valueOf(line1Value[0]), Integer.valueOf(line1Value[1]));

        String line2= xx.nextLine();
        String[] line2Value= line2.split(" ");
        int [] line2IntegerValue= new int[line2Value.length];

        arr.fillArr(line2Value);

        arr.rotating();

        arr.print();
    }
}