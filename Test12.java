public class Test12 {
    public static void main(String[] args) {
        int a[] = { 10, 3, 5, 6, 12, 8, 4 };
        int max = a[0];
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i]> max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
