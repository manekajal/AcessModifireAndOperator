package org.switchloop;
import java.util.*;

public class VowelAndConsonant {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.print("\n Enter Character: ");
        char c=((inp.nextLine()).charAt(0));
        char z=Character.toUpperCase(c);
        switch(z)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': System.out.println(c+" is a Vowel.");
                break;

            default: System.out.println(c+" is a Consonant Character.");
        }

    }
}
