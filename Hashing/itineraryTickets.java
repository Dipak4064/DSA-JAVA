import java.util.HashMap;

public class itineraryTickets {
    public static String getStart(HashMap<String, String> tickets) {
        // for (String start : tickets.keySet()) {
        // if (!tickets.containsValue(start)) {
        // return start;
        // }
        // }
        // return null;
        HashMap<String, String> reverseMap = new HashMap<>();
        for (String key : tickets.keySet()) {
            reverseMap.put(tickets.get(key), key);
        }
        for (String key : tickets.keySet()) {
            if (!reverseMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Banglore");
        tickets.put("Bombay", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        System.out.print(getStart(tickets));
        String start = getStart(tickets);
        for(String key: tickets.keySet()){
            System.out.print("->"+tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}
