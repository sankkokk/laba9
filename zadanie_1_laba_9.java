import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zadanie_1_laba_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер матрицы N x M (через пробел): ");
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        char[][] matrix = new char[n][m];
        System.out.println("Введите матрицу символов:");
        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            for (int j = 0; j < m; j++) {
                matrix[i][j] = line.charAt(j);
            }
        }
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я]");
        Pattern pattern1 = Pattern.compile("\\d");
        Pattern pattern2 = Pattern.compile("\\p{Punct}");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char currentChar = matrix[i][j];
                String str = String.valueOf(currentChar);
                Matcher matcher = pattern.matcher(str);
                Matcher matcher1 = pattern1.matcher(str);
                Matcher matcher2 = pattern2.matcher(str);
                if (matcher.find()) {
                    cnt1++;
                } else if (matcher1.find()) {
                    cnt2++;
                } else if (matcher2.find()) {
                    cnt3++;
                }
            }
        }
        System.out.println("Количество букв: " + cnt1);
        System.out.println("Количество цифр: " + cnt2);
        System.out.println("Количество знаков препинания: " + cnt3);
    }
}

