package org.forloop;

import java.util.Scanner;

public class ReverseForLoop {
    public static void main(String[] args)
    {

        int reverse=0;


        System.out.print("Enter the number that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(;num!=0;num=num/10) {


            int reminder = num % 10;
            reverse = reverse * 10 + reminder;


        }
        System.out.print("You entered : "+num);
        System.out.print("Reverse of the number is: "+reverse);

    }
}
