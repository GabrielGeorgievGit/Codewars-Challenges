public class ConsonantValue {
    public static int solve(final String s) {
    
      int result = 0;
      final String vowels = "aeiou";
      String current = "";
      int val1 = 0, val2 = 0;
      
      
      for(int i = 0; i < s.length(); ++i) {
        if(!vowels.contains(s.charAt(i) + "")) current += s.charAt(i);
        else {
          for(int k = 0; k < current.length(); ++k) {
            val2 += (int) current.charAt(k) - 96;
            
          }
          if(val1 < val2) val1 = val2;
          val2 = 0;
          current = "";
          
        }
        if(i == s.length() - 1 && current != "") {
          for(int k = 0; k < current.length(); ++k) {
            val2 += (int) current.charAt(k) - 96;
            
          }
          if(val1 < val2) val1 = val2;
        }
      }
      result = val1;
      return result;
    }
}
