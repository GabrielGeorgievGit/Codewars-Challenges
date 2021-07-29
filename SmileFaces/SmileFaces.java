import java.util.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
   int smiles = 0;
    for(int i = 0; i < arr.size(); ++i) {
      String s = arr.get(i);
      if(s.length() <= 0 || s.length() > 3) continue;
      
      if(s.charAt(0) != ':' && s.charAt(0) != ';') continue;
      if(s.length() == 3)
      {
        if(s.charAt(1) != '-' && s.charAt(1) != '~') continue;
        if(s.charAt(2) != ')' && s.charAt(2) != 'D') continue;
      }else if(s.charAt(1) != ')' && s.charAt(1) != 'D') continue;
      ++smiles;
      
    }
    return smiles;
  }
}
