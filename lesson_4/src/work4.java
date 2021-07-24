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
            System.out.println("\n1)\tзадание 1\n2)\tЗадание 2;\n3)\tзадание 3(не совсем работает);\n0)\tВыход.");
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
        Scanner input = new Scanner(System.in);
        //это у нас задача на анёбы
        int anyba =1,hour=24;
        hour=input.nextInt();
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
        int a,b,sum=0;
        boolean mainus=false;
        System.out.println("введите первое число");
        a = input.nextInt();
        System.out.println("введите второе число");
        b = input.nextInt();
        //будем делать реализацию на целых числах, делаем проверки на минусы
        if(a<0&&b<0){

            a*=-1;
            b*=-1;
        }else if(a<0||b<0){
            mainus=true;
            if(a<0){
                a*=-1;
            }
            if(b<0){
                b*=-1;
            }
        }
        //проверили на выходной минус
        if(b==0){
            System.out.println("результат умножения равен 0");
        }else if(b==1){
            if(mainus){
                a*=-1;
            }
            System.out.println("результат умножения равен "+a);
        }else {

            for (int i = 0; i<b; i++) {

                sum+=a;
            }
            if(mainus){
                sum*=-1;
            }
            System.out.println("результат умножения равен "+sum);
        }


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
    public static int inputValidation(){
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int namber=1;

        if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            namber = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную

        } else {
            System.out.println("Вы ввели не целое число");
        }
        return namber;
    }
}
