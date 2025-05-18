import java.util.HashMap;
public class Demo3 {
    public static void main(String[] args) {
        String str = "My name is Akhilesh thapliyal";
        str = str.toLowerCase().replaceAll(" ", "");
        char[] arr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for( char key : arr){
            map.put(key,map.getOrDefault(key, 0)+1);

        }
        System.out.println(map);
    }
}
