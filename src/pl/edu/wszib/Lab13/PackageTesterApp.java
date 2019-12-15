package pl.edu.wszib.Lab13;

public class PackageTesterApp {
    public static void main(String[] args) {

        pl.edu.wszib.Lab13.package1.PackageTester a = new pl.edu.wszib.Lab13.package1.PackageTester();
        pl.edu.wszib.Lab13.package2.PackageTester b = new pl.edu.wszib.Lab13.package2.PackageTester();
        pl.edu.wszib.Lab13.package3.PackageTester c = new pl.edu.wszib.Lab13.package3.PackageTester();

        a.show();
        b.show();
        c.show();

    }
}
