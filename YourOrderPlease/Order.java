public class Order {
  public static String order(String words) {
      
    if(words == "") return "";
    
    String ordered = "";
    int wordsNum = 1;
    for(int i = 0; i < words.length(); ++i)
      if(words.charAt(i) == ' ') ++wordsNum;
    
    String[] wordsA = new String[wordsNum];
    
    int index = 0;
    for(int j = 0; j < wordsNum; ++j)
    {
      String currentW = "";
      
      for(int i = index; i < words.length(); ++i)
      {
        index = i;
        if(words.charAt(i) != ' ')
          currentW += words.charAt(i);
        else
        {
          ++index;
          break;
        }
      }
      wordsA[j] = currentW;
    }
    for(int j = 1; j <= wordsNum; ++j)
    {
      for(int i = 0; i < wordsNum; ++i)
      {
        if(wordsA[i].contains(Integer.toString(j)))
        {
          ordered += wordsA[i];
          if(j != wordsNum)
            ordered += " ";
          break;
        }
        
      }
    }
    
    return ordered;
  }
}
