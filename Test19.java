import java.util.Arrays;

public class Test19 {
    public static void main(String[] args) {
        String str = "akhilesh@gmail.com";
        String[] a = str.split("@");

        // Correct way to print the array
        System.out.println(Arrays.toString(a));
    }
}
