package Util;

import java.util.Scanner;


public class InputUtils {

    public static Scanner sc = new Scanner(System.in);
    public static String inputString() {
        String str;
        while (true) {
            try {
                str = sc.nextLine();
                if (str.isBlank()) {
                    throw new Exception("Error.");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return str;
    }
}
