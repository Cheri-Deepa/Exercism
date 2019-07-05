import java.util.HashMap;
class RnaTranscription {

   private HashMap<String, String> map = new HashMap<>();
   private  String rna = "";

    RnaTranscription()
    {

        map.put("A", "U");
        map.put("C", "G");
        map.put("G", "C");
        map.put("T", "A");

    }

    String transcribe(String dnaStrand) {
        for(int i =0 ;i<dnaStrand.length();i++)
        {
            String chromo = dnaStrand.charAt(i)+"";
            rna += map.get(chromo);
        }
        return  rna;
    }

}
