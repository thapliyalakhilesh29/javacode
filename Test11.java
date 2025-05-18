import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: " );
        String str = scan.nextLine();
        System.out.println("Enter a char: ");
        char letter =scan.next().charAt(0);

        int count = 0;

        for (int i=0; i< str.length(); i++){
            if (str.charAt(i)== letter){
                count++;

            }
        }
        System.out.println(count);
    }
}
