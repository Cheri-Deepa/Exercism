class IsogramChecker {

    boolean isIsogram(String phrase) {

            phrase = phrase.toLowerCase();

            for(int i=0;i<phrase.length();i++)
            {
                    if(phrase.charAt(i)!=' '&& phrase.charAt(i)!='-' && phrase.lastIndexOf(phrase.charAt(i))!=i)
                        return false;
            }
            return true;

    }

}
