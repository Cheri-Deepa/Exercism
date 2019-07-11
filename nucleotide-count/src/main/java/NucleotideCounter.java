import java.util.HashMap;
import java.util.Map;

class NucleotideCounter
{
    private String DNA;
   private Map<Character,Integer> nucleotidescount = new HashMap<Character,Integer>();


    NucleotideCounter(String dna)
    {
        this.DNA = dna;

        nucleotidescount.put('A',0);
        nucleotidescount.put('C',0);
        nucleotidescount.put('G',0);
        nucleotidescount.put('T',0);

        for(int i=0;i<DNA.length();i++)
        {
            char ch = DNA.charAt(i);
            if((ch!='A' && ch!='C'&& ch!='G'&& ch!='T'))
                throw new IllegalArgumentException("");
            else
                nucleotidescount.put(ch,nucleotidescount.get(ch)+1);
        }
    }

    Map<Character,Integer> nucleotideCounts()
    {
        return nucleotidescount;
    }
}