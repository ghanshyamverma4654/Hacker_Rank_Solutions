package Java_Problems;

import java.util.Scanner;

/*
 * Author Name : Ghanshyam Verma
 * Date : 16-02-2022
 * JDK version : 17 version 17
 * IDE : IntelliJ IDEA Ultimate
 */
public class Java_Stdin_And_Stdout_I {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        int yourInt = scanner.nextInt();
        scanner.close();

        System.out.println(myString);
        System.out.println(myInt);
        System.out.println(yourInt);

    }
}
