package By.AlgorithmAndProgramme;

import java.io.*;

/**
 * @Author: SongYuan
 * @Date: 2019/10/24 15:35
 * @Description:
 * 编写一个程序，将 d:\java 目录下的所有.java 文件复制到 d:\jad 目录下，并 将原来文件的扩展名从.java 改为.jad。
 * 重点就是File.listFile()的参数FilenameFilter()这个接口的accept()方法，该方法作用是根据过滤条件查找对应的File数组。
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        File file = new File("e://java");
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                return name.endsWith(".java");
            }
        });

        //目标文件夹
        File fileAim = new File("e://jad");
        if (!fileAim.exists()) {
            fileAim.mkdir();
        }
        //遍历全部.java文件
        for (File f : files) {
            FileInputStream fi = new FileInputStream(f);
            String resultName = f.getName().replace(".java", ".jda");
            FileOutputStream fo = new FileOutputStream(new File(fileAim, resultName));
            copy(fi, fo);
            fi.close();
            fo.close();
        }






    }

    private static void copy(FileInputStream fi, FileOutputStream fo) throws IOException {
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fi.read(bytes)) != -1) {
            fo.write(bytes, 0, len);
        }

    }


}
