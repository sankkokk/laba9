class zadanie_12_laba_9{
    public static void main(String[] args) {
        String message = "1 (life) 2 (student) 3 (multitasking) 4 (knowledge)  5 (fight way ancestors) 6 (In the goat mouth the grass is sweet) 7 (The water in the new jug is cold) 8 (Beat like a fish on the kitchen table) 9 (When the pigs fly)";
        String[] englishWords = {"life", "student", "multitasking", "knowledge", "fight", "way", "ancestors"};
        String[] russianWords = {"жизнь", "студент", "многозадачность", "знания", "бороться", "путь", "предки"};
        String[] foreignProverbs = {"In the goat mouth the grass is sweet", "The water in the new jug is cold", "Beat like a fish on the kitchen table", "When the pigs fly"};
        System.out.println(message);
        String[] russianProverbs = {"На вкус и цвет товарища нет", "Новая метла чисто метет", "Биться, как рыба об лед", "После дождичка в четверг"};
        for (int i = 0; i < englishWords.length; i++) {
            message = message.replaceAll("\\b" + englishWords[i] + "\\b", russianWords[i]);
        }
        for (int i = 0; i < foreignProverbs.length; i++) {
            message = message.replaceAll(foreignProverbs[i], russianProverbs[i]);
        }
        System.out.println(message);
    }
}
