public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
      if(input == null || input.length == 0 ) return new int[] {};
      int p = 0, n = 0;
      for(int i : input){
        if(i > 0){  
          p++;
        } else if(i < 0) {
          n += i;
        } 
      }
      return input = new int[] {p, n};
    }
}