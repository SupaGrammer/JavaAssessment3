package parsing_json;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

/**
 * @TODO
 * The generate method in this class should load the JSON text (periodic_table.json) into
 * an ElementColletion (my period table array)
 * Then return the Collection (periodic table)
 */

public class ElementCollectionInitializer {
    public static ElementCollection generate() throws FileNotFoundException {
        Gson gson = new Gson(); //new gson object to convert from Json later
        JsonReader jsonReader = new JsonReader(new FileReader("/Users/kieranthomas/Dev/JavaAssessment3/src/main/resources/periodic_table.json")); //reader that reads my Json file
        ElementCollection periodicTable = new ElementCollection(); //new collection object
        Element[] table = gson.fromJson(jsonReader, Element[].class); //converting my gson to json and storing it in an element array
        periodicTable.addAll(Arrays.asList(table)); //adding my array as a list to my periodictable using the file that was read
        return periodicTable; //return the newly formatted json table as a list
    }
}
//        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
//        File file = new File(classLoader.getResource(this.fileName).getFile());
//        StringBuilder sb = new StringBuilder("");
//        try (Scanner scanner = new Scanner(file)){
//            while (scanner.hasNextLine()){
//                String line = scanner.nextLine();
//                sb.append(line).append("\n");
//            }
//            scanner.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        return sb.toString();