class BeerSong{

    private int bottles=99;

    String sing(int bottle, int rounds)
    {
        String mssg="bottles";
        String mssg1=String.format("%d bottles",bottle-1);
        String song="";
        String s="one";



        for(int i=0;i<rounds;i++)
        {
            if(bottle == 2) {
                mssg = "bottles";
                mssg1 = String.format("%d bottle",bottle-1);
            }

            else if(bottle==1) {
                mssg="bottle";
                mssg1 = "no more bottles";
                s="it";
            }else
            {
                mssg1 = String.format("%d bottles",bottle-1);
            }


            song+= (bottle>=1) ? String.format("%d %s of beer on the wall, %d %s of beer.\nTake %s down and pass it around, %s of beer on the wall.\n",bottle,mssg,bottle,mssg,s,mssg1) : String.format( "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy " +
                    "some more, %d bottles of beer on the wall.\n",bottles);
            song+="\n";
            bottle = bottle -1;

        }
        return song;


    }

    String singSong()
    {
        return sing(99,100);
    }

}