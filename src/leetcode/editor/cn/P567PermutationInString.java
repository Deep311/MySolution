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
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (map.containsKey(s1.charAt(i))) {
                map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
            }else {
                map.put(s1.charAt(i),1);
            }
        }
        HashMap<Character, Integer> map1 =map;
        for (int i = 0; i < s2.length(); i++) {
            if (map1.containsKey(s2.charAt(i))) {
                if (map1.get(s2.charAt(i))>1) {
                    map1.put(s2.charAt(i),map1.get(s2.charAt(i))-1);
                }else {
                    map1.remove(s2.charAt(i));
                }
            }
            if (map1.isEmpty()) {
                return true;
            }
            map1=map;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}