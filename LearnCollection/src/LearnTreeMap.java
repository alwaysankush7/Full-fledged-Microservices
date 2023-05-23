import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
    public static void main(String[] args) {
        //Same functionality of hashmap but it order the insertion  on the basis of keys
        Map<String, Integer> number= new TreeMap<>();
        number.put("One", 1);
        number.put("Two", 2);
        number.put("Three", 3);
        number.put("Four", 4);
        number.put("Five", 4);
        //Hence value might be duplicate
        System.out.println(number);
        //if we insert a new value with same key then 2nd one will be override the first one
        number.put("One",5);
        System.out.println(number);

        number.putIfAbsent("eihgt",7);
        System.out.println(number);

        for(Map.Entry<String,Integer> entry : number.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        for(String key : number.keySet()){
            System.out.println(key);
        }
    }
}
