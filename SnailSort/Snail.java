import java.util.Arrays;
public class Snail {

    public static int[] snail(int[][] array) {
      final int size = array.length;
      
      if(size == 1)
        for(int i[] : array)
          if(Arrays.equals(i, new int [0])) return i;
      
      if(size == 0) return new int[0];
      int[] result = new int[size*size];
      int index = 0, start = 0, end = size - 1;
      while(start < end)
      {
        for(int i = start; i < end; ++i)
        {
          result[index] = array[start][i];
          ++index;
        }
        for(int i = start; i < end; ++i)
        {
          result[index] = array[i][end];
          ++index;
        }
        for(int i = end; i > start; --i)
        {
          result[index] = array[end][i];
          ++index;
        }
        for(int i = end; i > start; --i)
        {
          result[index] = array[i][start];
          ++index;
        }
        ++start;
        --end;
      }
      
      if(size % 2 != 0)
        result[index] = array[size/2][size/2];
      
      return result;
    }
}
