class RaindropConverter {

    String convert(int number) {

            String result = "";
            if(number%3==0)
                result=result+"Pling";
            if(number%5==0)
                result=result+"Plang";
            if(number%7==0)
                result=result+"Plong";

            if(result.isEmpty())
                result=Integer.toString(number);

            return result;


    }

}
