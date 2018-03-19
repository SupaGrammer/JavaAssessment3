package parsing_json;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @TODO
 * This is a collection class for storing all the elements
 * Basically an in depth periodic table
 */
public class ElementCollection extends ArrayList<Element> {
    ElementCollection location = new ElementCollection();
    ArrayList<String> periodicTable = new ArrayList<>();

    //method to find the element by its Atomic index
    public Element findByAtomicNumber(int atomic_number) {
        for (Element element : this){
            if (element.getNumber() == atomic_number){
                return element;
            }
        }
        return null;
    }

    //method to find the element by its name
    public Element findByName(String name) {
        for (Element element : this){
            if (element.getName().equals(name)){
                return element;
            }
        }
        return null;
        //another failed stream T_T, tried with with pattern and matcher
        // return elements.stream().filter(element -> element.name.equalsIgnoreCase(name)).findFirst().orElse(null);
        // Pattern pattern = Pattern.compile("([A-Za-Z])\\w+");
        // Matcher nameMatcher = pattern.matcher(name);
        // if (nameMatcher.find()){
        // return findByName(name);
        // }
    }
    //method to find where
    public ElementCollection where(String fieldName, Object value) {

        return location;
    }
}
//    private static ElementCollection elementCollection = new ElementCollection();
//    private List<Element> elements;
//
//    public ElementCollection() {
//        try {
//            elements = new ArrayList<>();
//            List<String> table = Files.readAllLines(Paths.get("periodic_table.json"));
//            table.forEach(this::functions);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        System.out.println(elementCollection.findByAtomicNumber(1));
//        System.out.println(elementCollection.findByName("Hydrogen"));
//        //System.out.println(elementCollection.where("Gas", 1));
//    }
//
//    private void functions(String input){
//        try(Scanner scanner = new Scanner(input)){
//            int atomic_number = scanner.nextInt();
//            String name = scanner.next();
//        }
//    }
//    public class Element {
//        private String name;
//        private int atomic_number;
//
//        public Element(int atomic_number, String name) {
//            this.name = name;
//            this.atomic_number = atomic_number;
//        }
//
//        public String getName() {
//            return this.name;
//        }
//
//        public int getAtomicNumber(){
//            return this.atomic_number;
//        }
//    }