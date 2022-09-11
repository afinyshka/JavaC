package Seminar_3;

import java.util.ArrayList;
import java.lang.Math;
import java.util.Scanner;

public class HanoiTowerFull {

    private static void printArr(String[] arr) {
        for (String elem : arr) {
            System.out.print(elem + "\n");
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = console.nextInt();
        console.close();
        ArrayList<String> moves = new ArrayList<String>();
        ArrayList<Integer> tower1 = new ArrayList<Integer>();
        ArrayList<Integer> tower2 = new ArrayList<Integer>();
        ArrayList<Integer> tower3 = new ArrayList<Integer>();
        for (int i = 0; i < number; i++) {
            tower1.add(number - i);
        }
        System.out.println("\nRods at the beggining of the game: ");
        System.out.println("A:" + tower1);
        System.out.println("B:" + tower2);
        System.out.println("C:" + tower3);

        hanoiTower(moves, number, 'A', 'B', 'C', tower1, tower2, tower3);

        System.out.println("\nThe moves: ");
        String[] movesArray = moves.toArray(new String[(int) Math.pow(2, number) - 1]);

        printArr(movesArray);

        System.out.println("\nRods at the end of the game:");
        System.out.println("A:" + tower1);
        System.out.println("B:" + tower2);
        System.out.println("C:" + tower3);
        System.out.println();
    }

    private static void hanoiTower(ArrayList<String> moves, int n, char aa, char bb, char cc,
            ArrayList<Integer> tower1, ArrayList<Integer> tower2, ArrayList<Integer> tower3) {
        if (n == 1) {
            tower3.add(tower1.remove(tower1.size() - 1));
            moves.add("Move disk " + n + " from " + aa + " to " + cc);
            return;
        } else {
            hanoiTower(moves, n - 1, aa, cc, bb, tower1, tower3, tower2);
            tower3.add(tower1.remove(tower1.size() - 1));
            moves.add("Move disk " + n + " from " + aa + " to " + cc);

            hanoiTower(moves, n - 1, bb, aa, cc, tower2, tower1, tower3);
        }
    }
}
