import java.util.ArrayList;

public class hasPath {
    static class Edge {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {// TC: O(V+E) SC: O(V)
        for (int i = 0; i < graph.length; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

    }    

    public static boolean pathFind(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis) {// TC O(V+E) SC O(V)
        if (src == dest)
            return true;
        vis[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!vis[e.dest]) {
                if (pathFind(graph, e.dest, dest, vis))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*
         * 
         *   1------3
         *  /       | \
         * 0        |  5-----6
            \       | /
             2 ---- 4
         */
        int v = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(pathFind(graph, 0, 6, new boolean[v]));
    }
}
