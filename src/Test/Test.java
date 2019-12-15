package Test;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A("test");
        B b = new B("testujemy");

    }

}

class A {
    A() {
        System.out.println("Działa konstruktor A()");
    }
    A(String param) {
        System.out.println("Działa konstruktor A(" + param + ")");
    }
    void show () {
        System.out.println("A");
    }
}

class B extends A {
    B(){
        super(); //zostanie wywołane niezależnie czy zostało wpisane
        System.out.println("Działa konstruktor B()");
    }
    B(String param) {
        System.out.println("Działa konstruktor B(" + param + ")");
    }
    void show() {
        System.out.println("B");
    }
}
