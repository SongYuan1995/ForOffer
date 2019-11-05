package Test11_20;

import Test03_10.Test05;
import Test03_10.test07.Test;

import java.util.*;

/**
 * @Author: SongYuan
 * @Date: 2019/10/19 10:04
 * @Description:
 * 12.打印1到最大的n位数
 * 思路：考虑大数问题，使用字符串或数组表示。
 */
public class Test12 {


    /*public String print(long num) {

        HashMap<String, Integer> hashMap = new HashMap();
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("*****");
        }






    }*/
    public static void main(String[] args) {
        String a = new String("啦啦啦");
        String b = new String("啦啦啦");
        if (a.equals(b)) {
            System.out.println(a.hashCode()+"-->a;");
            System.out.println(b.hashCode()+"-->b;");
        }



    }


}
