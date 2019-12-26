
// Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task16 {

    public static void main(String[] args) {
        String s;
        try(BufferedReader br = new BufferedReader(new FileReader("/Users//mac/education/JavaKuznetsov/text.txt"))){
            while((s = br.readLine())!= null){
                System.out.println(s);
            }
        }
        catch (IOException exc){
            System.out.println("Ошибка ввода-вывода: " + exc);
        }

    }
}
