import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.ArrayList;

// BFS using queue
public class BFS{
    class MyQueue<V> extends LinkedList<V> implements Queue<V>{
        
    }

    MyQueue <Node> queue= new MyQueue<Node>();

    void setPeak(Node peak){
        this.queue.add(peak);
    }

    void search(int data){
        Node hasilTraverse= traverse(data);
        if(hasilTraverse==null) System.out.println("Tidak ada data");
        else {
            System.out.println("Data ditemukan!\nBacktrack:");
            System.out.println(backtrack(hasilTraverse));
        }
    }

    String backtrack(Node node){
        if(node.traversedBefore!=null) return node.data+" <- "+ backtrack(node.traversedBefore);
        else return node.data+"";
    }

    Node traverse(int data){
        while(!this.queue.isEmpty()){
            Node node= this.queue.getFirst();
            node.visited();
            System.out.println("Menelusuri "+node.data+" ...");
            // System.out.println(node.data);

            if(node.data==data) return node;

            for(Node adjacentNode : node.adjacent){
                if(!adjacentNode.isVisited()) {
                    this.queue.add(adjacentNode);
                    System.out.println("Nge-add "+adjacentNode.data);

                    node.through(adjacentNode);
                    adjacentNode.visited();
                }
            }

            this.queue.remove();

        }
        return null;
    }

    // Node addingQueue(Node node, int data){
    //     for (Node adjacentNode : node.adjacent) {
    //         if(!adjacentNode.isVisited()) {
    //             this.queue.add(adjacentNode);
    //             System.out.println(adjacentNode.data);
    //             adjacentNode.visited();

    //             if(adjacentNode.data==data) return adjacentNode;

    //             Node cariDiAdjacent= addingQueue(adjacentNode, data);
    //             if(cariDiAdjacent!=null) return cariDiAdjacent;
    //         }
    //     }
    //     this.queue.poll();
    //     return null;
    // }
    
}

