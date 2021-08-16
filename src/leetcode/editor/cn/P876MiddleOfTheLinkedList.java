//给定一个头结点为 head 的非空单链表，返回链表的中间结点。 
//
// 如果有两个中间结点，则返回第二个中间结点。 
//
// 
//
// 示例 1： 
//
// 
//输入：[1,2,3,4,5]
//输出：此列表中的结点 3 (序列化形式：[3,4,5])
//返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
//注意，我们返回了一个 ListNode 类型的对象 ans，这样：
//ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = 
//NULL.
// 
//
// 示例 2： 
//
// 
//输入：[1,2,3,4,5,6]
//输出：此列表中的结点 4 (序列化形式：[4,5,6])
//由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。
// 
//
// 
//
// 提示： 
//
// 
// 给定链表的结点数介于 1 和 100 之间。 
// 
// Related Topics 链表 双指针 
// 👍 378 👎 0

package leetcode.editor.cn;
/**
 *java:链表的中间结点
 *@author Gaosl
 *@DateTime 2021-08-13 16:45:18
 */
public class P876MiddleOfTheLinkedList{
    public static void main(String[] args){
        Solution solution = new P876MiddleOfTheLinkedList().new Solution();
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
//        ListNode temp = head;
//        ListNode[] nodes = new ListNode[100];
//        int i=0;
//        while (temp!=null){
//            nodes[i++]=temp;
//            temp=temp.next;
//        }
//        return nodes[i/2];
        ListNode temp1=head;
        ListNode temp2=head;
        while (temp1!=null&&temp1.next!=null){
            temp1=temp1.next.next;
            temp2=temp2.next;
        }
        return temp2;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}