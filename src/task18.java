/*Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
Количество строк после перезаписи должно быть столько же, сколько
и в изначальном варианте.
 */

import java.io.*;

public class task18 {

    public static void main(String[] args) {
        int i = 0;
        String s;
        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\Mikhail\\IdeaProjects\\projectjava\\src\\text2.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                i++;
            }
        }
        catch (IOException exp) {
            System.out.print("Ошибка вывода " + exp);
        }
        String s2;
        System.out.println("Введите текст в несколько строк");
        try (BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fileWriter =
                     new FileWriter("C:\\Users\\Mikhail\\IdeaProjects\\projectjava\\src\\text2.txt")) {
            for (; i > 0; i--) {
                System.out.println("Введите текст: ");
                s2 = br2.readLine();
                s2 = s2 + "\r\n";
                fileWriter.write(s2);
            }
        }
        catch (IOException exp) {
            System.out.print("error2 " + exp);
        }


    }
}
