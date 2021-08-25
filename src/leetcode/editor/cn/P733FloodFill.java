//有一幅以二维整数数组表示的图画，每一个整数表示该图画的像素值大小，数值在 0 到 65535 之间。 
//
// 给你一个坐标 (sr, sc) 表示图像渲染开始的像素值（行 ，列）和一个新的颜色值 newColor，让你重新上色这幅图像。 
//
// 为了完成上色工作，从初始坐标开始，记录初始坐标的上下左右四个方向上像素值与初始坐标相同的相连像素点，接着再记录这四个方向上符合条件的像素点与他们对应四个方
//向上像素值与初始坐标相同的相连像素点，……，重复该过程。将所有有记录的像素点的颜色值改为新的颜色值。 
//
// 最后返回经过上色渲染后的图像。 
//
// 示例 1: 
//
// 
//输入: 
//image = [[1,1,1],[1,1,0],[1,0,1]]
//sr = 1, sc = 1, newColor = 2
//输出: [[2,2,2],[2,2,0],[2,0,1]]
//解析: 
//在图像的正中间，(坐标(sr,sc)=(1,1)),
//在路径上所有符合条件的像素点的颜色都被更改成2。
//注意，右下角的像素没有更改为2，
//因为它不是在上下左右四个方向上与初始点相连的像素点。
// 
//
// 注意: 
//
// 
// image 和 image[0] 的长度在范围 [1, 50] 内。 
// 给出的初始点将满足 0 <= sr < image.length 和 0 <= sc < image[0].length。 
// image[i][j] 和 newColor 表示的颜色值在范围 [0, 65535]内。 
// 
// Related Topics 深度优先搜索 广度优先搜索 数组 矩阵 
// 👍 205 👎 0

package leetcode.editor.cn;

import java.util.ArrayDeque;

/**
 *java:图像渲染
 *@author Gaosl
 *@DateTime 2021-08-19 18:17:41
 */
public class P733FloodFill{
    public static void main(String[] args){
        Solution solution = new P733FloodFill().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
//        int oldColor=image[sr][sc];
//        image[sr][sc]=newColor;
//        int m=image.length-1;
//        int n=image[0].length-1;
//        ArrayDeque<Integer> deque = new ArrayDeque<>();
//        deque.add(sr);
//        deque.add(sc);
//        while(!deque.isEmpty()){
//            Integer sr1 = deque.remove();
//            Integer sc1 = deque.remove();
//            int t=sr1+1;
//            int b=sr1-1;
//            int l=sc1-1;
//            int r=sc1+1;
//            if (t<=m&&(image[t][sc1]==oldColor)&&image[t][sc1]!=newColor) {
//                image[t][sc1]=newColor;
//                deque.add(t);
//                deque.add(sc1);
//            }
//            if (l>=0&&(image[sr1][l]==oldColor&&image[sr1][l]!=newColor)) {
//                image[sr1][l]=newColor;
//                deque.add(sr1);
//                deque.add(l);
//            }
//            if (b>=0&&(image[b][sc1]==oldColor&&image[b][sc1]!=newColor)) {
//                image[b][sc1]=newColor;
//                deque.add(b);
//                deque.add(sc1);
//            }
//            if (r<=n&&(image[sr1][r]==oldColor&&image[sr1][r]!=newColor)) {
//                image[sr1][r]=newColor;
//                deque.add(sr1);
//                deque.add(r);
//            }
//        }
//        return image;
        int oldColor=image[sr][sc];
        dfs(image,sr,sc,newColor,oldColor);
        return image;
    }

    public void dfs(int[][] image, int x, int y, int newColor , int oldColor) {
        if(x<0||x>image.length-1||y<0||y>image[0].length-1){
            return ;
        }
        if(image[x][y]!=oldColor||image[x][y]==newColor){
            return;
        }
        image[x][y]=newColor;
        dfs(image,x+1,y,newColor,oldColor);
        dfs(image,x-1,y,newColor,oldColor);
        dfs(image,x,y+1,newColor,oldColor);
        dfs(image,x,y-1,newColor,oldColor);
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}