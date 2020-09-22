public class Count {

    public static void main(String[] args) {
        String line = "The quick brown fox jumps over the lazy dog!";
        int vowels = 0;

        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
                }
        }

        System.out.println("Number of Vowels in String: " + vowels);
    }
}