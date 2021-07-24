import javax.management.loading.MLetMBean;
import java.util.Scanner;
import static java.lang.Math.sqrt;

// динамический массив введён
// ищим положительные элементы
// нужно это переписать через строки , чтобы сделать проверку на символы
// пока условие вывода это 0
// выход при условии [0] это конечно дикий костыль , но изменю я то но строки , когданибудь потом
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lenght = 1, namber = 0, caunter = 0;
        int[] mas1;
        int[] mas2 = new int[lenght + 1];

        System.out.println("введите числа\n если ввлели все числа введите [Exit]");
        for (int i = 0; i < lenght; i++) {
            namber = input.nextInt();
            mas1 = new int[lenght];
            for (int j = 0; j < lenght; j++) {
                mas1[j] = mas2[j];
            }
            // я понимаю , что перезапись массива делается в отну строчку , но я перешёл с C, а там оброщенияе с памятью сокральная тема
            // мне так наглядние , но в след. программах  я буду пользаваться нормальными аператорами
            if (namber == 0) {
                break;
            }
            if (namber > 0) {
                caunter++;
            }
            mas1[i] = namber;
            mas2 = new int[lenght + 1];
            for (int j = 0; j < lenght; j++) {
                mas2[j] = mas1[j];
            }
            lenght++;
        }

        mas1 = new int[caunter];
        for (int i = 0; i < lenght; i++) {
            if (mas2[i] > 0) {
                mas1[i] = mas2[i];
            }
        }
        if (caunter != 0) {
            System.out.println("колличество положительных чисел=" + caunter + "\nположительные числа:");
            for (int i = 0; i < caunter; i++) {
                System.out.println(mas1[i]);
            }
        } else {
            System.out.println("среди чисел нет положительных");
        }

    }
}


