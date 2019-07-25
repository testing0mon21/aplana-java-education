import java.util.Scanner;

// Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.

public class task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Число в бинарном формате: ");
        String bin = scanner.nextLine();
        int bin1 = Integer.parseInt(bin, 2);
        System.out.println(bin);
    }
}
