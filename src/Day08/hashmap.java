package Day08;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("house1",1);
        map.put("house2",2);
        map.put("house3",0);
        map.put("house4",2);
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" :" +entry.getValue());
        }
    }
}
