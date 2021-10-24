package Interview.DFS;

import java.util.List;
import java.util.Stack;

public class DFS {

    private Stack<Vertex> stack;

    public DFS() {
        this.stack = new Stack<>();
    }

    public void dfs(List<Vertex> vertexList){
        for(Vertex v : vertexList){
            if( !v.isVisited()){
                v.setVisited(true);
                dfsWithStack(v);
            }
        }
    }

    private void dfsWithStack(Vertex rootVerex){
        stack.add(rootVerex);
        rootVerex.setVisited(true);

        while( !stack.isEmpty()){

        }

    }
}
