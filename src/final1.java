
/*
Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и
вывести на экран. Необходимо использовать циклы, нельзя использования готовые методы языка Java,
для перевода числа из одной системы счисления в другую.
 */

import java.util.Scanner;

public class final1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String s = sc.nextLine();
        int sum = 0, a;
        char b;
        for (int i = 0; i < s.length(); i++) {
            b = s.charAt(s.length() - 1 - i);
            if(b == '1' || b == '0') {
                if (b == '1')
                    a = 1;
                else a = 0;
            } else {
                System.out.println("Неверный ввод!");
                break;
            }
            sum += (a * Math.pow(2, i));
        }

        System.out.println("\"" + s + "\" -> " + sum);

    }
}
