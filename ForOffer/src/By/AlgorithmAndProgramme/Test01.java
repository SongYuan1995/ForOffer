package By.AlgorithmAndProgramme;

import java.io.*;

/**
 * @Author: SongYuan
 * @Date: 2019/10/22 17:57
 * @Description:
 */
public class Test01 {
    //、编写一个程序，将 a.txt文件中的单词与 b.txt 文件中的单词交替合并到 c.txt 文件中，
    // a.txt文件中的单词用回车符分隔，b.txt 文件中用回车或空格进行分隔。
    public static void main(String[] args) throws IOException {
        FileManager fma = new FileManager("a.txt", new char[]{'\n', ' '});
        FileManager fmb = new FileManager("b.txt", new char[]{'\n'});
        FileWriter fc = new FileWriter("c.txt");
        String aword = null;
        String bword = null;
        while ((aword = fma.nextWorld()) != null) {
            fc.write(aword+"\n");
            bword = fmb.nextWorld();
            if (bword != null) {
                fc.write(bword + "\n");
            }
        }
        while ((bword = fmb.nextWorld()) != null) {
            fc.write(bword + "\n");
        }
        fc.close();




    }






}


class FileManager{
    String[] words;
    int pos = 0;

    /**
     * 读入文件信息，并将内容存入字符串数组中
     * @param filename
     * @param seperators
     * @throws IOException
     */
    public FileManager(String filename, char[] seperators) throws IOException {
        File f = new File(filename);
        FileReader fr = new FileReader(f);
        char[] buf = new char[(int) f.length()];
        int len = fr.read(buf);
        String result = new String(buf, 0, len);
        String regex = null;
        if (seperators.length > 1) {
            regex = seperators[0] + "|" + seperators[1];
        } else {
            regex = seperators[0]+"";
        }
        words = result.split(regex);
       fr.close();
    }

    /**
     * 返回当前位置的world[pos] ,然后后移指针pos位置
     * @return
     */
    public String nextWorld() {
        if (pos == words.length) {
            return null;
        }
        return words[pos++];
    }









}