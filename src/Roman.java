import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Roman {
    public void RomanConv (ArrayList<String> list) {
        Map<String, Integer> map = CreateMap();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            if (list.get(0).equals(key)) {
                list.set(0, pair.getValue().toString());
            }
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            if (list.get(2).equals(key)) {
                list.set(2, pair.getValue().toString());
            }
        }
    }

    public Map<String, Integer> CreateMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("VI", 6);
        map.put("VII", 7);
        map.put("VIII", 8);
        map.put("IX", 9);
        map.put("X", 10);

        return map;
    }
}
