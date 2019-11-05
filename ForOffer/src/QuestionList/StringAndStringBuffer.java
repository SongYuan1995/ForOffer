package QuestionList;

/**
 * @Author: SongYuan
 * @Date: 2019/10/16 16:12
 * @Description:
 */
public class StringAndStringBuffer {
    private static int num = 0;

    public int test() {
        try {
            return num;
        } finally {

            ++num;
        }
    }

    public static void main(String[] args) {
        StringAndStringBuffer sb = new StringAndStringBuffer();
        System.out.println(sb.test());

        System.out.println(num);

    }













    public static void main2(String[] args) {
        long bufferStartTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 1000; i++) {
            stringBuffer.append(i);
        }
        long bufferEndTime = System.nanoTime();
        System.out.println("StringBuffer花费时间：" + (bufferEndTime - bufferStartTime));    //836401


        long StrStart = System.nanoTime();
        String str = new String();
        for (int i = 0; i < 1000; i++) {
            str += i;
        }
        long StrEnd = System.nanoTime();
        System.out.println("String花费时间：" + (StrEnd - StrStart));    //7685500
    }




}
