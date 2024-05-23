import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, String> cities = new HashMap<String, String>();
        cities.put("england", "london");

        cities.put("india", "mumbai");
        cities.put("uk", "hyderabad");
        cities.put("ireland", "chennai");
        for (String i : cities.keySet()) {
            System.out.println(i);
        }
        for (String i : cities.values()) {
            System.out.println(i);
        }
    }

}
