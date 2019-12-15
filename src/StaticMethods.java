public class StaticMethods {
    public static void main(String[] args) {
        B b = new B();
        b.print(); // tożsame z wywołaniem B.print();

        A a = b;
        a.print(); // tożsame z wywołaniem A.print();
    }
}

class A {
    static void print() {
        System.out.println("A");
    }
}

class B extends A {
    static void print() {
        System.out.println("B");
    }
}