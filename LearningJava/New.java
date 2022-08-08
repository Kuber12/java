package LearningJava;

import java.util.Scanner;

public class New {
    public static void main(String args[]){
        String a;
        int b;
        System.out.println("Enter a number to print it back");
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();
        scanner.nextLine();
        a = scanner.nextLine();
        System.out.println(a);
        System.out.println(b);
    }
}