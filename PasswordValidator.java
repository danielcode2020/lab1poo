import java.util.Scanner;

import java.util.Scanner;
import java.util.*;

public class PasswordValidator {
    public static void main(String args[])
    {
        String input;
        Scanner sc = new Scanner(System.in);
        Rules();
        System.out.println("Enter your password : ");
        input = sc.nextLine();
        CheckValidity(input);
        sc.close();
    }

    static void Rules()
    {
        System.out.println("Rules for a valid password : ");
        System.out.println("Length between 8 and 18 characters");
        System.out.println("Must contain at least : ");
        System.out.println("1 lowercase character");
        System.out.println("1 uppercase character");
        System.out.println("1 number");
        System.out.println("1 special sign [ # ? ! @ ]");
    }

    public static void CheckValidity( String Password)
    {
        char[] PassToChar = Password.toCharArray();
        int Low=0;
        int Upp=0;
        int Num=0;
        int Special=0;

        for (char ch: PassToChar) {
            int asc = (int)ch;
            if ((asc>=65) && (asc<=90))
            {
                Upp++;
            }
            else if ((asc>=97) && (asc<=122))
            {
                Low++;
            }
            else if( (asc>=48) && (asc<=57))
            {
                Num++;
            }
            else if( (asc==35) || (asc==63) || (asc==33) || (asc==64))
            {
                Special++;
            }
        }
        if (((Password.length())>8) && ( (Password.length())<18))
            {
                if ((Upp>0) && (Low>0) && (Num>0) && (Special>0))
                {
                    System.out.println("Valid!");
                }
                else
                {
                    System.out.println("Invalid!");
                }
            }
            else
                {
                    System.out.println("Invalid!");
                }
    }
    
}
