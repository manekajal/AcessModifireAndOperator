package org.whileloop;

import java.util.*;

public class SumNumber {

    public static void main(String[] args)
    {
        int sum = 0;
        int i,num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sum from: ");
        i = scan.nextInt();
        System.out.print("Sum upto: ");
        num = scan.nextInt();
        while (i<=num)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of Natural Numbers = " + sum);

    }

}
