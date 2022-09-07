package Seminar_2;

import java.util.Scanner;

/**
 * +Написать программу вычисления n-ого треугольного числа
 */



public class nTriangleNumber {

    public static int triangularNumber(int number) {
        int nTriagNum = 0;
        for (int i=0; i<=number; i++) {
            nTriagNum += i;
        }
        return nTriagNum;    
    }

    public static int triangularNumberRec(int number) {
        if (number == 1) return 1;
        else {
           return number + triangularNumberRec(number - 1);
        }
    }
    public static void main(String[] args) { 
        Scanner console = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = console.nextInt();
        int nTriagNum = triangularNumber(number);
        int nTriagNumRec = triangularNumberRec(number);
        // int nTriagNum = (number * (number + 1)) /2;
          
        System.out.printf("Your n-Triangular number for %d: %d \n", number, nTriagNum);
        System.out.printf("Your n-Triangular number (recurcion)6 for %d: %d \n", number, nTriagNumRec);
        console.close();
    }
}
