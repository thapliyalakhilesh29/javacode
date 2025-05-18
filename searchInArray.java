import java.util.Scanner;

public class searchInArray {
    public static void duplicateElementInArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of an array:");
        int n = scan.nextInt();
        System.out.println("Enter the nubers: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the number looking for: ");
        int num = scan.nextInt();
        scan.close();
        int count=0;
        for(int i =0; i<n; i++){
            if (arr[i] == num){
                count= count+1;
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        duplicateElementInArray();

    }
}
