import java.util.ArrayList;
import java.util.List;
class Series
{
    private String series;

    Series(String series)
    {
        this.series = series ;
    }

    List<String> slices(int slicesize)
    {
        if(slicesize<=0)
            throw new IllegalArgumentException("Slice size is too small.");
        else if(series.length()<slicesize)
            throw new IllegalArgumentException("Slice size is too big.");
        else {
            List<String> substring = new ArrayList<String>();
            for (int i = 0; i+slicesize <= series.length(); i++)
                substring.add(series.substring(i, i + slicesize));

            return substring;
           }
    }
}