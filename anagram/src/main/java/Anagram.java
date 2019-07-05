import java.util.*;
class Anagram {

    String word;
    Anagram(String word)
    {
        this.word = word;
    }

   String  sortWord(String givenword)
    {

        char []wordarr = (givenword.toLowerCase()).toCharArray();
        Arrays.sort(wordarr);
        givenword = String.valueOf(wordarr);
        return givenword;
    }
   List<String> match(List<String> possibleAnagrams)
    {
        ArrayList<String> anagrams=new ArrayList<String>();

        String sortedWord = sortWord(word);
        String lowerCaseWord = word.toLowerCase();

        for(String anagram: possibleAnagrams)
        {
            if(word.length()== anagram.length()&& !(lowerCaseWord).equals(anagram.toLowerCase()) )
            {
                if((sortedWord).equals((sortWord(anagram))))
                    anagrams.add(anagram);
            }
        }

        return anagrams;

    }



}