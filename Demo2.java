import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        String str = "Akhilesh Thapliyal";
        String str1 = str.toLowerCase().replaceAll(" ", "");
               
       char[]arr = str1.toCharArray();

       HashSet<Character>set = new LinkedHashSet<>();
       HashSet<Character>duplicate = new HashSet<>();
       StringBuilder sb = new StringBuilder();

       for(int i=0; i<str1.length(); i++){
        if (set.contains(arr[i])){
            System.out.println(arr[i] + " is at location of index: " + i);
            duplicate.add(arr[i]);

        }
        else{
            set.add(arr[i]);
            sb.append(arr[i]);
        }
       }
       System.out.println(set);

     System.out.println(sb);
       
    }
}
