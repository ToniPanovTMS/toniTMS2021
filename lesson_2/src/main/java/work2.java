import java.util.Scanner;
public class work2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a=0f, b=0f,sum=0;
        // будим считать, что значения не самые большие , и сделаем поправку на числа после запятой ( пишу код с телефона простите )
        System.out.println("введите первое число");
        a = input.nextFloat();
        System.out.println("введите второе число");
        b = input.nextFloat();
        // ввели 2 числа (уже на этом месте много ошибок , но на их импраавления надро писать отдельные функции ввода)
        sum+=a+b;
        System.out.println("сумма этих двух чисел равна=["+sum+"]");
    }
}
