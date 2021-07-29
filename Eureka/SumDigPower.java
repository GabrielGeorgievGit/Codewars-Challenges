import java.util.ArrayList;
import java.util.List;
class SumDigPower {
    
    public static List<Long> sumDigPow(long a, long b) {
            long from = a, to = b;
    List<Long> Eureka = new ArrayList<Long>();
    for(long i = from; i < to; i++)
    {
      long digitsNum = String.valueOf(i).length();
      long number = i;
      long sumNum = 0;
      while(number > 0)
      {
        sumNum += Math.pow(number % 10, digitsNum);
        number /= 10;
        digitsNum--;
      }
      if(i == sumNum)
      {
        Eureka.add(i);
      }
    }
    return Eureka;
    
    }
}
