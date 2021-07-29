public class Kata {
    public static String encryptThis(String text) {
      if(text == "") return "";
      String[] words = text.split(" ");
      String result = "";
      String word;
      for(int i = 0; i < words.length; ++i)
      {
        word = words[i];
        switch(word.length())
        {
        case 1:
          result += Integer.toString((int)word.charAt(0));
          if(i != words.length - 1) result += " ";
          continue;
        case 2:
          result += Integer.toString((int)word.charAt(0)) + word.charAt(word.length()-1);
          if(i != words.length - 1) result += " ";
          continue;
        }
        word = word.substring(0,1) + word.charAt(word.length()-1) +
            word.substring(2,word.length()-1) + word.charAt(1); 
        word = Integer.toString((int)word.charAt(0)) + word.substring(1);
        System.out.println(word);
        result += word;
        if(i != words.length - 1) result += " ";
      }
      
      return result;
    }
}
