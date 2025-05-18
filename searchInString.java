import java.util.Scanner;

public class searchInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = scan.nextLine();
        System.out.println("Enter the character: ");
        char a = scan.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count = count + 1;
            }
        }
        System.out.println("the entered character is repeating in given string " + count + " times");

    }
}
