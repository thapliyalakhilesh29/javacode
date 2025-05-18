import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter your Second String: ");
        String str2 = sc.nextLine();

        String str = str1+str2;
        System.out.println("New string is " + str + " and the lenth of this string is: " + str.length());
        
    }

}
