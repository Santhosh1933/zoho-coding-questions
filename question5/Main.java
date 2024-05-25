package question5;

import java.util.Scanner;

public class Main {

    public static String addDigit(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            res += (int) str.charAt(i) - '0';
        }
        return Integer.toString(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();

        if (str.length() <= k) {
            System.out.println(str);
            return;
        }

        while (str.length() > k) {
            String temp = "";
            for (int i = 0; i < str.length(); i += k) {
                String subString = "";
                if (i + k >= str.length()) {
                    subString = str.substring(i, str.length());
                } else {
                    subString = str.substring(i, i + k);
                }
                temp += addDigit(subString);
            }
            str=temp;
        }

        System.out.println(str);

    }
}
