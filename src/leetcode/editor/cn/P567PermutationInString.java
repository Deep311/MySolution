//给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。 
//
// 换句话说，s1 的排列之一是 s2 的 子串 。 
//
// 
//
// 示例 1： 
//
// 
//输入：s1 = "ab" s2 = "eidbaooo"
//输出：true
//解释：s2 包含 s1 的排列之一 ("ba").
// 
//
// 示例 2： 
//
// 
//输入：s1= "ab" s2 = "eidboaoo"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s1.length, s2.length <= 104 
// s1 和 s2 仅包含小写字母 
// 
// Related Topics 哈希表 双指针 字符串 滑动窗口 
// 👍 405 👎 0

package leetcode.editor.cn;

import java.util.HashMap;

/**
 *java:字符串的排列
 *@author Gaosl
 *@DateTime 2021-08-16 17:28:25
 */
public class P567PermutationInString{
    public static void main(String[] args){
        Solution solution = new P567PermutationInString().new Solution();
        solution.checkInclusion("ab","eidboaoo");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i)-'a']--;
        }
        int left=0;
        for (int right = 0; right < s2.length(); right++) {
            int x=s2.charAt(right)-'a';
            arr[x]++;
            while (arr[x]>0){
                arr[s2.charAt(left)-'a']--;
                left++;
            }
            if (right-left+1==s1.length()) {
                return true;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}