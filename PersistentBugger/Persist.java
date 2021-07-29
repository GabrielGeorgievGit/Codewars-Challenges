class Persist {
  public static long persistence(long n) {
    long number = n;
    int br =0;
    int len = Long.toString(n).length();
    if(len <= 1)return br;
    int []numbers = new int[len];
    while(Integer.valueOf(len)>1)
    {
      br++;
      for(int i = 0 ; i < len; i++)
      {
        numbers[i] = Math.toIntExact(number) % 10;
        number /= 10;
        
      }
      number = 1;
      for(int i = 0 ; i < len; i++)
      {
        number *= numbers[i];
      }
      len = Long.toString(number).length();
    }
    return br;
      
  }
}
