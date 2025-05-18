public class stringBuilder {
    public static String reverseString( String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static String appendString(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.append("  My team");
        return sb.toString();
    }




    public static void main(String[] args) {
        String str = "Hello my name is akhilesh";
        System.out.println(reverseString(str));
        System.out.println(appendString(str));

        
    }
}
