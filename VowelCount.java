import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String str= scan.nextLine();
        scan.close();
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]=='a' && arr[i]=='e'|| arr[i]=='i' || arr[i]=='o' || arr[i]=='u' ){
                count =count+1;
            }
        }
        System.out.println(count);
        


    }
}
