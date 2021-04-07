package mentoring4;

import java.util.ArrayList;
import java.util.HashMap;

public class PracticingHashMap {
    public static void main(String[] args) {



        String[] carModel ={"Lincoln MKT", "Mercdes class c", "BMW 5 series"};

        ArrayList<String> plateNumber = new ArrayList<>();
        plateNumber.add("NYC-45255");
        plateNumber.add("MA-58458");
        plateNumber.add("FL584533");

        HashMap<String, String> carModelAndPLate = new HashMap<>();
        carModelAndPLate.put("Lincoln MKT", "NYC-45255");
        carModelAndPLate.put("Mercdes class c", "MA-58458");
        carModelAndPLate.put("BMW 5 series","FL584533");

        System.out.println(carModelAndPLate);
        System.out.println();
        for (String i:carModelAndPLate.keySet()) {
            System.out.println(i);
        }
        System.out.println();
        for (String k:carModelAndPLate.values()){
            System.out.println(k);
        }
    }
}
