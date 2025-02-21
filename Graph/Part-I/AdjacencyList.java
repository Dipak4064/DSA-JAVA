import java.util.ArrayList;

class AdjacencyList {
    static class Edge {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        /* 
         *              (5)
         *        0--------------1
         *                      /  \
         *                     /    \  
         *                (1) /      \(3)
         *                   /        \
         *                  /          \
                           2 -----------3
                           |    (2)
                           |
                           |
                        (2)|
                           |
                           |
                           4
        */
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V]; // Array of ArrayList
        // null -> empty arrayList
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        // Adding edges to the graph
        // vertex 0
        graph[0].add(new Edge(0, 1, 5));
        // vertex 1
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        // vertex 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 2));
        graph[2].add(new Edge(2, 4, 2));
        // vertex 3
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 2));
        // vertex 4
        graph[4].add(new Edge(4, 2, 2));

        // 2's neighbours
        System.out.print("2 -> ");
        for (Edge edge : graph[2]) {
            System.out.print(edge.dest + "-> ");
        }
        System.out.print("null");
        System.out.println();

        // Printing the graph
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (Edge edge : graph[i]) {
                System.out.print("[ " + edge.src + "," + edge.dest + "," + edge.weight + "] ");
            }
            System.out.println();
        }
    }
}