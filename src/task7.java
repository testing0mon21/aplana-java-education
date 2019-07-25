import java.util.Scanner;

/*Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number. В программе должны присутствовать константы X, Y, Z.
        Программа должна сравнивать введенное значение с клавиатуры со значением констант и вывести на экран сообщение "Данное значение имеется в константах"
        если number=X или Y или Z.
        Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"*/
public class task7 {

    public static void main(String[] args) {

        final int x=4, y=1, z=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = sc.nextInt();
        switch (number) {
            case x:
            case y:
            case z:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
        }

    }
}
