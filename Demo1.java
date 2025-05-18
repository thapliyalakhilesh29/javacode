import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashSet;

public class Demo1 {
    public static void main(String[] args) {
        String str = "Akhilesh Thapliyal";
        String str1 = str.toLowerCase().replaceAll(" ", "");
        System.out.println(str1);
        char[]str2= str1.toCharArray();
        // if letter is duplicate then print the index
        // remove the duplicate letter
        // count the duplicate

       
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> duplicate = new HashSet<>();

        for( Character key : str2){
            if (set.contains(key)){
                duplicate.add(key);
            }
            else{
                set.add(key);
            }
        }
        System.out.println(set);
        System.out.println(duplicate);
        String str3= set.toString();
        System.out.println(str3);
        ;



        
    }

}