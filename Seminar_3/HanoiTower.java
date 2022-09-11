package Seminar_3;

import java.util.Scanner;

public class HanoiTower {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = console.nextInt();
        console.close();

        hanoiTower(number, 'A', 'B', 'C');
    }

    private static void hanoiTower(int n, char from, char through, char to) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + from + " to rod " + to);
            return;
        } else {
            hanoiTower(n - 1, from, to, through);
            System.out.println("Move disk " + n + " from " + from + " to rod " + to);
            hanoiTower(n - 1, through, from, to);
        }
    }
}
