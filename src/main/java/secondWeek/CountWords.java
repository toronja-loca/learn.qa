package secondWeek;

public class CountWords {
    public static void main(String[] args) {
        String sentence = "Пятница это лучший день";
        int count = 0;
        if (sentence.length() != 0) {
            count++;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    count++;
                }
            }
            System.out.println("Всего " + count + " слов");
        }
    }
}
