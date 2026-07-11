class Solution {

    List<Integer>[] graph;
    boolean[] visited;

    int nodes;
    int degreeSum;

    public int countCompleteComponents(int n, int[][] edges) {

        graph = new ArrayList[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        visited = new boolean[n];

        int ans = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                nodes = 0;
                degreeSum = 0;

                dfs(i);

                int actualEdges = degreeSum / 2;
                int requiredEdges = nodes * (nodes - 1) / 2;

                if (actualEdges == requiredEdges)
                    ans++;
            }
        }

        return ans;
    }

    private void dfs(int node) {

        visited[node] = true;
        nodes++;

        degreeSum += graph[node].size();

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}

// ✅ Correct solution: Uses DFS to find connected components and checks if each forms a complete graph.
// Time Complexity: O(n + E) where n = number of nodes, E = number of edges.
// Space Complexity: O(n + E) for graph storage and recursion stack.
// Optimal solution - no better time complexity possible.

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna