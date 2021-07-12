import javax.management.loading.MLetMBean;
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class work3 {
    Scanner input = new Scanner(System.in);
    //не собран
    //первая задача


        /*float a=0f, b=0f,sum=0;
        // будим считать, что значения не самые большие , и сделаем поправку на числа после запятой ( пишу код с телефона простите )
        System.out.println("введите первое число");
        a = input.nextFloat();
        System.out.println("введите второе число");
        b = input.nextFloat();
        // ввели 2 числа (уже на этом месте много ошибок , но на их импраавления надро писать отдельные функции ввода)
        sum+=a+b;
        System.out.println("сумма этих двух чисел равна=["+sum+"]");
        ??????????????????????????????????????????????????????????????
        вторая задача
         */
        /*float a=0f, b=0f,sum=0;
        System.out.println("введите первое число");
        a = input.nextFloat();
        System.out.println("введите второе число");
        b = input.nextFloat();
        if(a==b){
            System.out.println("числа равные");
        }else if(a>b){
            System.out.println("первое число больше");
        }else {
            System.out.println("второе число больше");
        }
        ???????????????????????????????????????????????????????????????
        третья задача
         */
        /*
        int lenght = 1, namber = 0;
        int[] mas1;
        int[] mas2 = new int[lenght + 1];
        int sum=0;

        System.out.println("введите числа\n если ввлели все числа введите [Exit]");
        for (int i = 0; i < lenght; i++) {
            namber = inputValidation();
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
        //ввлели массив (сделаем вид , что это работает(нет))
        for (int i = 0; i < mas2.length; i++) {
            sum+=mas2[i];
        }
        sum=sum/ mas2.length;
        System.out.println("среднее арифметическое данного массива="+sum);
        ????????????????????????????????????????????????????????????????????????
        четвёртая задача
       */
        /*
        int lenght = 1, namber = 0;
        int[] mas1;
        int[] mas2 = new int[lenght + 1];
        int max=0;
        System.out.println("введите числа\n если ввлели все числа введите [Exit]");
        for (int i = 0; i < lenght; i++) {
            namber = inputValidation();
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
        //ввлели массив (сделаем вид , что это работает(нет()нет))
        for (int i = 0; i < mas2.length; i++) {
            if (i==0){
                max=mas2[i];
            }else if (mas2[i]>max){
                max=mas2[i];
            }

        }
        //по этой вроде всё
        ?????????????????????????????????????????????????????????????
        пятая задача
         */
        /*
        double a,b,c = 0f;//будет doyble потому что flout не работате с квадратным корнем
        System.out.println("введите первый катет");
        a = input.nextFloat();
        System.out.println("введите второй катет");
        b = input.nextFloat();
        // сталось вспомнить тиорему пифогора
        c =a*a+b*b;
        c = sqrt(c);
        System.out.println("гипатинуза равна ="+c);
        */
    // надеюсь , что утром успею залить это на гитхаб
    // разделю на разные папки к среде (надеюсь)

}




