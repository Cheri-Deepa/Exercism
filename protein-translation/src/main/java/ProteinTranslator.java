import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
class ProteinTranslator {

   Map<String,String>  codonMap = new HashMap<String,String>();

   ProteinTranslator() {
       codonMap.put("AUG", "Methionine");
       codonMap.put("UUU", "Phenylalanine");
       codonMap.put("UUC", "Phenylalanine");
       codonMap.put("UUA", "Leucine");
       codonMap.put("UUG", "Leucine");
       codonMap.put("UCU", "Serine");
       codonMap.put("UCC", "Serine");
       codonMap.put("UCA", "Serine");
       codonMap.put("UCG", "Serine");
       codonMap.put("UAU", "Tyrosine");
       codonMap.put("UAC", "Tyrosine");
       codonMap.put("UGU", "Cysteine");
       codonMap.put("UGC", "Cysteine");
       codonMap.put("UGG", "Tryptophan");
       codonMap.put("UAA", "STOP");
       codonMap.put("UAG", "STOP");
       codonMap.put("UGA", "STOP");
   }
    List<String> translate(String rnaSequence) {
        List<String> proteins = new ArrayList<String>();

        for(int i=0;i<rnaSequence.length();i+=3)
        {
            String codon = rnaSequence.substring(i,i+3);

            String protein = codonMap.get(codon);

            if((protein).equals("STOP"))
                return proteins;

            proteins.add(protein);

        }
        return proteins;

    }
}