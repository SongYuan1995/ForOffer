package By.AlgorithmAndProgramme;


import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;


/**
 * @Author: SongYuan
 * @Date: 2019/10/24 16:12
 * @Description:    编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截 取的字符串，
 * 但要保证汉字不被截取半个，如“我 ABC”，4，应该截取“我 AB”， 输入“我 ABC汉DEF”，6，应该输出“我ABC”，而不是“我 ABC+汉的半个”。
 * 技术难点
 * 1、知道汉字截半的话对应字节的ASC码为小于0的数值
 * 2、对字符串操作应该都要面对的一个问题，字符串是否有效null, 字符串的长度0,1这种边界处理
 */
public class Test03 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str ="我a爱中华 abc 我爱传智 def";
        String str2 ="我ABC汉";
        int num =trim(str2.getBytes("GBK"),6);
        System.out.println(str.substring(0, num));

        
    }

    private static int trim(byte[] bytes, int num) {
        boolean isHalf = false;

        int index = 0;
        for (int i = 0; i < num; i++) {
            if (bytes[i] < 0 && !isHalf) {
                isHalf = true;
//                break;
            } else {
                index ++;
                isHalf = false;
            }
        }
        return index;
    }


}
