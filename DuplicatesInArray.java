import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicatesInArray {

    public static void removeDuplicates(Integer[] arr){
       LinkedHashSet<Integer> list = new LinkedHashSet<Integer> (Arrays.asList(arr));
       System.out.println(list);
        


    }
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,9,3,5,2,3,8,3};
        DuplicatesInArray.removeDuplicates(arr1);
    }
}
