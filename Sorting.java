//general sorting
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {2,3,1,6,3,8,9};
        for(int i = 0; i< arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
