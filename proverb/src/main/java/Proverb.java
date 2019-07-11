class Proverb {

    private String words[];

    Proverb(String[] words) {
             this.words = words;
    }

    String recite() {
        String result ="";
        for(int i=1;i<words.length;i++)
        {
            result+=String.format("For want of a %s the %s was lost.\n",words[i-1],words[i]);
        }
        if(words.length>0)
            result+=String.format("And all for the want of a %s.",words[0]);

        return result;
             
    }

}
