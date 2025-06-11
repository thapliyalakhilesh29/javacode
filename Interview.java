import java.util.Arrays;

public class Interview {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 40, 50, 60 };
        int[] arr2 = new int[arr.length + 1];
        for (int i = 0; i < 2; i++) {
            arr2[i] = arr[i];   
        }
        arr2[2] = 100;
        for(int i=3; i<arr2.length;i++){
            arr2[i]= arr[i-1];
        }
        System.out.println(Arrays.toString(arr2));
        
        System.out.println(Arrays.toString(arr2));

    }
}
