import java.net.Socket;

// package Algoritma_Search_Java.src.GreedyBFS;

public class Main {
    public static void main(String[] args) {
        Node Arad= new Node("Arad",366);
        Node Zerind= new Node("Zerind",374);
        Node Timisoara= new Node("Timisoara",329);
        Node Oradea= new Node("Oradea",380);
        Node Lugoj= new Node("Lugoj",244);
        Node Sibiu= new Node("Sibiu",253);
        Node Mehadia= new Node("Mehadia",241);
        Node Dobreta= new Node("Dobreta",242);
        Node RimnicuViicea= new Node("RimnicuViicea",193);
        Node Fagaras= new Node("Fagaras",178);
        Node Craiova= new Node("Craiova",160);
        Node Pitesti= new Node("Pitesti",98);
        Node Bucharest= new Node("Bucharest",0);
        Node Giurgiu= new Node("Giurgiu",77);
        Node Urziceni= new Node("Urcizeni",80);

        Arad.addAdjacent(Zerind);
        Arad.addAdjacent(Timisoara);
        Arad.addAdjacent(Sibiu);
        Zerind.addAdjacent(Oradea);
        Timisoara.addAdjacent(Lugoj);
        Oradea.addAdjacent(Sibiu);
        Lugoj.addAdjacent(Mehadia);
        Sibiu.addAdjacent(RimnicuViicea);
        Sibiu.addAdjacent(Fagaras);
        Mehadia.addAdjacent(Dobreta);
        RimnicuViicea.addAdjacent(Craiova);
        RimnicuViicea.addAdjacent(Pitesti);
        Fagaras.addAdjacent(Bucharest);
        Dobreta.addAdjacent(Craiova);
        Pitesti.addAdjacent(Bucharest);
        Bucharest.addAdjacent(Giurgiu);
        Bucharest.addAdjacent(Urziceni);

        GreedyBFS greedy= new GreedyBFS();

        greedy.setStartAndFinish(Arad, Bucharest);
        greedy.search();
    }
}
