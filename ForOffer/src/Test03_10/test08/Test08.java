package Test03_10.test08;

/**
 * @Author: SongYuan
 * @Date: 2019/10/17 15:38
 * @Description: 8.把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0
 *
 * 思路：利用二分法，找到中间的数，然后和最左边的值进行比较，若大于最左边的数，
 * 则最左边从mid开始，若小于最右边值，则最右边从mid开始。若左中右三值相等，则取mid前后值中较小的数。
 * 方法（1）：直接遍历，找到最小值。
 * 方法（2）：由于旋转后，前面是一个递增子序列，后面是一个递增子序列，找出不是递增的那个元素
 * 方法（3）：利用二分查找。如果中间元素值>最后一个元素值，说明最小值右半区间，
 *          如果中间元素<最后一个元素区间，说明最小值在左半区间，如果相等说明有相同元素，
 *          需要将判断区间往前缩一下，继续判断，不断循环，当二分查找的的左右区间相等了，就说明找到最小值了。
 */
public class Test08 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,5,6,7,8,9,10,1,2};
        System.out.println(findMin(arr));

    }

    private static int findMin(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int begin = 0;
        int end = arr.length - 1;
        while (begin < end) {
            int mid = (begin + end) / 2;
            //如果中间值大于最后一个数字说明最小值在右边
            if (arr[mid] > arr[end]) {
                begin = mid + 1;
            }
            //如果中间值小于最后一个数字说明最小值在左边     /*特别注意不能去掉else，因为去掉else后悔改变值大小从而导致进入下一个判断*/
            else if (arr[mid] < arr[end]) {
                end = mid;
            }
            //当中间元素=最后一个元素说明有元素重复，将区间缩小一个，
           else if (arr[mid] == arr[end]) {
                end -= 1;
            }
        }
        return arr[begin];


    }

}
