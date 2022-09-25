public class Kata{
  public static double find_average(int[] array){
    if(array == null) return 1;
    double sum = 0, average = 0;
    for(int i : array){
      sum += i;
    }
    return average = sum / array.length;
  }
}