//给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。 
//
// 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点
//。 
//
// 示例 1: 
//
// 
//输入: 
//	Tree 1                     Tree 2                  
//          1                         2                             
//         / \                       / \                            
//        3   2                     1   3                        
//       /                           \   \                      
//      5                             4   7                  
//输出: 
//合并后的树:
//	     3
//	    / \
//	   4   5
//	  / \   \ 
//	 5   4   7
// 
//
// 注意: 合并必须从两个树的根节点开始。 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 751 👎 0

package leetcode.editor.cn;
/**
 *java:合并二叉树
 *@author Gaosl
 *@DateTime 2021-08-24 19:21:58
 */
public class P617MergeTwoBinaryTrees{
    public static void main(String[] args){
        Solution solution = new P617MergeTwoBinaryTrees().new Solution();
    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode root = new TreeNode();
        return preOrder(root1,root2,root);
    }

    public TreeNode preOrder(TreeNode node1,TreeNode node2,TreeNode node){
        if (node1!=null||node2!=null) {
            if (node1==null){
                node=new TreeNode(node2.val);
                node.left= preOrder(null,node2.left,node.left);
                node.right= preOrder(null,node2.right,node.right);
            }else if (node2==null){
                node=new TreeNode(node1.val);
                node.left= preOrder(node1.left,null,node.left);
                node.right=preOrder(node1.right,null,node.right);
            }else{
                node=new TreeNode(node1.val+node2.val);
                node.left= preOrder(node1.left,node2.left,node.left);
                node.right=preOrder(node1.right,node2.right,node.right);
            }
        }else {
            return null;
        }
        return node;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}