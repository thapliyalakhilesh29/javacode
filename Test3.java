public class Test3 {
    static int sum (int x, int y) {
        int z =  x +  y;
        return z;


    }

    static String reveseString(String str){
        StringBuilder s = new StringBuilder(str);
        StringBuilder s1 =  s.reverse(); 
        return s1.toString();   
    }


    public static void main(String[] args) {
        System.out.println(Test3.sum(3,5));
        
        //Test3 input = new Test3();
        System.out.println(Test3.reveseString("Akhilesh Thapliyal"));

    }
}
