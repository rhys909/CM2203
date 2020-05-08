import java.util.Hashtable;

class dictionary {
    public dictionary(Hashtable<String, String[]> dict){
        dict = artistDict;
    }

       // Hashtable<String, String[]> albumsDict = new Hashtable<String, String[]>();
       // Hashtable<String, String[]> genreDict = new Hashtable<String, String[]>();
        
    public Hashtable<String, String[]> dictionaryCreator() {
        String[] outkastAlbums = {"Stankonia", "Speakerboxxx", "Idlewild"};
        String[] eminemAlbums = {"The Marshall Mathers LP", "The Eminem Show ", "Encore", "Relapse", "Recovery"};
        String[] coldplayAlbums = {"Parachutes", "A Rush of Blood to the Head", "X&Y", "Viva la Vida or Death and All His Friends"};
        String[] radioheadAlbums = {"Kid A", "Amnesiac", "Hail to the Theif", "In Rainbows"};
        String[] kanyeWestAlbums = {"The College Dropout", "Late Registration", "Graduation", "808s & Heartbreak", "My Beautiful Dark Twisted Fantasy"};
        String[] aliciakeysAlbums = {"Songs in A Minor", "The Diary of Alicia Keys", "As I Am", "The Element of Freedom"};
        String[] u2Albums = {"All That You Can't Leave Behind", "How to Dismantle an Atomic Bomb", "No Line on the Horizon"};
        String[] soadAlbums = {"Toxicity", "Steal This Album!", "Mezmerize", "Hypnotize"};
        String[] whiteStripesAlbums = {"De Stijl", "White Blood Cells", "Elephant", "Get Behind Me Satan", "Icky Thump"};
        String[] greenDayAlbums = {"Warning", "American Idio"};

        artistDict.put("OutKast", outkastAlbums);
        artistDict.put("Eminem", eminemAlbums);
        artistDict.put("Coldplay", coldplayAlbums);
        artistDict.put("Radiohead", radioheadAlbums);
        artistDict.put("Kanye West", kanyeWestAlbums);
        artistDict.put("Alicia Keys", aliciakeysAlbums);
        artistDict.put("U2", u2Albums);
        artistDict.put("System of a Down", soadAlbums);
        artistDict.put("The White Stripes", whiteStripesAlbums);
        artistDict.put("Green Day", greenDayAlbums);

        //Just add here 
       // System.out.println(artistDict.get("OutKast"));

        return artistDict;
       }

    private Hashtable<String, String[]> artistDict = new Hashtable<String, String[]>();
}