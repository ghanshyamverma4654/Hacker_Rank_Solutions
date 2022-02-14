package Java_Problems;

import java.util.Scanner;

/*
 * Author Name : Ghanshyam Verma
 * Date : 15-02-2022
 * JDK version : 17 version 17
 * IDE : IntelliJ IDEA Ultimate
 */
public class JavaLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Any Number: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.printf("%d x %d = %d%n", num, i, result);
        }
    }
}
