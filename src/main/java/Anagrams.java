import java.util.ArrayList;

public class Anagrams {

  public static ArrayList<String> runAnagrams(String word1, String word2) {
    ArrayList<String> inputAnagram = new ArrayList<String>();
    inputAnagram.add(word1);
    inputAnagram.add(word2);

    return inputAnagram;
  }
}

//
// split string into array
// collection.sort array
// see if arrays equal eachother arrayStuff[0].equals(arrayStuff[1])
