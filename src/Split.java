import java.util.ArrayList;
import java.util.Collections;

public class Split {
    public Split() {
    }

    public ArrayList<String> SplitString (String line) {
        ArrayList<String> list = new ArrayList<>();
        String[] words = line.split(" ");

        Collections.addAll(list, words);

        return list;
    }

}
