public class zadanie_5_laba_9 {
    public static void main(String[] args) {
        String text = "я люблю гулять, мы гуляем каждый день, мой отец гуляет каждый день, твой отец тоже гуляет каждый день";
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int cnt4 = 0;
        String[] words = text.split("\\s+");
        for (String word : words) {
            switch (word) {
                case "я":
                    cnt1++;
                    break;
                case "мы":
                    cnt2++;
                    break;
                case "мой":
                    cnt3++;
                    break;
                case "твой":
                    cnt4++;
                    break;
            }
        }
        System.out.println("Количество местоимений \"я\": " + cnt1);
        System.out.println("Количество местоимений \"мы\": " + cnt2);
        System.out.println("Количество местоимений \"мой\": " + cnt3);
        System.out.println("Количество местоимений \"твой\": " + cnt4);
    }
}

