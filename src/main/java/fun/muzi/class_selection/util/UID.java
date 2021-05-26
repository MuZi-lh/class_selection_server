package fun.muzi.class_selection.util;

import java.util.UUID;


public class UID {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(generate(20));
        }
    }

    // len can not be more than 32
    public static String generate(int len) {
        return UUID.randomUUID().toString().replace("-", "").substring(0,len);
    }

}
