import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class DiamondPrinter {
    int getSizeOfDiamond(char a)
    {
        int halfsize = (int)a - 64;
        return halfsize;
    }

    List<String> printToList(char a) {

        int halfSize = getSizeOfDiamond(a);
        int diamondSize = 2*halfSize-1;

        String diamond[] = new String[diamondSize];
        List<String> diamondList = new ArrayList<String>();

        int ascii = 65,index=0,bUp=halfSize-2;

        for(int i =halfSize-1;i>=0;i--)
        {
            StringBuffer eachrow = new StringBuffer();
            for(int j=0;j<halfSize;j++)
            {
                eachrow.append(i==j ?  (char)ascii++ : ' ');
            }
            diamond[index++] =eachrow.append(new StringBuilder(eachrow.substring(0,halfSize-1)).reverse()).toString();

        }
        for(;index<diamondSize;index++)
            diamond[index]= diamond[bUp--];

        diamondList = Arrays.asList(diamond);

        return diamondList;
    }

}
