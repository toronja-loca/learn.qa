package secondWeek;

public class countBackspace {
    public static void main(String[] args) {
        String sentence = "Пятница это лучший день";
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isWhitespace(sentence.charAt(i))) count++;
        }
        System.out.println(count);
    }
}
