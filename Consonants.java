public class Consonants {

    public static void main(final String[] args) {
        String line = "The quick brown fox jumps over the lazy dog!";
        int consonants = 0;

        line = line.toLowerCase();
        for (int i = 0; i < line.length(); ++i) {
            final char ch = line.charAt(i);
            if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;

            }
        }

        System.out.println("Consonants: " + consonants);
    }
}