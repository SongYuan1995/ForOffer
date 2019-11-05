package Test03_10;

/**
 * @Auther: SongYuan
 * @Date: 2019/10/8 19:24
 * @Description: 将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Replace {

    public static String replaceWorld(String world) {
        if (world == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < world.length(); i++) {
            if (String.valueOf(world.charAt(i)).equals(" ")) {
                sb.append("%20");
            } else {
                sb.append(String.valueOf(world.charAt(i)));
            }
        }

        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        String s = "We are one";
        System.out.println(Replace.replaceWorld(s));

    }


}
