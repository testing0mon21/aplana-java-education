import java.util.Scanner;

// Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.


public class task11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст ");
        String text = sc.nextLine();
        System.out.println(text);
    }
}
