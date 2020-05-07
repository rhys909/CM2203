import java.util.Hashtable;

public class dictionary {
    public static void main(String[] args) {

        Hashtable<String, String[]> artistDict = new Hashtable<String, String[]>();
        Hashtable<String, String> albumsDict = new Hashtable<String, String>();
        Hashtable<String, String[]> genreDict = new Hashtable<String, String[]>();
        
        String[] outkastAlbums = {"Stankonia", "Speakerboxxx", "Idlewild"};
        artistDict.put("OutKast", outkastAlbums);

        System.out.println(artistDict.get("OutKast"));

    }

}