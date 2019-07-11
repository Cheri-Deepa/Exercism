import java.util.List;
import java.util.ArrayList;
class LargestSeriesProductCalculator {

    String number ;
    LargestSeriesProductCalculator(String inputNumber) {
        number = inputNumber;
        if(!validateString())
        throw new IllegalArgumentException("String to search may only contain digits.");

    }
    boolean validateString()
    {
        for( int i=0;i<number.length();i++)
        {
            if(!(number.charAt(i)>=48&&number.charAt(i)<=57))
                return  false;
        }
        return  true;
    }
    List<String> slices(int slicesize)
    {
        if(slicesize<0)
            throw new IllegalArgumentException("Series length must be non-negative.");
        else if(number.length()<slicesize)
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        else {
            List<String> substring = new ArrayList<String>();
            for (int i = 0; i+slicesize <= number.length(); i++)
                substring.add(number.substring(i, i + slicesize));

            return substring;
        }
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        long maxproduct =0;
        List<String>  substring = slices(numberOfDigits);

        for(String substr :substring)
        {
            long prod = 1;
            for(int i=0;i<substr.length();i++)
            {
                int digit =(int) substr.charAt(i)-48;

                prod = prod * digit ;
            }
            if(prod>maxproduct)
                maxproduct = prod;
        }
        return  maxproduct;
        }

    }

