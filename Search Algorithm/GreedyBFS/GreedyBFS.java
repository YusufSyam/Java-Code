import java.util.ArrayList;
import java.util.Collections;

// package Algoritma_Search_Java.src.GreedyBFS;

public class GreedyBFS {
    Node startNode, goalNode;
    
    ArrayList <Node> nodeList= new ArrayList<Node>();
    ArrayList <Integer> heuristikNodeList= new ArrayList<Integer>();

    void setStartAndFinish(Node startNode, Node goalNode){
        this.startNode= startNode;
        this.goalNode= goalNode;

        // Pada kasus ini heuristik goal node harus 0
        this.goalNode.setHeuristik(0);

        this.nodeList.add(this.startNode);
        this.heuristikNodeList.add(this.startNode.getHeuristik());
    }

    void search(){
        Node hasilTraverse= traverse();
        if(hasilTraverse==null) System.out.println("Tidak ada data");
        else {
            System.out.println(goalNode.data+" ditemukan!\nBacktrack:");
            System.out.println(backtrack(hasilTraverse));
        }
    }

    Node traverse(){
        while(!this.nodeList.isEmpty()){
            int minIndex= this.heuristikNodeList.indexOf(Collections.min(this.heuristikNodeList));
            Node node= this.nodeList.get(minIndex);
            node.visited();

            System.out.println("Sekarang berada di: "+backtrack(node));

            if(node.data==this.goalNode.data) return node;
            
            for (Node adjacentNode : node.adjacent) {
                if(!adjacentNode.isVisited()) {
                    adjacentNode.setHeuristik(adjacentNode.getHeuristik()+node.getHeuristik());

                    this.nodeList.add(adjacentNode);
                    this.heuristikNodeList.add(adjacentNode.getHeuristik());

                    node.through(adjacentNode);
                    adjacentNode.visited();
                }
            }
            
            this.nodeList.remove(node);
            this.heuristikNodeList.remove(this.heuristikNodeList.get(minIndex));
        }

        return null;
    }

    String backtrack(Node node){
        if(node.traversedBefore!=null) return node.data+" dari "+ backtrack(node.traversedBefore);
        else return node.data+"";
    }

    // Node addingNodeList(Node node, int data){
    //     for (Node adjacentNode : node.adjacent) {
    //         if(!adjacentNode.isVisited()) {
    //             this.nodeList.push(adjacentNode);
    //             adjacentNode.visited();

    //             if(adjacentNode.data==data) return adjacentNode;

    //             Node cariDiAdjacent= addingNodeList(adjacentNode, data);
    //             if(cariDiAdjacent!=null) return cariDiAdjacent;
    //         }
    //     }
    //     this.nodeList.pop();
    //     return null;
    // }
}
