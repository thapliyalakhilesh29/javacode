import java.util.Scanner;
// take size and all the elements of array as input from the user & print it

public class Test16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter all the integer type element in your array: ");
        int[]a= new int[size];
        for(int i = 0; i<size; i++){
            a[i] = scan.nextInt();
        }
        System.out.println();
        for (int j : a) {
            System.out.println(j);
        }
    }
}
