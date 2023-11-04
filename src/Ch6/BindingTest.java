package Ch6;

class BindingTest {
    public static void main(String[] args) {
        Parent2 p2 = new Child2();
        Child2 c2 = new Child2();

        System.out.println("p.x2 = " + p2.x);
        p2.method();

        System.out.println("c2.x = " + c2.x);
        c2.method();
    }
}

class Parent2 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child2 extends Parent2 {
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}