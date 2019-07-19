class TwelveDays {
   private final  String days[] = {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};

    String verse(int verseNumber) {
        String stanza = String.format("On the %s day of Christmas my true love gave to me: ",days[verseNumber-1]);
        switch(verseNumber)
        {
            case 12 :  stanza+="twelve Drummers Drumming, " ;

            case 11 : stanza+="eleven Pipers Piping, " ;

            case 10 : stanza+="ten Lords-a-Leaping, " ;

            case 9  : stanza+="nine Ladies Dancing, " ;

            case 8  : stanza+="eight Maids-a-Milking, " ;

            case 7  : stanza+="seven Swans-a-Swimming, ";

            case 6 :  stanza+="six Geese-a-Laying, ";

            case 5 : stanza+="five Gold Rings, ";

            case 4 : stanza+="four Calling Birds, " ;

            case 3 :  stanza+="three French Hens, ";

            case 2:  stanza+="two Turtle Doves, and ";

            case 1:   stanza+="a Partridge in a Pear Tree.\n";

        }
        return stanza;
    }

    String verses(int startVerse, int endVerse) {
        String stanzas ="";
        for(int i=startVerse;i<=endVerse;i++) {
             stanzas += verse(i);
            if (i<endVerse)
                stanzas+= "\n";
        }
        return  stanzas;
    }

    String sing() {
        return  verses(1,12);
    }
}