import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a Character:");
        char letter = scan.next().charAt(0);
        scan.nextLine(); // Consume the leftover newline
    
        
        System.out.println("Enter a String:");
        String str = scan.nextLine();
        
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        
        System.out.println("Occurrences of '" + letter + "': " + count);
        
        scan.close();
    }
}
