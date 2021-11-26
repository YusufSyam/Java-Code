import java.util.ArrayList;
import java.util.List;

class Node{
    String data;
    boolean visited;
    Node traversedBefore;
    int heuristik;
    List<Node> adjacent;

    Node(String data, int heuristik){
        this.data= data;
        this.visited= false;
        this.traversedBefore= null;
        this.adjacent= new ArrayList<>();
        
        this.setHeuristik(heuristik);
    }

    boolean isVisited(){
        return visited;
    }

    void visited(){
        this.visited= true;
    }

    void setHeuristik(int heuristik){
        // Karna hanya contoh, kita pakai fungsi heuristik yang simpel
        this.heuristik= heuristik;
    }

    int getHeuristik(){
        return this.heuristik;
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