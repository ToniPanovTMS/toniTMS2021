import java.util.Scanner;

public class work4 {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean notrue = true;
        while (notrue) {
            menu(notrue);
            if (!notrue) {
                break;
            }
        }


    }

    public static boolean menu(boolean notrue) {
        int[][] arrey = new int[0][0];
        new Scanner(System.in);

        while (notrue) {
            System.out.println("\n1)\tВвести новый массив;\n        2)\tЗадание 1;\n        3)\tВывод массива;\n        4)\tЗадиние 2;\n        0)\tВыход.");
            int switch1 = inputValidation();
            switch (switch1) {
                case 0:
                    notrue = false;
                    break;
                case 1:
                     zadacha1();
                    break;
                case 2:
                     zadacha2();
                    break;
                case 3:
                    zadacha3();
                    break;
                case 4:

                    break;
                default:
                    System.out.println("нужно ввести чисто 1,2,3,4 или 0");
            }
        }

        return notrue;
    }
    public static void zadacha1(){
        //это у нас задача на анёбы
        int anyba =1,hour=0;
        //анёба делится наждые 3 часа , значит если делится на 3 без остатка , будет часом деления
        //по условию задачи у нас время в алоть до 24 часов
        for (int i = 0; i < 24; i++) {
            if(hour%3==0){
                anyba*=anyba;
                System.out.println("количество анёб в "+hour+" час равно == "+anyba);
            }
        }
        return;
    }
    public static void zadacha2(){
        Scanner input = new Scanner(System.in);
        int a,b;
        boolean mainus=false;
        System.out.println("введите первое число");
        a = input.nextInt();
        System.out.println("введите второе число");
        b = input.nextInt();
        //будем делать реализацию на целых числах, делаем проверки на минусы
        if(a<0&&b<0){

            a*=-1;
            b*=-1;
        }else if(a<0){
            a*=-1;
            mainus=true;
        }else if(b<0){
            b*=-1;
            mainus=true;
        }
        //проверили на выходной минус

        for (int i = 0; i <b; i++) {

            a+=a;
        }
        if(mainus){
            a*=-1;
        }
        System.out.println("результат умножения равен "+a);
        return;

    }
    public static void zadacha3(){
        /*3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *

         */
        Scanner input = new Scanner(System.in);

        int lenghs=0,taip=0;
        System.out.println("ввдите размерность массива");
        lenghs=inputValidation();

        System.out.println("выбирите тип масиива");
        taip=inputValidation();
        boolean notrue=true;
        while (notrue) {
            System.out.println("\n1)\tМатрица первого вида;\n        2)\tМатрица второго вида;\n        3)\tМатрица третьего вида;\n        4)\tматрица четвёртого ивда;\n        0)\tВыход.");
            int switch1 = inputValidation();
            switch (switch1) {
                case 0:
                    notrue = false;
                    break;
                case 1:
                    inputOne(lenghs);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("нужно ввести чисто 1,2,3,4 или 0");
            }
        }


    }


    private static int inputOne(int lenghs) {
        char mas[][]=new char[lenghs][lenghs];
        for (int i = 0; i < lenghs; i++) {
            for (int j = 0; j < lenghs; j++) {
                if(i==lenghs-j){
                    for (int k = 0; k < lenghs-j; k++) {
                        mas[i+k][j]='*';
                    }
                }
            }

        }
        for (int i = 0; i < lenghs; i++) {
            for (int j = 0; j < lenghs; j++) {
                System.out.println(mas[i][j]);
            }
        }
        return lenghs;
    }
    public static int inputValidation() {
        boolean mainus = true;
        Scanner scanner = new Scanner(System.in);
        int namber = 0;
        String str = "";
        str = scanner.next();

        char[] CharArray = str.toCharArray();
        if(str==""){
            return 0;
        }
        for(int i = 0; i < CharArray.length; ++i) {
            if (CharArray[i] == '-' && i == 0) {
                mainus = true;
            } else if (CharArray[i] <= '9' && '0' <= CharArray[i]) {
                namber *= 10;
                namber += CharArray[i] - 48;
            } else {
                System.out.println("нужно ввести  любое число ");
                namber = inputValidation();
            }
        }

        if (mainus) {
            namber *= -1;
        }

        return namber;
    }
    public static int[][] inputArrey(int[][] arrey) {
        new Scanner(System.in);
        System.out.println("Введите размерность матрици");
        int length = inputValidation();
        arrey = new int[length][length];

        for(int i = 0; i < length; ++i) {
            for(int j = 0; j < length; ++j) {
                System.out.println("введите элемент массива [" + (i + 1) + "][" + (j + 1) + "]");
                arrey[i][j] = inputValidation();
            }
        }

        return arrey;
    }


}
