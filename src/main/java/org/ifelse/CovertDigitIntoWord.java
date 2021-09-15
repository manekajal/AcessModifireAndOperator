package org.ifelse;

import java.util.*;

public class CovertDigitIntoWord {

        public void pw(int n, String ch)
        {
            String one[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine"};
            if (n > 9)
            {
                System.out.print(one[n % 10]);
            }
            else
            {
                System.out.print(one[n]);
            }
            if (n > 0)
                System.out.print(ch);
        }
        public static void main(String[] args) {
            int n = 0;
            Scanner scanf = new Scanner(System.in);
            System.out.println("Enter an integer number: ");
            n = scanf.nextInt();

            if (n <= 0) {
                System.out.println("Enter numbers greater than 0");
            } else {
                CovertDigitIntoWord a = new CovertDigitIntoWord();

                a.pw((n % 100), " ");
            }
        }
    }

