// package Algoritma_Search_Java.src.GraphTree.DFS;
import java.util.ArrayList;
import java.util.List;

// Simple Generic DFS
// Untuk graf berbentuk tree / tidak ada sirkuit
public class DFS<T> {
    class Node {
        private T data;
        private Node parent;
        private List <Node> child;
    
        Node(T data){
            this.data= data;
            this.parent= null;
            this.child= new ArrayList<>();
        }
    
        void setParent(Node node){
            this.parent= node;
        }
    
        void addChild(Node node){
            this.child.add(node);
            node.setParent(this);
        }
    
    }

    private Node peak;

    void setPeak(Node peak){
        this.peak= peak;
    }

    void search(T data){
        Node result= (this.peak.data==data)? this.peak : traverse(this.peak, data);
        if(result!=null)System.out.println(result.data+" Ditemukan! Backtrack: "+ backtrack(result));
        else System.out.println("Data tidak ada");
    }

    Node traverse(Node node, T data){
        for(Node n : node.child){
            if(n.data==data) return n;
            
            // System.out.println(n.data);
            Node searchingChild= traverse(n, data);
            if(searchingChild!=null) return searchingChild;
        }
        return null;
    }

    String backtrack(Node node){
        return (node.parent==null)? node.data+"" : node.data+" <- "+backtrack(node.parent);
    }
    
}

