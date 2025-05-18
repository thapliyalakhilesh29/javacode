// Method Overloading
public class Test9 {
    static int area(int a, int b){
        return a*b;
    }
    static float area (int a){
        return (22/7)*a*a ;
    }




    public static void main(String[] args) {
        System.out.println(area(2));
        System.out.println(area(2,5));
    }
}
