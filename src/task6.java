import java.util.Scanner;

import static java.lang.Math.*;

/* Написать программу, которая будет выполнять следующие действия:

        1. Ввод трех чисел с клавиатуры x, y, z

        2. Нахождение и вывод на экран среднего арифметического чисел x, y, z

        3. Деление среднего арифметического на 2 без остатка

        4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
*/
public class task6 {

    public static void main(String[] args) {
        System.out.println("Введите 3 числа ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        double a = (x+z+y)/3.0;
        System.out.println("Среднее арифметическое чисел x z y = "+a);
        if((int) abs(a/2)>3)
            System.out.println("Программа выполнена корректно");

    }
}
