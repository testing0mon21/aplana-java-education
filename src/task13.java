import java.util.Scanner;

/*

Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение.

*/

public class task13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку ");
        String one = sc.nextLine();
        System.out.println("Введите вторую строку ");
        String two = sc.nextLine();

        if(one.length()>two.length())
            System.out.println(one);
        else if (one.length()<two.length()) {
            System.out.println(two);
        } else {
            System.out.println("Длины строк равны");
        }

    }
}
