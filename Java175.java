//Vertical Order Traversal of a Binary Tree
import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
class Java175
{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = verticalTraversal(root);
        System.out.println(result); 
    }
    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        // TreeMap to store nodes at each vertical level
        TreeMap<Integer, List<Integer>> verticalMap = new TreeMap<>();

        // Queue for level order traversal
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> colQueue = new LinkedList<>();

        // Enqueue the root
        nodeQueue.offer(root);
        colQueue.offer(0);

        // Perform level order traversal
        while (!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();
            Map<Integer, List<Integer>> levelMap = new HashMap<>();

            for (int i = 0; i < size; i++) {
                TreeNode current = nodeQueue.poll();
                int col = colQueue.poll();

                // Update the level map
                levelMap.computeIfAbsent(col, k -> new ArrayList<>()).add(current.val);

                // Enqueue the left child
                if (current.left != null) {
                    nodeQueue.offer(current.left);
                    colQueue.offer(col - 1);
                }

                // Enqueue the right child
                if (current.right != null) {
                    nodeQueue.offer(current.right);
                    colQueue.offer(col + 1);
                }
            }

            // Merge the level map with the vertical map
            for (Map.Entry<Integer, List<Integer>> entry : levelMap.entrySet()) {
                int col = entry.getKey();
                List<Integer> values = entry.getValue();
                verticalMap.computeIfAbsent(col, k -> new ArrayList<>()).addAll(values);
            }
        }

        // Convert the TreeMap to the final result
        for (List<Integer> values : verticalMap.values()) {
            result.add(values);
        }

        return result;
    }
}