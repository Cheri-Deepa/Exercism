class ResistorColor {

   private String Colors[]= {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String givencolor) {

        int colorCode = -1;
        for(String color : Colors)
        {
            ++colorCode;
            if(color.equals(givencolor))
               break;
        }
        return colorCode;
    }

    String[] colors() {
        return Colors;
    }
}
