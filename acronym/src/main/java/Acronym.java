class Acronym {

    private String phrase;
    private String acrony;
    Acronym(String phrase) {
        this.phrase = phrase;
        this.acrony = "";
    }

    String get() {
        String acronym[] = phrase.toUpperCase().replace("_","").replace(" - "," ").replace("-"," ").split(" ");
        for(String word:acronym){
            acrony+=word.charAt(0);
        }
        return acrony;
    }

}
