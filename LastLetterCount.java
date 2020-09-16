public class LastLetterCount {
public int endWithmOrn(String stng) 
{
  int l = stng.length();
  int ctr = 0;
  stng = stng.toLowerCase();
  for (int i = 0; i < l; i++) 
  {
    if (stng.charAt(i) == 's' || stng.charAt(i) == 'y') 
	{
      if (i < l-1 && !Character.isLetter(stng.charAt(i+1)))
        ctr++;
      else if (i == l-1)
        ctr++;
    }
  }
  return ctr;
}

public static void main (String[] args)
    {
      LastLetterCount letter= new LastLetterCount();
      String str1 =  "The quick brown fox jumps over the lazy dog!";
      System.out.println("The number of words ends eith s or y is: "+letter.endWithmOrn(str1));
	  }
}