/*
Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
(Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
 */

import java.util.Scanner;

public class final3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму в рублях ");
        double d = sc.nextDouble();
        System.out.println("Введите текущий курс доллара к рублю ");
        double k = sc.nextDouble();
        System.out.printf("%.2f",d/k);
    }

}
