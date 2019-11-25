import java.lang.NumberFormatException;
import java.util.Scanner;

// Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.

public class task4 {

    public static void main(String[] args) {

        System.out.println("Введите число в двоичном формате формате: ");
        Scanner scanner = new Scanner(System.in);
        String bin = scanner.nextLine();
        int bin1 = task4.parseToDecimal(Integer.valueOf(bin));
        System.out.println(bin1);

    }

    /** статический метод возвращающий true если входящий параметр двоичное число, иначе false
     */
    public static boolean validateIntOneZero(int number) throws NumberFormatException {
        return String.valueOf(number).matches("^[0,1]+") || Integer.toOctalString(number).matches("^[0,1]+");
    }
    /** статический метод  переводящий число из 2-ой системы  в 10 */
    public static int parseToDecimal(int a) throws NumberFormatException {
        String aToString = String.valueOf(a);
        char [] chars = aToString.toCharArray();
        int result = 0;
        int mult = 1;
        try {
            if (task4.validateIntOneZero(a)) {
                for (int i = aToString.length()-1; i >= 0; i--) {
                    if (chars[i]=='1') {
                        result += mult;
                    }
                    mult*=2;
                }

            }

        } catch (NumberFormatException e){
            System.out.println("Вы ввели не число а строку " + "  Описание ошибки" + e);
        }
        return result;
    }
}
