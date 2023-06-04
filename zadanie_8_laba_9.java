import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zadanie_8_laba_9 {
    public static void main(String[] args) {
        String str = "мы будем гулять 12.05.2023 . На следующей неделе будем гулять 20/06/23. а вот в 31-12-2022 мы уже погуляли. также прогулка будет 01.01.2024.";
        String converted = convertDates(str);
        System.out.println(converted);
    }
    public static String convertDates(String text) {
        Pattern pattern = Pattern.compile("(\\d{1,2})[./-](\\d{1,2})[./-](\\d{2,4})");
        Matcher matcher = pattern.matcher(text);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            String day = matcher.group(1);
            String month = matcher.group(2);
            String year = matcher.group(3);
            if (year.length() == 2) {
                year = "20" + year;
            }
            if (Integer.parseInt(month) > 12 || Integer.parseInt(day) > 31) {
                matcher.appendReplacement(sb, "date error");
            } else {
                matcher.appendReplacement(sb, year + "." + month + "." + day);
            }
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
}

