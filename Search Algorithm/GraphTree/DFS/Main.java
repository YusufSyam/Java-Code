// package Algoritma_Search_Java.src.GraphTree.DFS;

public class Main {
    public static void main(String[] args) {
        DFS<String> dfs= new DFS<>();
        
        DFS<String>.Node a= dfs.new Node("1");

        // Kiri a
        DFS<String>.Node b1= dfs.new Node("2");
        DFS<String>.Node c11= dfs.new Node("4");
        DFS<String>.Node d111= dfs.new Node("5");

        // Kanan a
        DFS<String>.Node b2= dfs.new Node("3");
        DFS<String>.Node c21= dfs.new Node("99");
        DFS<String>.Node c22= dfs.new Node("100");
        DFS<String>.Node d221= dfs.new Node("Donald Trump");
        
        a.addChild(b1);
        b1.addChild(c11);
        c11.addChild(d111);

        a.addChild(b2);
        b2.addChild(c21);
        b2.addChild(c22);
        c22.addChild(d221);

        dfs.setPeak(a);
        dfs.search("Donald Trump");
    }
}
