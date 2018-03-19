package parsing_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.sun.tools.internal.ws.processor.model.Response;

import java.util.ArrayList;
import java.util.List;



/**
 * This class should only implement getters
 * @POJO : Plain old java object class
 * 1.) This class shouldn't have to extend anything (shouldn't be a subclass of anything)
 * 2.) This class shouldn't implement any pre-specified interface or follow any specific pattern
 * 3.) This class shouldn't contain any pre-specified annotations
 * Basically this class should only have getters and setters for respective properties
 * ===================GSON NOTES======================
 * Each time gson sees a {}, it creates a StringMap
 * Each time gson sees a '', it creates a String
 * Each time gson sees a number, it creates a Double
 * Each time gson sees a [], it creates an ArrayList
 */

public class Element {
    //common element fields
    private String name;
    private String appearance;
    private double atomic_mass;
    private double boil;
    private String category;
    private String color;
    private double density;
    private String discovered_by;
    private double melt;
    private double molar_heat;
    private String named_by;
    private int number;
    private int period;
    private String phase;
    private String source;
    private String spectral_img;
    private String symbol;
    private int xpos;
    private int ypos;
    private String summary;
    private ArrayList<Integer> shells;

    public Element(String name, String appearance, double atomic_mass, double boil, String category, String color, double density, String discovered_by, double melt, double molar_heat, String named_by, int number, int period, String phase, String source, String spectral_img, String summary, String symbol, int xpos, int ypos, ArrayList<Integer> shells) {
        this.name = name;
        this.appearance = appearance;
        this.atomic_mass = atomic_mass;
        this.boil = boil;
        this.category = category;
        this.color = color;
        this.density = density;
        this.discovered_by = discovered_by;
        this.melt = melt;
        this.molar_heat = molar_heat;
        this.named_by = named_by;
        this.number = number;
        this.period = period;
        this.phase = phase;
        this.source = source;
        this.spectral_img = spectral_img;
        this.symbol = symbol;
        this.xpos = xpos;
        this.ypos = ypos;
        this.summary = summary;
        this.shells = shells;
    }

    public String getName() {
        return name;
    }

    public String getAppearance() {
        return appearance;
    }

    public double getAtomic_mass() {
        return atomic_mass;
    }

    public double getBoil() {
        return boil;
    }

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }

    public double getDensity() {
        return density;
    }

    public String getDiscovered_by() {
        return discovered_by;
    }

    public double getMelt() {
        return melt;
    }

    public double getMolar_heat() {
        return molar_heat;
    }

    public String getNamed_by() {
        return named_by;
    }

    public int getNumber() {
        return number;
    }

    public int getPeriod() {
        return period;
    }

    public String getPhase() {
        return phase;
    }

    public String getSource() {
        return source;
    }

    public String getSpectral_img() {
        return spectral_img;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getXpos() {
        return xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public ArrayList<Integer> getShells() {
        return shells;
    }

    public String getSummary() {
        return summary;
    }
//
//    public static void main(String[] args) {
//        Gson gson = new GsonBuilder().create();
//        String myJson = "[\n" +
//                "    {\n" +
//                "        \"name\": \"Hydrogen\", \n" +
//                "        \"appearance\": \"colorless gas\", \n" +
//                "        \"atomic_mass\": 1.008, \n" +
//                "        \"boil\": 20.271, \n" +
//                "        \"category\": \"diatomic nonmetal\", \n" +
//                "        \"color\": null, \n" +
//                "        \"density\": 0.08988, \n" +
//                "        \"discovered_by\": \"Henry Cavendish\", \n" +
//                "        \"melt\": 13.99, \n" +
//                "        \"molar_heat\": 28.836, \n" +
//                "        \"named_by\": \"Antoine Lavoisier\", \n" +
//                "        \"number\": 1, \n" +
//                "        \"period\": 1, \n" +
//                "        \"phase\": \"Gas\", \n" +
//                "        \"source\": \"https://en.wikipedia.org/wiki/Hydrogen\", \n" +
//                "        \"spectral_img\": \"https://en.wikipedia.org/wiki/File:Hydrogen_Spectra.jpg\", \n" +
//                "        \"summary\": \"Hydrogen is a chemical element with chemical symbol H and atomic number 1. With an atomic weight of 1.00794 u, hydrogen is the lightest element on the periodic table. Its monatomic form (H) is the most abundant chemical substance in the Universe, constituting roughly 75% of all baryonic mass.\", \n" +
//                "        \"symbol\": \"H\", \n" +
//                "        \"xpos\": 1, \n" +
//                "        \"ypos\": 1, \n" +
//                "        \"shells\": [\n" +
//                "            1\n" +
//                "        ]\n";
//        //Parse data
//        //myJson = myJson.replaceAll(" \" ", "'");
//        Response response = gson.fromJson(myJson, Response.class);
//    }
}