// package Algoritma_Search_Java.src.GraphTree.DLS;

public class Main {
    public static void main(String[] args) {
        DLS<String> dls= new DLS<>();
        dls.setLimit(3);
        
        DLS<String>.Node a= dls.new Node("1");

        // Kiri a
        DLS<String>.Node b1= dls.new Node("2");
        DLS<String>.Node c11= dls.new Node("4");
        DLS<String>.Node d111= dls.new Node("5");

        // Kanan a
        DLS<String>.Node b2= dls.new Node("3");
        DLS<String>.Node c21= dls.new Node("99");
        DLS<String>.Node c22= dls.new Node("100");
        DLS<String>.Node d221= dls.new Node("Donald Trump");
        
        a.addChild(b1);
        b1.addChild(c11);
        c11.addChild(d111);

        a.addChild(b2);
        b2.addChild(c21);
        b2.addChild(c22);
        c22.addChild(d221);

        dls.setPeak(a);
        dls.search("Donald Trump");
    }
}
