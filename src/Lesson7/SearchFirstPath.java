package Lesson7;

import java.util.LinkedList;

public abstract  class SearchFirstPath {
    protected boolean[] marked;
    protected int[] edgeTo;
    protected int source;

    public SearchFirstPath(Graph g, int source) {
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeTo = new int[g.getVertexCount()];
        sfs(g, source);
    }

    protected abstract void sfs(Graph g, int v);

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public LinkedList<Integer> pathTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = v;
        while(vertex != source){
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }

}
