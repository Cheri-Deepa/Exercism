class TwelveDays {
   private final  String days[] = {"","first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
   private final String gifts[] = {"","a Partridge in a Pear Tree.","two Turtle Doves","three French Hens","four Calling Birds","five Gold Rings","six Geese-a-Laying","seven Swans-a-Swimming","eight Maids-a-Milking","nine Ladies Dancing","ten Lords-a-Leaping","eleven Pipers Piping","twelve Drummers Drumming"};

    String verse(int verseNumber) {
        String Verse = String.format("On the %s day of Christmas my true love gave to me: ",days[verseNumber]);

        if(verseNumber==1)
            Verse=String.format("%s%s\n",Verse,gifts[verseNumber]);
        else{
            for(int i = verseNumber;i>0;i--){
                Verse = String.format("%s%s",Verse,gifts[i]);
                Verse = i==2 ? String.format("%s, and ",Verse) : i!=1 ? String.format("%s, ",Verse) : String.format("%s\n",Verse) ;
            }
        }
        return Verse;
    }

    String verses(int startVerse, int endVerse) {
        String resultedVerse ="";
        for(int i=startVerse;i<=endVerse;i++)
            resultedVerse  = i<endVerse ? String.format("%s%s\n",resultedVerse,verse(i)) : String.format("%s%s",resultedVerse,verse(i));
        return  resultedVerse ;
    }

    String sing() {
        return  verses(1,12);
    }
}