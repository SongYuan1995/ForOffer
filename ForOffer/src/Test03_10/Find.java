package Test03_10;

/**
 * @Auther: SongYuan
 * @Date: 2019/10/8 18:58
 * @Description: 题目描述：一个二维数组，每一行从左到右递增，每一列从上到下递增．输 入一个二维数组和一个整数，判断数组中是否含有整数。
 */
public class Find {
    //思路：把每一行看成有序递增数组，遍历每一行，使用二分法
    public boolean find(int[][] arr, int target) {
        if (arr == null) {
            return false;
        }


        for (int i = 0; i < arr.length; i++) {
            //行(每一行的第一个数字的下标)
            int row = 0;
            //列（每一行的最后一个数字的下标）
            int column = arr[i].length - 1;
            while (row <= column) {
                int z = (row + column) / 2;
                if (arr[i][z] < target) {
                    row = z + 1;
                } else if (arr[i][z] > target) {
                    column = z - 1;
                } else {
                    return true;
                }
            }

        }

        return false;


    }

    public static void main(String[] args) {
        Find find = new Find();
        int[][] arr = new int[][]{{1,2,5,79},{2,3,6,80},{3,4,7,81}};
        boolean flag = find.find(arr, 82);
        System.out.println(flag);


    }






}
