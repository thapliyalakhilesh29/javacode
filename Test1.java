import java.util.Scanner;

public class Test1 {
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two Numbers");
        int num1= s.nextInt();
        int num2= s.nextInt();
        System.out.println("the sum of the two no is "+ (num1+num2));

    }
}
