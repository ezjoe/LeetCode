package org.eu.qiao;

import java.util.Base64;

/**
 * @ClassNamg AliThrough
 * @Description todo
 * Author BOB
 * @Date 2019/4/10 14:47
 * @Version 1.0
 **/
public class AliThrough {


    public static void main(String[] args) {
        String[][] codeBucket = {
                {"\u63a8", "\u9648", "\u51fa", "\u65b0"},
                {"\u4e3e", "\u4e16", "\u95fb", "\u548d"},
                {"\u5927", "\u5343", "\u4e16", "\u754c"},
                {"\u81ea", "\u7531", "\u81ea", "\u5728"},
                {"\u4f60", "\u8ffd", "\u6211", "\u8d76"},
                {"\u767b", "\u5cf0", "\u9020", "\u6781"}};
        StringBuilder cnThroughTrain = new StringBuilder();
        String password = decrypt("MzEzMTAy");
        for (int i = 0; i < codeBucket.length; i++) {
            cnThroughTrain.append(codeBucket[i][Integer.parseInt(Character.toString(password.charAt(i)))]);
        }
        System.out.println(cnThroughTrain.toString());
    }

    private static String decrypt(String input) {
        return new String(Base64.getDecoder().decode(input));

    }
}

