public class Palindrome { 
  
    static boolean isPalindrome(final String str) 
    { 
  
        int i = 0, j = str.length() - 1; 
  
        while (i < j) { 
  
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
  
            i++; 
            j--; 
        } 
  
        return true; 
    } 
  
    public static void main(final String[] args) 
    { 
        final String str = "radar";
  
        if (isPalindrome(str)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
} 