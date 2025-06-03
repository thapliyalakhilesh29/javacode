public class ReverseString {

    public static String method1(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
        
    }

    public static void main(String[] args) {
      System.out.println( ReverseString.method1("Akhilesh"));


    }
}
