package Java_Problems;

import java.util.Scanner;

/*
 * Author Name : Ghanshyam Verma
 * Date : 13-02-2022
 * JDK version : 17 version 17
 * IDE : IntelliJ IDEA Ultimate
 */
public class javaOutputFormatting {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String str = scan.next();
            int number = scan.nextInt();
            System.out.printf("%-15s%03d%n", str, number);
        }

        System.out.print("================================");

    }
}
