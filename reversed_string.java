public class reversed_string {
    public static void main(String[] args) {
        String word = "Hello";
        String reversedstr = " ";
        System.err.println("ther original string is:" + word);
        for (int i = 0; i < word.length(); i++) {
            reversedstr = word.charAt(i) + reversedstr;
        }
        System.out.println("print the reverse string is:" + reversedstr);
    }

}
