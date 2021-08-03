//给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。 
//
// 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-4,-1,0,3,10]
//输出：[0,1,9,16,100]
//解释：平方后，数组变为 [16,1,0,9,100]
//排序后，数组变为 [0,1,9,16,100] 
//
// 示例 2： 
//
// 
//输入：nums = [-7,-3,2,3,11]
//输出：[4,9,9,49,121]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 104 
// -104 <= nums[i] <= 104 
// nums 已按 非递减顺序 排序 
// 
//
// 
//
// 进阶： 
//
// 
// 请你设计时间复杂度为 O(n) 的算法解决本问题 
// 
// Related Topics 数组 双指针 排序 
// 👍 262 👎 0

package leetcode.editor.cn;
/**
 *java:有序数组的平方
 *@author Gaosl
 *@DateTime 2021-08-02 19:22:27
 */
public class P977SquaresOfASortedArray{
    public static void main(String[] args){
        Solution solution = new P977SquaresOfASortedArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int[] ans=new int[n];
        int index=nums.length-1;
        for (int i = 0,j=n-1; index>=0 ; index--) {
            if(nums[i]*nums[i]<=nums[j]*nums[j]){
                ans[index]=nums[j]*nums[j];
                j--;
            }else {
                ans[index]=nums[i]*nums[i];
                i++;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}