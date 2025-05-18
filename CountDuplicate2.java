import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;
import java.util.Set;

public class CountDuplicate2 {
    public static void main(String[] args) {
        
        String str = "Hello My Name Is Akhilesh";
         str =  str.toLowerCase().replaceAll(" ", "");
        System.out.println(str);

        char[] arr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : arr) {
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        System.out.println(map);
        Set<Entry<Character, Integer>> entry = map.entrySet();
        for(Entry<Character, Integer> e : entry) {
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + " : " + e.getValue());
            }
        }

    }
    

        


    
    
}
