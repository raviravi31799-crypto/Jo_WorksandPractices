package Tasks_Strings;

import java.util.*;

public class Strings_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");

        String s = sc.nextLine();

        String result = "";
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (ch[i] == ch[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result = result + ch[i];
            }
        }

        System.out.println("String without duplicates: " + result);
    }
}