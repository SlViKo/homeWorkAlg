package Lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(1,2);
        graph.addEdge(0,4);
        graph.addEdge(1,4);
        graph.addEdge(3,4);
        graph.addEdge(2,4);

//        System.out.println(graph.getAdjList(1));
//
//        DepthFirstPaths dfp = new DepthFirstPaths(graph, 2 );
//        System.out.println(dfp.hasPathTo(0));
//        System.out.println(dfp.pathTo(0));
//        System.out.println(dfp.hasPathTo(3));


        BreadthFirstPath bfp = new BreadthFirstPath(graph, 2);
        System.out.println(bfp.hasPathTo(0));
        System.out.println(bfp.pathTo(0));
        System.out.println(bfp.hasPathTo(3));

        Graph graphHomeWork = new Graph(11);

        graphHomeWork.addEdge(10, 0);
        graphHomeWork.addEdge(0, 4);
        graphHomeWork.addEdge(0, 5);
        graphHomeWork.addEdge(5, 9);
        graphHomeWork.addEdge(9, 3);
        graphHomeWork.addEdge(0, 3);
        graphHomeWork.addEdge(3, 6);
        graphHomeWork.addEdge(6, 1);
        graphHomeWork.addEdge(8, 1);
        graphHomeWork.addEdge(8, 9);
        graphHomeWork.addEdge(6, 7);
        graphHomeWork.addEdge(2, 7);

        SearchFirstPath sfp = new BreadthFirstPath(graphHomeWork, 4);

        System.out.println(sfp.pathTo(8));
        System.out.println("Количество шагов до 8 угла: " + sfp.pathTo(8).size());




    }
}
