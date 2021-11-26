// package Algoritma_Search_Java.src.DepthFirstSearch;

public class Main {
    public static void main(String[] args) {
        BFS bfs= new BFS();

        Node A= new Node(1);
        Node B= new Node(2);
        Node C= new Node(3);
        Node D= new Node(4);
        Node E= new Node(5);
        Node F= new Node(6);
        Node G= new Node(7);
        Node H= new Node(8);
        Node I= new Node(9);
        Node J= new Node(10);
        Node K= new Node(11);
        Node L= new Node(12);

        A.addAdjacent(C);
        A.addAdjacent(E);
        A.addAdjacent(F);
        A.addAdjacent(I);
        B.addAdjacent(D);
        B.addAdjacent(F);
        B.addAdjacent(H);
        C.addAdjacent(E);
        C.addAdjacent(F);
        C.addAdjacent(G);
        C.addAdjacent(H);
        D.addAdjacent(J);
        E.addAdjacent(G);
        I.addAdjacent(K);
        I.addAdjacent(L);
        K.addAdjacent(L);

        bfs.setPeak(E);
        bfs.search(10);
    }
}
