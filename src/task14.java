import java.util.Scanner;

public class task14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        String s = sc.nextLine();
        int x = Integer.parseInt(s);
        double y = (double) x;
        System.out.println(s);
        System.out.println(x);
        System.out.println(y);
    }
}
