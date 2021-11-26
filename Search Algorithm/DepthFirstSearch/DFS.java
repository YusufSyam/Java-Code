// package Algoritma_Search_Java.src.DepthFirstSearch;

import java.util.Stack;

// DFS using stack
public class DFS{

    private Stack <Node> stack= new Stack<>();

    void setPeak(Node peak){
        stack.push(peak);
    }

    void search(int data){
        Node hasilTraverse= traverse(data);
        if(hasilTraverse==null) System.out.println("Tidak ada data");
        else {
            System.out.println("Data ditemukan!\nBacktrack:");
            backtrack();
        }
    }

    void backtrack(){
        while(!this.stack.isEmpty()){
            if(this.stack.size()>1) System.out.print(this.stack.firstElement().data+" -> ");
            else System.out.println(this.stack.firstElement().data);
            this.stack.remove(0);
        }
    }

    Node traverse(int data){
        if(!this.stack.isEmpty()){
            Node node= this.stack.firstElement();

            if(!node.visited){
                node.visited();
                System.out.println("visited "+node.data);
            }

            if(node.data==data) return node;

            Node cariDiAdjacent= addingStack(node, data);
            if(cariDiAdjacent!=null) return cariDiAdjacent;

        }
        return null;
    }

    Node addingStack(Node node, int data){
        for (Node adjacentNode : node.adjacent) {
            if(!adjacentNode.isVisited()) {
                this.stack.push(adjacentNode);
                System.out.println("visited "+node.data);
                adjacentNode.visited();

                if(adjacentNode.data==data) return adjacentNode;

                Node cariDiAdjacent= addingStack(adjacentNode, data);
                if(cariDiAdjacent!=null) return cariDiAdjacent;
            }
        }
        this.stack.pop();
        return null;
    }
    
}

