import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = { 2,8,9,5,3,7,6,9};
        for(int i=0; i<arr.length-1; i++){
            for(int j =0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //int temp= arr[j];
                    //arr[j]= arr[j+1];
                    //arr[j+1]= temp;
                    arr[j]= arr[j]+arr[j+1];
                    arr[j+1]= arr[j]- arr[j+1];
                    arr[j]= arr[j]- arr[j+1];


                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
