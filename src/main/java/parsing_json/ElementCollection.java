package parsing_json;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
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
 * 1.)Create a lookup method to search the element by its atomic index number
 * 2.)Create a lookup method to search the element by its name
 * 3.)Create a locater(where) method to find all elements with similar fields
 */
public class ElementCollection extends ArrayList<Element> {

    public ElementCollection() {
    }

    //method to find the element by its Atomic index number
    public Element findByAtomicNumber(int atomic_number) {
        for (Element element : this){ //for each element within the table
            if (element.getNumber() == atomic_number){ //if the outcome of my getter is equal to that of the element
                return element; //then return the element
            }
        }
        return null; //should never reach null as long as a valid element is called
    }

    //method to find the element by its name
    public Element findByName(String name) {
        for (Element element : this){ //searching by name instead of number now
            if (element.getName().equalsIgnoreCase(name)){ //same as above method but ignoring the casing of element name
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
    //i really dont know wtf this method is supposed to do
    public ElementCollection where(String fieldName, Object value) {
        //Im going to assume fieldname is any of the fields listed in the element class
        //and value represents the input for that specific elements field data
        ElementCollection periodicTable = new ElementCollection();
        for (int i = 0; i < periodicTable.size(); i++){

        }
        return null;
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