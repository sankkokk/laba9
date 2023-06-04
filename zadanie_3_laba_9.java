import java.util.Scanner;

public class zadanie_3_laba_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите последовательность символов: ");
        String str = in.nextLine();
        int cnt1 = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c) && Character.UnicodeBlock.of(c) == Character.UnicodeBlock.CYRILLIC) {
                cnt1++;
            }
        }
        System.out.println("Количество строчных русских букв: " + cnt1);
        System.out.print("Введите символ для поиска: ");
        char searchChar = in.nextLine().charAt(0);
        int cnt2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == searchChar) {
                cnt2++;
            }
        }
        if (cnt2 > 0) {
            System.out.println("Символ " + searchChar + " встречается " + cnt2 + " раз");
        } else {
            System.out.println("Символ " + searchChar + " не найден");
        }
        System.out.print("Введите цифру для поиска: ");
        char searchDigit = in.nextLine().charAt(0);
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) && str.charAt(i) == searchDigit) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Среди символов есть 2 и более цифры, входящие в цифру " + searchDigit);
        } else {
            System.out.println("Среди символов нет 2 и более цифр, входящих в цифру " + searchDigit);
        }
        boolean flag1 = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == ')' || c == '{' || c == '}' || c == '[' || c == ']') {
                flag1 = true;
                break;
            }
        }
        if (flag1) {
            boolean flag3 = true;
            int cntBraket1 = 0;
            int cntBraket2 = 0;
            int cntBraket3 = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '(') {
                    cntBraket1++;
                } else if (c == ')') {
                    cntBraket1--;
                } else if (c == '{') {
                    cntBraket2++;
                } else if (c == '}') {
                    cntBraket2--;
                } else if (c == '[') {
                    cntBraket3++;
                } else if (c == ']') {
                    cntBraket3--;
                }
                if (cntBraket1 < 0 || cntBraket2 < 0 || cntBraket3 < 0) {
                    flag3 = false;
                    break;
                }
            }
            if (flag3 && cntBraket1 == 0 && cntBraket2 == 0 && cntBraket3 == 0) {
                System.out.println("Среди символов есть пара соседствующих скобок и все пары закрыты");
            } else {
                System.out.println("Среди символов есть пара соседствующих скобок, но не все пары закрыты");
            }
        } else {
            System.out.println("Среди символов нет пары соседствующих скобок");
        }
        boolean flag4 = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') {
                flag4 = true;
                break;
            }
        }
        if (flag4) {
            System.out.println("Среди символов есть более двух подряд идущих пробелов");
        } else {
            System.out.println("Среди символов нет более двух подряд идущих пробелов");
        }
        boolean flagE = false;
        for (int i = 0; i < str.length() - 3; i++) {
            if (Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i + 1)) && Character.isDigit(str.charAt(i + 2)) && Character.isDigit(str.charAt(i + 3))) {
                int a = Character.getNumericValue(str.charAt(i));
                int b = Character.getNumericValue(str.charAt(i + 1));
                int c = Character.getNumericValue(str.charAt(i + 2));
                int d = Character.getNumericValue(str.charAt(i + 3));
                if (a > b && b > c && c < d) {
                    flagE = true;
                    break;
                }
            }
        }
        if (flagE) {
            System.out.println("Среди символов есть последовательность, удовлетворяющая условию");
        } else {
            System.out.println("Среди символов нет последовательности, удовлетворяющей условию");
        }
    }
}

