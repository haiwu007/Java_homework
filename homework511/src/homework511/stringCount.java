package homework511;

import java.util.Iterator;

public class stringCount {
    public static void main(String[] args) {
        if (args.length > 1) {
            System.err.println("参数数量过多");
            return;
        }
        int[] count = new int[52];
        for(int i = 0; i < args[0].length(); i++){
            char curChar = args[0].charAt(i);
            if (curChar >= 'a' && curChar <= 'z') {
                count[curChar - 'a']++;
            }
            else if (curChar >= 'A' && curChar <= 'Z') {
                count[curChar - 'A' + 26]++;
            }
            else{
                System.out.println("存在非字母字符");
            }
        }
        for(int i = 0; i < 26; i++){
            if (count[i] > 0) {
                System.out.println("字母" + (char)(i + 'a') + "存在：" + count[i] + "个");
            }
        }
        for(int i = 26; i < 52; i++){
            if (count[i] > 0){
                System.out.println("字母" + (char)(i - 26 + 'A') + "存在：" + count[i] + "个");
            }
        }
    }
}
