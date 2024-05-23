public class countword {
    public static void main(String[] args) {
        String word;
        int CountWord;
        word = "one two three four five";
        CountWord = word.split("\\s").length;
        System.out.println(CountWord);

    }

}