package lecture09;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rumy",10);
        map.put("Ivan",12);

        System.out.println(map.size());

        if(map.containsKey("Rumy")){
            Integer a = map.get("Rumy");
            System.out.println("Rumy has value: " + a);
        }

        for(Map.Entry<String, Integer> map1:map.entrySet()){
            System.out.println("key: " + map1.getKey() + " ... value: " + map1.getValue());
        }
    }
}
