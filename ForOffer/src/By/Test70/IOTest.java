package By.Test70;

import java.io.*;

/**
 * @Author: SongYuan
 * @Date: 2019/10/21 15:25
 * @Description:
 */
public class IOTest {
    public static void main(String[] args) throws IOException {
        String str = "中国人";
        /*
        FileOutputStream 是字节流，任何类型都可以用它操作。
        FileOutputStream是直接写入文件，没有缓存的过程。
        FileOutputStream fout = new FileOutputStream("1.txt");
        fout.write(str.getBytes());
        fout.close();*/

        /*
        FileWriter是字符流，文本类的可以用它效率高。
        FileWriter是往缓存中写，然后通过flush写到文件中。
        FileWriter fw = new FileWriter("1.txt");
        fw.write(str);
        fw.close();*/

       /* PrintWriter pw = new PrintWriter("1.txt");
        pw.write(str);
        pw.close();*/

        //创建字符缓冲输出流对象,构造方法中传递字符输出流
        /*BufferedWriter bu = new BufferedWriter(new FileWriter("1.txt",true));
        bu.write("Chinese");
        bu.flush();
        bu.close();*/

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("1.txt"), "UTF-8"));
        String str2 = br.readLine();
        br.close();
        System.out.println(str2);


    }





}
