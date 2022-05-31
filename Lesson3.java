public class Lesson3 {

    // Задание 1-3.
    public static void main(String[] args) {
        magicTask(1, 2);


        int[] massive = {1, 0, 1, 0, 0, 0, 1, 1, 1};
        int maxMass = massive.length;
        for (int i = 0; i < maxMass; i++) {
            System.out.println(i + " - " + massive[i]);
        }
        System.out.println("Print massive for console");

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == 1) {
                massive[i] = 0;
            } else {
                massive[i] = 1;
            }
            System.out.println(i + " - " + massive[i]);
        }

        int[] arr = new int[100];
        int maxSymbol = arr.length;
            /* for (int i = 0; i < arr.length; i++) {
                System.out.println(i + " --> " + arr[i]);
            }
            Вывод пустого массива в консоль от id[0] до id [99]
            */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(i + " --> " + arr[i]);
        }

        int[] task3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < task3.length; i++) {
            if (task3[i] < 6) {
                task3[i] = task3[i] * 2;
            }
            System.out.println(i + " --> " + task3[i]);
        }

        // Задание 4.

        int[][] table = new int[3][3];
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {
                // Как записать в двумерный массив циклом? Даж гугл не помог. Заменить обе диагонали можно так -->
                table[0][0] = 5;
                table[1][1] = 5;
                table[2][2] = 5;
                table[0][2] = 5;
                table[2][0] = 5;
                //System.out.print(" " + k + " - " + j + " ");
                System.out.print(table[k][j]);

            }
            System.out.println();
        }

    }

    // Без гугла не обошлось в этом квесте, но первые строчки я еще пыхтел и почти получилось.
    // Метод начинается с public static  ---> int[] <--- ???
    // Задание 5.
    public static int[] magicTask(int len, int initialValue) {
        int mass[] = new int[len];

        for (int x = 1; x < mass.length; x++) {
            mass[x] = initialValue;
        }
        return mass;
    }







        // Задание 6.
        // Понятно, но где этому учили? Опять же гугл в помощь. Урок, презентация и методичка в данном квесте бесполезны.
        // Видимо суть задания в том, чтоб научиться искать код в интернете и делать копи пасту, поправляя под себя,
        // иначе как студент должен выполнять эти задания?

    public static void minMaxArray (String[] args){
        int [] loc = {25, 11, 250, 5};

        int min = loc[0];
        for(int i = 0; i != loc.length; i ++){
            if (min>loc[i]);
            min = loc[i];

        }
        System.out.println(min + " ");
    }


}




