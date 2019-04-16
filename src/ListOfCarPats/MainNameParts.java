package ListOfCarPats;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainNameParts {
    public static void main(String[] args) {

        String listParts = "engine:1:8000.00/wheels:4:550.00/sets:3:250.00/dor:2:3000.25/glass:1:120.50";
        List<NameParts> list = new ArrayList<>();

        for (String s : listParts.split("/")) {
            String[] onePart = s.split(":");
            list.add(new NameParts(onePart[0], Integer.valueOf(onePart[1]), Double.valueOf(onePart[2])));

            System.out.println(Arrays.toString(onePart));

        }
    }

}
