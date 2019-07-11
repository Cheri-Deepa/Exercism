class IsbnVerifier {

    boolean isValid(String stringToVerify) {

            stringToVerify = stringToVerify.replace("-","");
            int index=10;
            int sum=0;
            if(stringToVerify.length()==10) {
                for (int i=0;i<10;i++) {
                    int asciiChar = (int)stringToVerify.charAt(i)-48;
                    if (asciiChar>=0 && asciiChar <=9)
                    {

                        sum+=asciiChar*index;
                        index--;
                    }
                    else if(i==9 && asciiChar==40)
                        sum+=10*index--;
                    else
                        return false;

                }
                return sum%11==0 ?true:false;

            }
            return false;

    }

}
