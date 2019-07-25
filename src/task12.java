import java.util.Scanner;

// Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.


public class task12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст ");
        String text = sc.nextLine();
        text = text.replaceAll("\\s","" );
        System.out.println(text);
    }
}
