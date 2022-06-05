package Work4;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String[][] field = initField(3);
        printField(field);

        while (true) {
            humanMakeTurn(field);
            printField(field);
            if (isWinnerGame(field, "X")) {
                System.out.println("X выиграл");
                break;
            }
            if (isDraw(field)) {
                break;
            }

            aiMakeTurn(field);
            printField(field);
            if (isWinnerGame(field, "0")) {
                System.out.println("0 выиграл");
                break;
            }
            if (isDraw(field)) {
                break;
            }
        }

    }

    public static String[][] initField(int size) {

        String[][] field = new String[size][size];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = "*";
            }
        }
        return field;
    }

    //Печать игрового поля

    public static void printField(String[][] field) {
        System.out.println("------------");
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------");
    }

    // Ход человека

    public static void humanMakeTurn(String[][] field) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if ((x >= 0 && x < field.length) && (y >= 0 && y < field.length)) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "X";
                    break;
                } else {
                    System.out.println("Тут занято");
                }
            }
            else {
                System.out.println("За пределами поля");

            }

        }

    }


    public static void aiMakeTurn(String[][] field) {
        Random random = new Random();
        while (true) {
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);
            if ((x > 0 && x < field.length) && (y > 0 && y < field.length)) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "0";
                    break;
                }
            }
        }
    }

    //проверка победы

    public static boolean isWinnerGame (String[][] field, String turn) {

        if (
                (field[0][0].equals(turn) && field[0][1].equals(turn) && field[0][2].equals(turn))
                || (field[1][0].equals(turn) && field[1][1].equals(turn) && field[1][2].equals(turn))
                || (field[2][0].equals(turn) && field[2][1].equals(turn) && field[2][2].equals(turn))
        ) {
            return true;
        } else if (
                (field[0][0].equals(turn) && field[1][0].equals(turn) && field[2][0].equals(turn)) ||
                        (field[0][1].equals(turn) && field[1][1].equals(turn) && field[2][1].equals(turn)) ||
                        (field[0][2].equals(turn) && field[1][2].equals(turn) && field[2][2].equals(turn))
        ) {
            return true;
        } else if ((field[0][0].equals(turn) && field[1][1].equals(turn) && field[2][2].equals(turn)) ||
                (field[2][0].equals(turn) && field[1][1].equals(turn) && field[0][2].equals(turn)))
        {
            return true;
        }
        else {
            return false;
        }
    }

     public static boolean isDraw (String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals("*")) {
                    return false;
                }
            }
        }
         System.out.println("Ничья");
        return true;
     }
}
