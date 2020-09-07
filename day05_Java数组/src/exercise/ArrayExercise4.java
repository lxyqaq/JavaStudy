package exercise;

/**
 * @author lxyqaq
 * @date 2020/9/7 - 11:45
 */
public class ArrayExercise4 {
    public static void main(String[] args) {
        //输出10行的杨辉三角
        /* 提示：
            1. 第一行有 1 个元素, 第 n 行有 n 个元素
            2. 每一行的第一个元素和最后一个元素都是 1
            3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
               yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j]
        */

        //定义二维数组
        int[][] yangHui = new int[10][];

        //构建整体并赋值
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
            //给每行元素的一个元素和最后一个元素赋值1
            yangHui[i][0] = yangHui[i][i] = 1;
            //给每行元素中的其他元素赋值
            //从每行的第二个元素开始到倒数第二个元素
            for (int j = 1; j < yangHui[i].length - 1; j++) {
                yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
            }
        }

        //遍历数组
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "\t");
            }
            //换行
            System.out.println();
        }


    }
}
