
public class PigLatin {
    public static String pigIt(String str) {
        String[] res = str.split(" ");
      int i = 0;
      for(String r : res)
      {
        char first = r.charAt(0);
        if(!Character.isAlphabetic(first)) continue;
        res[i] = r.substring(1) + first + "ay";
        ++i;
      }
      return String.join(" ", res);
    }
}