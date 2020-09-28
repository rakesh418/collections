import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(100,"Amit");
        map.put(103,"Vijay");
        map.put(102,"Rahul");
        map.put(101,"Dutta");
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }

        map.entrySet().stream().sorted((a,b)->a.getKey().compareTo(b.getKey())).forEach(System.out::println);
    }
}
