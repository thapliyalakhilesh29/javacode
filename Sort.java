import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[]arr = {2,5,1,6,9,3,4};
        for(int i= 0; i<arr.length-1;i++){
            for(int j =0; j< arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){
                    arr[j]= arr[j]+arr[j+1];
                    arr[j+1]= arr[j]- arr[j+1];
                    arr[j]= arr[j]-arr[j+1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
