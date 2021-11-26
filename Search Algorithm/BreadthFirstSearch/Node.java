import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    boolean visited;
    Node traversedBefore;
    List<Node> adjacent;

    Node(int data){
        this.data= data;
        this.visited= false;
        this.traversedBefore= null;
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

    void through(Node node){
        node.setTraversedBefore(this);
    }

    void setTraversedBefore(Node node){
        this.traversedBefore= node;
    }
}