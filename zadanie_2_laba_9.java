import java.util.Scanner;

public class zadanie_2_laba_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        boolean isValid;
        do {
            System.out.print("Введите число в 13-ой системе счисления: ");
            input = in.nextLine().toUpperCase();
            isValid = check(input);
            if (!isValid) {
                System.out.println("Неверный ввод. Пожалуйста, введите число в 13-ой системе счисления.");
            }
        } while (!isValid);
        String binaryNumber = toBinary(input);
        System.out.println("Число в 2-ой системе счисления: " + binaryNumber);
    }
    private static boolean check(String input) {
        return input.matches("^[0-9ABC]*$");
    }

    private static String toBinary(String base13Number) {
        int decimalNumber = Integer.parseInt(base13Number, 13);
        return Integer.toBinaryString(decimalNumber);
    }
}

