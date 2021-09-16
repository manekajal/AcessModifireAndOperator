package org.AllOperator;

import java.util.Scanner;

public class MinAndMaxUsingOperator {
    public static void main(String[] args) {
//        i) a+b*c ii) c+a/b
////        iii) a%b+c iV) a*b+c


        Scanner s = new Scanner(System.in);
        System.out.println("enter the 4 value of a b c");

        int a =s.nextInt();
        System.out.println("value of a" +a);
        int b=s.nextInt();
        System.out.println("value of a" +b);

        int c=s.nextInt();
        System.out.println("value of a" +c);
        int result1 = a + b*+c;
        int result2 = c + a / b;
        int result3 = a % b + c;
        System.out.println("res1 :" +result11);
        System.out.println("res1 :" +result2);
        System.out.println("res1 :" +result33);
        if(result1>result2 && result1 > result3)
        {

            System.out.println("result 1 is max"+result1);
        }
        else if(result2 > result1 && result2 > result3)
        {
            System.out.println("result 2 is max");
        }
        else{
            System.out.println("result 3 is min");
        }
    }
}
