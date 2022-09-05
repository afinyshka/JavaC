package Seminar_1;

import java.util.ArrayList;

/**
 * +На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть
 * две команды
 * - команда 1 (к1): увеличить в с раза, а умножается на c
 * - команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
 * написать программу, которая выдаёт набор команд, позволяющий число a
 * превратить в число b или сообщить, что это невозможно
 * Пример 1: а = 1, b = 7, c = 2, d = 1
 * ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1.
 * Пример 2: а = 11, b = 7, c = 2, d = 1
 * ответ: нет решения.
 * Подумать над тем, как сделать минимальное количество команд
 */

public class route_1_recurcion {
    public static void solveRec(int a, int b, int c, int d, int[] arr, int index) {
        if (index > b) {
            return;
        } else if (index % c == 0) {
            if (index >= d) { // add condition
                arr[index] = arr[index - d] + arr[index / c];
            } else { // add condition
                arr[index] = arr[index / c];
            }
        } else if (index >= d) { // add condition
            arr[index] = arr[index - d];
        }
        solveRec(a, b, c, d, arr, index + 1);
    }

    static void allRoutesRec(int a, int b, int c, int d, String route_map, ArrayList<String> routs_arr) {
        if (b == a) {
            routs_arr.add(route_map);
            return;
        } else if (a > b) {
            return;
        } else {
            allRoutesRec(a * c, b, c, d, route_map + "*" + c + " ", routs_arr);
            allRoutesRec(a + d, b, c, d, route_map + "+" + d + " ", routs_arr);
        }
    }

    public static String getShortRoute(ArrayList<String> routes_arr) {
        int i = 0;
        String shortest_route = routes_arr.get(i);
        for (i = 1; i < routes_arr.size(); i++) {
            if (routes_arr.get(i).length() < shortest_route.length()) {
                shortest_route = routes_arr.get(i);
            }
        }
        return shortest_route;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 99; // проверено при 4 - 14 - 2 - 5
        int c = 3; // *
        int d = 5; // +
        int[] n_routs = new int[b + 1];
        if (a > b) {
            System.out.printf("\nNo such a route from %d to %d by *%d and +%d\n", a, b, c, d);
        } else {
            n_routs[a] = 1;
            int index = a + 1;
            solveRec(a, b, c, d, n_routs, index);

            ArrayList<String> routes_arr = new ArrayList<String>();
            String route_map = "";

            allRoutesRec(a, b, c, d, route_map, routes_arr);

            for (int i = 0; i < n_routs.length; i++) {
                System.out.printf("%d -> %d\n", i, n_routs[i]);
            }

            if (n_routs[n_routs.length - 1] == 0) {
                System.out.printf("No such a route from %d to %d by *%d and +%d\n", a, b, c, d);
            } else {
                System.out.printf("All the routes from %d to %d: \n", a, b);
                for (String elem : routes_arr) {
                    System.out.println(elem);
                }
                System.out.printf("The shortest route from %d to %d: \n", a, b);
                String shortest_route = getShortRoute(routes_arr);
                System.out.println(shortest_route);
            }
        }
    }
}
