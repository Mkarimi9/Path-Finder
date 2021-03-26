import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(10);
        g.addVertex("karachi");
        g.addVertex("hyderabad");
        g.addVertex("lahore");
        g.addVertex("islamabad");
        g.addVertex("peshawar");
        g.addVertex("quetta");
        g.addVertex("Gilgit");
        g.addVertex("faisalabad");
        g.addVertex("Sukkur");
        g.addVertex("multan");
        g.addEdge("karachi","hyderabad",164);
        g.addEdge("karachi","sukkur",475);
        g.addEdge("hyderabad","sukkur",319);
        g.addEdge("multan","sukkur",433);
        g.addEdge("lahore","peshawar",516);
        g.addEdge("karachi","quetta",689);
        g.addEdge("quetta","peshawar",840);
        g.addEdge("peshawar","gilgit",589);
        g.addEdge("multan","faisalabad",244);
        g.addEdge("multan","lahore",339);
        g.addEdge("faislabad","lahore",186);
        g.addEdge("faisalabad","islamabad",322);
        g.addEdge("lahore","islamabad",377);
       // g.display(1200);
//        Graph h = new Graph(10);
//        h.addVertex("karachi");
//        h.addVertex("hyderabad");
//        h.addVertex("lahore");
//        h.addVertex("peshawar");
//        h.addVertex("quetta");
//        h.addVertex("Gilgit");
//
//        h.addEdge("karachi","lahore");
//        h.addEdge("karachi","hyderabad");
//        h.addEdge("lahore","peshawar");
//        h.addEdge("karachi","quetta");
//        h.addEdge("quetta","peshawar");
//        h.addEdge("hyderabad","lahore");
//        h.addEdge("gilgit","peshawar");
        //h.display();
        System.out.println("*******************BFS**********************");
        g.Bst(g,new Vertex("peshawar"),new Vertex("hyderabad"));
        System.out.println();
        System.out.println("*********************************************");
        System.out.println("Shortest distance from .........");
        g.dijakstras(g,new Vertex("peshawar"),new Vertex("hyderabad"));
    }
}
