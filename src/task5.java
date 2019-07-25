import java.util.Scanner;

// Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.

public class task5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = scan.nextInt();
        System.out.println(number+"x1="+1*+number);
        System.out.println(number+"x2="+2*+number);
        System.out.println(number+"x3="+3*+number);
        System.out.println(number+"x4="+4*+number);
        System.out.println(number+"x5="+5*+number);
        System.out.println(number+"x6="+6*+number);
        System.out.println(number+"x7="+7*+number);
        System.out.println(number+"x8="+8*+number);
        System.out.println(number+"x9="+9*+number);
        System.out.println(number+"x10="+10*+number);

    }
}
