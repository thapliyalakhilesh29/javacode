public class Practice1 {
    public static void main(String[] args) {

        InnerPractice1 obj = new Child();
        obj.concrete();
        obj.greet();
        System.out.println(obj.getClass());

    }
}

abstract class InnerPractice1 {
    public void greet() {
    }

    public void concrete() {
        System.out.println("this is concrete method1");
    }
}

class Child extends InnerPractice1 {
    public void greet() {
        System.out.println("Namaste");
    }

    public void sound() {
        System.out.println("male sound");
    }

    public void concrete(){
    System.out.println("this is concrete method2");
  }
}
