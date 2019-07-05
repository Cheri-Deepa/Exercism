public class PangramChecker {

    public boolean isPangram(String input) {

       input  = input.toLowerCase();

       for(int i=97;i<=122;i++)
       {
           if(input.indexOf((char)i)<0)
                return false;
       }
       return true;


    }
}
