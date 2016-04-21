import java.util.*;

public class Anagrams {

  public static boolean runAnagrams(String words) {
    String[] inputAnagram = words.split(" ");
    ArrayList<String> anagramArray = new ArrayList<String>(Arrays.asList(inputAnagram));
    char[] word1 = anagramArray.get(0).toCharArray();
    char[] word2 = anagramArray.get(1).toCharArray();

    char[] sorted1 = Arrays.sort(word1);
    char[] sorted2 = Arrays.sort(word2);

    if ( sorted1.equals(sorted2) ) {
      return true;
    } else {
      return false;
    }
  }
}

//
// split string into array
// collection.sort array
// see if arrays equal eachother arrayStuff[0].equals(arrayStuff[1])
