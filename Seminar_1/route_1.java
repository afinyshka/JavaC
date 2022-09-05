package Seminar_1;

import java.util.Arrays;
import java.util.Random;

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

public class route_1 {

  static int[] solve(int a, int b, int c, int d) {
    int[] arr = new int[b + 1];
    if (a < b) {
      arr[a] = 1;
      for (int index = a + 1; index <= b; index++) {
        if (index % c == 0) {
          if (index >= d) { // add condition
            arr[index] = arr[index - d] + arr[index / c];
          } else { // add condition
            arr[index] = arr[index / c];
          }
        } else if (index >= d) { // add condition
          arr[index] = arr[index - d];
        }
      }
    }
    return arr;
  }

  public static String getShortestRoute(String[] routes_arr) {
    int i = 0;
    String shortest_route = routes_arr[i];
    for (i = 1; i < routes_arr.length; i++) {
      if (routes_arr[i].length() < shortest_route.length()) {
        shortest_route = routes_arr[i];
      }
    }
    return shortest_route;
  }

  public static int generateRandomInt(int upperRange) {
    Random random = new Random();
    int x = random.nextInt(upperRange);
    return x;
  }

  static String[] allRoutes(int a, int b, int c, int d, int[] arr) {
    if (arr[arr.length - 1] != 0) { // проверка наличия такого пути
      String[] routes_arr = new String[arr[arr.length - 1]];
      int index = 0;
      while (index < arr[arr.length - 1]) {
        String route_map = ""; // delete '+ index'
        int def_b = b;
        while (def_b > a) {
          if (def_b % c == 0 & def_b - d >= a & arr[def_b / c] > 0 && arr[def_b - d] > 0) {
            int randum = generateRandomInt(2);
            if (randum == 0) {
              def_b = def_b / c;
              route_map = "*" + c + " " + route_map;
            } else {
              def_b = def_b - d;
              route_map = "+" + d + " " + route_map;
            }
          } else if (def_b % c == 0 & arr[def_b / c] > 0) {
            def_b = def_b / c;
            route_map = "*" + c + " " + route_map;
          } else if (def_b - d >= a && arr[def_b - d] > 0) { // с двойной не проверяет 2ое условие
            def_b = def_b - d;
            route_map = "+" + d + " " + route_map;
          }
        }
        // добавить проверку на уникальность с index > 0
        if (index == 0) {
          routes_arr[index] = route_map;
          index++;
        } else {
          // Проверка массива на наличие конкретного значения
          boolean chk = Arrays.asList(routes_arr).contains(route_map);
          // System.out.printf("%d - %b\n", index, chk);
          if (chk == false) {
            routes_arr[index] = route_map;
            index++;
          }
        }
      }
      return routes_arr;
    } else {
      String route_map = "no such a route";
      String[] routes_arr = new String[] { route_map };
      return routes_arr;
    }
  }

  public static void main(String[] args) {
    int a = 1;
    int b = 99; // проверено при 4 - 14 - 2 - 5
    int c = 3; // *
    int d = 5; // +
    var so = solve(a, b, c, d);
    var go = allRoutes(a, b, c, d, solve(a, b, c, d));

    for (int i = 0; i < so.length; i++) {
      System.out.printf("%d -> %d\n", i, so[i]);
    }

    if (so[so.length - 1] > 0) {
      String shortest_route = getShortestRoute(go);
      System.out.printf("The shortest road map from %d to %d = %s\n", a, b, shortest_route);

      for (int i = 0; i < go.length; i++) {
        System.out.printf("road map %d from %d to %d -> %s\n", i + 1, a, b, go[i]);
      }
    } else {
      System.out.printf("%s from %d to %d by *%d and +%d\n", go[0], a, b, c, d);
    }
  }
}
