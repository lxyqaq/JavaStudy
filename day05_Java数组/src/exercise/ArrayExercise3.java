package exercise;

/**
 * @author lxyqaq
 * @date 2020/9/7 - 11:17
 */
public class ArrayExercise3 {
    public static void main(String[] args) {
        //获取array数组中所有元素的和
        int[][] array = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        //记录总和
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println(sum);
    }
}
