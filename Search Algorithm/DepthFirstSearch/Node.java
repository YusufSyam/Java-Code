// package Algoritma_Search_Java.src.DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    boolean visited;
    List<Node> adjacent;

    Node(int data){
        this.data= data;
        this.visited= false;
        this.adjacent= new ArrayList<>();
    }

    boolean isVisited(){
        return visited;
    }

    void visited(){
        this.visited= true;
    }

    void addAdjacent(Node node){
        this.adjacent.add(node);
        node.adjacent.add(this);
    }
}