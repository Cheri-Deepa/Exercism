class LuhnValidator {
    int getSum(String data )
    {
        int sum=0;
        for(int i=0;i<data.length();i++)
        {
            int digit =((int)data.charAt(i))-48;
            if(!(digit>=0&&digit<=9))
            {
                sum =-1;
                break;
            }
            sum+= digit;
        }

        return  sum;
    }

    boolean isValid(String candidate) {
        candidate = candidate.replaceAll("\\s","");
        if(candidate.length()<=1)
            return false;

        char[] candidat = candidate.toCharArray();
        for(int i=candidate.length()-2;i>=0;i-=2)
        {
            int digit = (int)candidat[i]-48;
            if(digit>=0&&digit<=9) {
                int doubledigit = digit *2;
                digit =  doubledigit>9 ? doubledigit - 9 : doubledigit ;
                digit = digit + 48 ;

                candidat[i] = (char) digit ;
            }
            else return  false;
        }

        int sum = getSum(new String(candidat));
        if(sum==-1) return false;
        return  (sum%10==0)  ? true : false;

    }

}
