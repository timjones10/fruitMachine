import java.util.ArrayList;
import java.util.Collections;

public class Machine {

    Machine() {

    }

    private ArrayList<String> coloursArray = new ArrayList<>();

    public ArrayList<String> spin() {
        addColours("black", "white", "yellow", "red");
        coloursArray = Collections.shuffle(coloursArray);
        return coloursArray;
    }

    private ArrayList<String> addColours(String... colours) {
        for (String c : colours) {
            coloursArray.add(c);

        }
    }
}