package Lec03;

public class Main {
    public static void main(String[] args) {


        Foo foo1 = new Foo() {
            @Override
            public void m1() {
                System.out.println("m1");
                ;
            }

            @Override
            public void m2() {
                System.out.println("m2");
            }

        };

    }

}
