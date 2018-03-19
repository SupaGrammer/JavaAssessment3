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
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new FileReader("/Users/kieranthomas/Dev/JavaAssessment3/src/main/resources/periodic_table.json"));
        ElementCollection periodicTable = new ElementCollection();
        Element[] table = gson.fromJson(jsonReader, Element[].class);
        periodicTable.addAll(Arrays.asList(table));
        return periodicTable;
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