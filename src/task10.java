import java.util.InputMismatchException;
import java.util.Scanner;


/*
Произведите ввод данных с клавиатуры в матрицу, а
после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3.
Размерность матрицы задается пользователем.
*/

public class task10 {

    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы");
        try {
            System.out.println("Введите количество строк в матрице ");
            Scanner sc = new Scanner(System.in);
            int numberOfStrings  = sc.nextInt();
            System.out.println("Введите количество колонок в матрице ");
            Scanner sc1 = new Scanner(System.in);
            int numberOfcolumns = sc1.nextInt();

            int k, p = 1;
            int[][] table= new int[numberOfStrings][numberOfcolumns];

            for(int i=0; i<numberOfStrings; i++){
                for(int t=0; t <numberOfcolumns; t++){
                    System.out.print("Введите значение "+ p++ + " : ");
                    table[i][t] = sc.nextInt();
                }
            }
            for(k=0; k< numberOfcolumns; k++) {
                System.out.println(table[0][k] * 3);
            }

        } catch (InputMismatchException ex) {

            System.out.println("Вы ввели слишком большое значение для размера массива ");
        } catch (ArrayIndexOutOfBoundsException ex) {

            System.out.println("Выход за границы массива ");
        }
    }
}
