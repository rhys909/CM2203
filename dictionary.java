import java.util.ArrayList;
import java.util.stream.Collectors;

import org.apache.jena.sparql.function.library.print;

import java.io.*;

class dictionary {
        
    public static String AlbumsArrayCreator() {

        //this stores each artists albums into a variable for all the artists
        String[] albumsArray = {"Stankonia", "Speakerboxxx", "Idlewild",
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
        return albumsArray.toString();
       }

    public static String fileToString() throws IOException {
        String FileToRead = "/AlbumDict.txt";

        InputStream inst = dictionary.class.getResourceAsStream(FileToRead);
        BufferedReader br = new BufferedReader(new InputStreamReader(inst));
        String temp = br.lines().collect(Collectors.joining(System.lineSeparator()));

        br.close();
        return temp;
    }
    
}