import java.util.ArrayList;
import static java.lang.Math.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zadanie_4_laba_9 {
    public static void main(String[] args) {
        char[][] array = {
                {'1', '0', '0', '0', '/','1', '0', '^', '3', '*','(', '2', '-', '1', ')','=', '1'},
                {'0', '0', '0', '0', '/','1', '0', '^', '2', '*','(', '2', '-', '1', ')','=', '1'},
                {'0', '0', '0', '0', '/','1', '0', '^', '2', '*','(', '2', '-', '1', ')','=', '1'},
                {'0', '0', '0', '0', '/','1', '0', '^', '2', '*','(', '2', '-', '1', ')','=', '1'},
                {'/', '0', '0', '0', '/','1', '0', '^', '2', '*','(', '2', '-', '1', ')','=', '1'},
                {'1', '0', '0', '0', '/','1', '0', '^', '2', '*','(', '2', '-', '1', ')','=', '1'},
                {'0', '0', '0', '0', '/','1', '0', '^', '2', '*','(', '2', '-', '1', ')','=', '1'},
                {'^', '0', '0', '0', '/','1', '0', '^', '2', '*','(', '2', '-', '1', ')','=', '1'},
                {'2', '0', '0', '0', '/','1', '0', '^', '2', '*','(', '2', '-', '1', ')','=', '1'},
                {'*', '0', '0', '0', '/','1', '0', '^', '2', '*','(', '2', '-', '1', ')','=', '1'},
                {'(', '0', '0', '0', '/','1', '0', '^', '2', '*','(', '2', '-', '1', ')','=', '1'},
                {'5', '0', '0', '0', '/','1', '0', '^', '2', '*','(', '2', '-', '1', ')','=', '1'},
                {'-', '0', '0', '0', '/','1', '0', '^', '2', '*','(', '2', '-', '1', ')','=', '1'},
                {'2', '0', '0', '0', '/','1', '0', '^', '2', '*','(', '2', '-', '1', ')','=', '1'},
                {')', '0', '0', '0', '/','1', '0', '^', '2', '*','(', '2', '-', '1', ')','=', '1'},
                {'=', '0', '0', '0', '/','1', '0', '^', '2', '*','(', '2', '-', '1', ')','=', '1'},
                {'1', '0', '0', '0', '/','1', '0', '^', '2', '*','(', '2', '-', '1', ')','=', '1'},
        };
        ArrayList<String> incorrect = new ArrayList<>();
        ArrayList<String> correct = new ArrayList<>();
        ArrayList<String> corrected = new ArrayList<>();
        String str = "";
        String str1 = "";
        for (int i = 0; i < array.length; i++) {
            str = "";
            str1 = "";
            for (int j = 0; j < array[i].length; j++) {
                str += array[i][j];
                str1 += array[j][i];
            }
            if(str.matches("1000/10\\^\\d+\\*\\(\\d+-\\d\\)=\\d")){
                String [] array1 = str.split("\\D");
                int result = (int) (Integer.parseInt(array1[0])/pow(Integer.parseInt(array1[1]),Integer.parseInt(array1[2])) *(Integer.parseInt(array1[4])-Integer.parseInt(array1[5])));
                if (Integer.parseInt(array1[7]) != result) {
                    incorrect.add(str);
                    array1[7] = String.valueOf(result);
                    corrected.add(array1[0]+"/"+array1[1]+"^"+array1[2]+"("+array1[4]+"-"+array1[5]+")="+array1[7]);
                }
                else correct.add(str);
            }
            if(str1.matches("1000/10\\^\\d+\\*\\(\\d+-\\d\\)=\\d")){
                String [] array1 = str1.split("\\D");
                int result = (int) (Integer.parseInt(array1[0])/pow(Integer.parseInt(array1[1]),Integer.parseInt(array1[2])) *(Integer.parseInt(array1[4])-Integer.parseInt(array1[5])));
                if (Integer.parseInt(array1[7]) != result) {
                    incorrect.add(str1);
                    array1[7] = String.valueOf(result);
                    corrected.add(array1[0]+"/"+array1[1]+"^"+array1[2]+"("+array1[4]+"-"+array1[5]+")="+array1[7]);
                }
                else correct.add(str1);
            }

        }
        System.out.println("Incorrect expressions:");
        for (String expression : incorrect) {
            System.out.println(expression);
        }
        System.out.println("Correct expressions:");
        for (String expression : correct) {
            System.out.println(expression);
        }
        System.out.println("Corrected expressions:");
        for (String expression : corrected) {
            System.out.println(expression);
        }
    }
}
