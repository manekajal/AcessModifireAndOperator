package org.whileloop;
import java.util.*;

public class ReverseWhile {
    public static void main(String[] args)
    {

        int reverse=0;


        System.out.print("Enter the number that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num>0) {


            int reminder = num % 10;
            reverse = reverse * 10 + reminder;


            num=num / 10;
        }
        System.out.print("You entered : "+num);
        System.out.print("Reverse of the number is: "+reverse);

    }
}
