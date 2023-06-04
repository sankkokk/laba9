import java.util.*;

public class zadanie_7_laba_9 {
    public static void main(String[] args) {
        String str1 = "hello world hello";
        String str2 = "world java programming";
        String[] arr1 = str1.split(" ");
        String[] arr2 = str2.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr1) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        List<String> list = new ArrayList<>();
        for (String s : arr2) {
            if (!map.containsKey(s)) {
                list.add(s);
            }
        }
        for (String s : arr1) {
            if (map.get(s) >= 2 && !list.contains(s)) {
                list.add(s);
            }
        }
        String result = String.join(" ", list);
        System.out.println(result);
    }
}

