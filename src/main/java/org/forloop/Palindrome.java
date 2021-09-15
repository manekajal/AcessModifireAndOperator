package org.forloop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {

        String  num , reverse = "";
        System.out.print("Enter the number that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
         num = sc.nextLine();
        int length=num.length();


        for ( int i =length - 1; i >= 0; i-- )
        {
            reverse= reverse + num.charAt(i);

        }

        if(num.equals(reverse))
            System.out.println("palindrome number ");
        else {
            System.out.println("not palindrome");
        }

    }
}
