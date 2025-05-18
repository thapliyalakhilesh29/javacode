import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class CountDuplicates {
    public static void main(String[] args) {
        String str = "Hello this is akhilesh";
        str = new String(str.toLowerCase());
        str = new String(str.replaceAll(" ", ""));
        System.out.println(str);

        char[] arr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char key : arr) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }

        }
    
        System.out.println(map);

    }

}