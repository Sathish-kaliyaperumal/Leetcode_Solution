class Solution {
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n = amount.length;
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        
        // Step 1: Build the Tree Graph
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        // Step 2: Track Bob's Path
        int[] bobTime = new int[n];
        Arrays.fill(bobTime, Integer.MAX_VALUE);
        List<Integer> path = new ArrayList<>();
        
        // Fill Bob's path using DFS
        findBobPath(bob, -1, path, graph);

        // Mark the time Bob reaches each node
        for (int i = 0; i < path.size(); i++) {
            bobTime[path.get(i)] = i;
        }

        // Step 3: Calculate Maximum Profit for Alice
        return getAliceMaxScore(0, -1, 0, bobTime, graph, 0, amount);
    }

    private boolean findBobPath(int node, int parent, List<Integer> path, List<Integer>[] graph) {
        path.add(node);
        if (node == 0) return true;
        
        for (int neighbor : graph[node]) {
            if (neighbor != parent) {
                if (findBobPath(neighbor, node, path, graph)) return true;
            }
        }
        
        path.remove(path.size() - 1);
        return false;
    }

    private int getAliceMaxScore(int node, int parent, int currScore, int[] bobTime, List<Integer>[] graph, int time, int[] amount) {
        if (time < bobTime[node]) {
            // Alice reaches before Bob
            currScore += amount[node];
        } else if (time == bobTime[node]) {
            // Alice and Bob reach at the same time
            currScore += amount[node] / 2;
        }
        // If Bob reached first, Alice gets no reward (already handled with initial fill)

        // If leaf node (except root), return current score
        if (graph[node].size() == 1 && node != 0) return currScore;

        int maxScore = Integer.MIN_VALUE;
        for (int neighbor : graph[node]) {
            if (neighbor != parent) {
                maxScore = Math.max(maxScore, getAliceMaxScore(neighbor, node, currScore, bobTime, graph, time + 1, amount));
            }
        }

        return maxScore;
    }
}