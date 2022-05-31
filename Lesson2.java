public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(within10and20(10, 2));
        examination(-10);
        System.out.println(isNegative(0));
        printWordNTime("SystemPrintInfo", 0);
    }


    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void examination(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else if (a < 0) {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int x) {
        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }


    /* Строка выводится указанное количество раз при условии изменения граничных значений в цикле for.
    Не могу понять, как сделать, чтоб не приходилось вносить изменения в цикл.
    */

    public static void printWordNTime(String word, int times) {
        for (times = times; times < 5; times++) {
            System.out.println(word);
        }
    }

}