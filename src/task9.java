/*Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран, где каждый элемент массива умножается на 2.
        Размер массива задается пользователем.*/

import java.util.Scanner;
import  java.lang.ArrayIndexOutOfBoundsException;
import java.util.InputMismatchException;


public class task9 {

    public static void main(String[] args) {

        System.out.println("Ввведите размер массива(длину)");
        try {
            Scanner sc = new Scanner(System.in);
            int arrayDimension = sc.nextInt();
            int[] sample = new int[arrayDimension];
            System.out.println("Размер  массива = " + sample.length );
            for(int i=1; i<sample.length; i++){
                System.out.print("Введите значение " + i + " ");
                sample[i] = sc.nextInt();
            }
            for(int i=1; i<sample.length; i++) {
                System.out.println(sample[i] * 2);
            }
        } catch (InputMismatchException ex) {

            System.out.println("Вы ввели слишком большое значение для размера массива ");
        } catch (ArrayIndexOutOfBoundsException ex) {

            System.out.println("Выход за границы массива ");
        }
    }
}
