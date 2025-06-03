import java.util.Arrays;
import java.util.LinkedHashSet;

public class Demo4 {
    public static void main(String[] args) {
        int[] arr = {4,5,8,9,2,4,2,6,9,5,7};
        Arrays.sort(arr);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i= 0; i<arr.length; i++){
            set.add(arr[i]);
        }
     System.out.println(set.toString());
     Object [] arr2 = set.toArray();
     System.out.println(arr2[1]);

    }
}
