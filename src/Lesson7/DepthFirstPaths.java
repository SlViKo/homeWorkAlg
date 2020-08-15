package Lesson7;

import java.util.LinkedList;

public class DepthFirstPaths extends SearchFirstPath {

    public DepthFirstPaths(Graph g, int source) {
        super(g, source);
    }

    @Override
    protected void sfs(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                sfs(g, w);
            }
        }
    }

}
