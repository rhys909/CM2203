import java.util.Hashtable;

class dictionary {
    public dictionary(Hashtable<String, String[]> dict){
        dict = artistDict;
    }
        
    public String[] AlbumsArrayCreator() {

        //this stores each artists albums into a variable for all the artists
        String[] AlbumsArray = {"Stankonia", "Speakerboxxx", "Idlewild",
        "The Marshall Mathers LP", "The Eminem Show ", "Encore", "Relapse", "Recovery",
        "Parachutes", "A Rush of Blood to the Head", "X&Y", "Viva la Vida or Death and All His Friends",
        "Kid A", "Amnesiac", "Hail to the Theif", "In Rainbows",
        "The College Dropout", "Late Registration", "Graduation", "808s & Heartbreak", "My Beautiful Dark Twisted Fantasy",
        "Songs in A Minor", "The Diary of Alicia Keys", "As I Am", "The Element of Freedom",
        "All That You Can't Leave Behind", "How to Dismantle an Atomic Bomb", "No Line on the Horizon",
        "Toxicity", "Steal This Album!", "Mezmerize", "Hypnotize",
        "De Stijl", "White Blood Cells", "Elephant", "Get Behind Me Satan", "Icky Thump", 
        "Warning", "American Idiot", "21st Century Breakdown"};

        

        //this returns the dictionary once all of the data has been added to it
        return AlbumsArray;
       }

    public String[] ArtistArrayCreator() {

        String[] ArtistArray = {"Outkast" , "Eminem", "Coldplay", "Radiohead", "Kanye West", "Alicia Keys", "U2", "System of a Down", 
                                "The White Stripes", "Green Day"};
        
        return ArtistArray;

    }
    private Hashtable<String, String[]> artistDict = new Hashtable<String, String[]>();
}