public class Word { 
   
    static final int OUT = 0; 
    static final int IN = 1; 
       
    static int countWords(String str) 
    { 
        int state = OUT; 
        int wc = 0;
        int i = 0; 
          
        while (i < str.length()) 
        { 
            if (str.charAt(i) == ' ' || str.charAt(i) == '\n' 
                    || str.charAt(i) == '\t') 
                state = OUT; 
                  
       
            else if (state == OUT) 
            { 
                state = IN; 
                ++wc; 
            } 
       
            ++i; 
        } 
        return wc; 
    } 
       
    public static void main(String args[]) 
    { 
        String str = "The quick brown fox jumps over the lazy dog!"; 
        System.out.println("Number of Words in String: " + countWords(str)); 
    } 
} 