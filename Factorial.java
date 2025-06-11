import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        float num = scan.nextFloat();

        int fact = 1;
        for( int i = 1; i<= num; i++){
            fact= fact*i;

        }
        System.out.println(fact);


    }
}
