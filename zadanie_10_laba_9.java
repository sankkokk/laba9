import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class zadanie_10_laba_9 {
    public static void main(String[] args) {
        String text = "Иванова;Анна;Петровна;женский;российская;170;55;2000-05-15;101000,Россия,Москва,Центральный,Тверская,10,5;+79161234567." +
                "Петров;Иван;Сергеевич;мужской;российский;180;75;1999-08-20;101000,Россия,Москва,Центральный,Тверская,10,6;+79161234568.";
        String[] objects = text.split("\\.");
        List<String[]> data = new ArrayList<>();
        for (String object : objects) {
            data.add(object.split(";"));
        }
        int count = 0;
        int lowestAge = 100;
        String[] youngestModel = null;
        for (String[] model : data) {
            LocalDate birthDate = LocalDate.parse(model[7]);
            int age = Period.between(birthDate, LocalDate.now()).getYears();
            if (model[9].startsWith("+7") && age >= 20 && age <= 23) {
                count++;
            }
            if (age < lowestAge) {
                lowestAge = age;
                youngestModel = model;
            }
        }
        System.out.println("Количество людей с российскими номерами телефона и возрастом от 20 до 23 лет: " + count);
        System.out.println("Данные про самую молодую манекенщицу: ");
        System.out.println(Arrays.toString(youngestModel));
    }
}

