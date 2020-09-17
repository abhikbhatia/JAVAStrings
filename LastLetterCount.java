public class LastLetterCount {
    private String _firstSWord;
    private String _firstYWord;

    LastLetterCount(String input) {
        int count = countSY(input);
        String newSentence = wordSwap(input);
        System.out.println(newSentence);
        System.out.println("The number of words ends with s or y is: " + count);
    }

    public int countSY(String input) {
        String[] words = input.split("[\\W]");
        int endsInS = 0;
        int endsInY = 0;
        for (String word : words) {
            if (word.toLowerCase().charAt(word.length() - 1) == 's') {
                endsInS++;
                if (endsInS == 1) {
                    _firstSWord = word;
                }
            } else if (word.toLowerCase().charAt(word.length() - 1) == 'y') {
                endsInY++;
                if (endsInY == 1) {
                    _firstYWord = word;
                }
            }
        }
        return endsInS + endsInY;
    }

    public String wordSwap(String input) {
        input = input.replaceAll("\\b" +_firstSWord+ "\\b", "tempWord");
        input = input.replaceAll("\\b" +_firstYWord+ "\\b", _firstSWord);
        input = input.replaceAll("tempWord", _firstYWord);
        return input;
    }

    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog!";
        new LastLetterCount(str1);
    }
}