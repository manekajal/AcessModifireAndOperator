package org.forloop;

import java.util.Scanner;

public class SumOfNaturalNumUsingFor {
    public static void main(String[] args) {
        int sum = 0;
        int i, num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sum from: ");
        i = scan.nextInt();
        System.out.print("Sum upto: ");
        num = scan.nextInt();

        for ( i = 0; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of Natural Numbers = " + sum);
    }
}
