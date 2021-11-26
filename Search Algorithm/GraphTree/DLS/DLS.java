// package Algoritma_Search_Java.src.GraphTree.DLS;
import java.util.ArrayList;
import java.util.List;

// Simple Generic DLS
// Untuk graf berbentuk tree / tidak ada sirkuit
public class DLS<T> {
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
    private int limit= 5;

    void setLimit(int limit){
        this.limit= limit;
    }

    void setPeak(Node peak){
        this.peak= peak;
    }

    void search(T data){
        Node result= (this.peak.data==data)? this.peak : traverse(this.peak, data, 0);
        if(result!=null)System.out.println(result.data+" Ditemukan! Backtrack: "+ backtrack(result));
        else System.out.println("Data tidak ada");
    }

    Node traverse(Node node, T data, int limit){
        if(limit<=this.limit){
            for(Node n : node.child){
                if(n.data==data) return n;

                Node searchingChild= traverse(n, data, ++limit);
                if(searchingChild!=null) return searchingChild;
            }
        }
        return null;
    }

    String backtrack(Node node){
        return (node.parent==null)? node.data+"" : node.data+" <- "+backtrack(node.parent);
    }
    
}

