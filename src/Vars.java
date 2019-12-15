public class Vars {

    int i; // zadeklarowana zmienna egzemplarza (pole klasy)
    static int j = 2; // zmienna statyczna (pole statyczne)
    int g = 6;

    public static void main(String[] args) {
        int i = 77;
        Vars v = new Vars();
        v.i = 9;
        System.out.println("Wyświetlamy zmienną egzemplarza dla v: " + v.i);
        Vars vv = new Vars();
        vv.i = 5;
        System.out.println("Wyświetlamy zmienną egzemplarza dla vv: " + vv.i);
        System.out.println("Wyświetlamy zmienną klasową (statyczną): " + j);
        System.out.println("Wyświetlamy zmienną lokalną: " + i);



    }

    public int change() {
        int k = 7;
        return i + (k + j);
    }


    void show() {
        System.out.println("-------");

    }


}
