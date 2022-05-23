public class HomeWorkApp {
    public static void main (String [] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign () {
        int a = -5;
        int b = 55;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        }
        else {System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor () {
        int c = 5;

        if (c <= 0) {
            System.out.println("Красный");
        }
        if (c > 0 || c <= 100) {
            System.out.println("Желтый");
        }
        if (c > 100) {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers () {
        int a = 5;
        int b = 10;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {System.out.println("a<=b");
        }
    }
}
