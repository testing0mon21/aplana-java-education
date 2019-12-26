/* Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Пользователь программы должен задавать размер массива и наполнять его числами. Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
 */


import java.util.Scanner;

public class final2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите величину массива: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.println("Введите числа: ");
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
//        System.out.println("Введите число: ");
//        for (int i = 0; i < s; i++) {
//            System.out.println(" " + a[i]);
//        }
        for (int n = 1; n < a.length; n++) {
            for (int m = 0; m < a.length - 1; m++) {
                if (a[n] < a[m]) {
                    a[n] = a[n] + a[m];
                    a[m] = a[n] - a[m];
                    a[n] = a[n] - a[m];
                }
            }
        }
        System.out.println("Отсортированные числа");
        for (int n = 0; n < a.length; n++) {

            System.out.print("Число [" + n + "]: " + a[n] + "\n");
        }

    }
}
