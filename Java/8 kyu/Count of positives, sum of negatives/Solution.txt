public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
      int p = 0;
      int n = 0;
      for(int number : input){
        if(number > 0){
          p++;
        } else {
          n += number;
        }
      }
        return new int[] {p, n};
    }
}