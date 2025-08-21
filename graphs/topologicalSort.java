Topological Sort of a Graph

Approach 1:
1.	Initialize two arrays: one for incoming edges of each node, another for storing the result.
2.	Calculate the incoming edges for all nodes and store them in the array.
3.	Iterate over the incoming edges array. If the incoming edges of a node is zero:
	•	Insert it into the result array and increment the count.
	•	Decrement the incoming edges of all nodes connected to this node by 1.
	•	Set the incoming edges of the current node to -1 to mark it as visited.
4.	Repeat until all nodes are processed.
5.	Return the result.

Time Complexity: O(V^2+E)
Space Complexity: O(2V) ~ O(V)
  class Solution {
    public int[] topoSort(int V, List<List<Integer>> adj) {
        int incomingNodes[] = new int[V];
        int res[] = new int[V];

        // Count incoming edges for each node
        for (List<Integer> l : adj) {
            for (Integer i : l) {
                incomingNodes[i]++;
            }
        }

        int count = 0;
        while (count < V) {
            for (int i = 0; i < V; i++) {
                if (incomingNodes[i] == 0) {
                    res[count] = i;
                    count++;

                    // Decrement incoming edges for neighbors
                    for (int j : adj.get(i)) {
                        incomingNodes[j]--;
                    }
                    // Mark current node as visited
                    incomingNodes[i] = -1;
                }
            }
        }

        return res;
    }
}



