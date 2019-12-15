package Test;

public class Library {
    public static void main(String[] args) {


        Book[] Book = new Book[4];

        Book[0] = new Book("Ogniem i mieczem", "Sienkiewicz", "Wydawnictwo A","1986");
        Book[1] = new Book("Quo Vadis","Sienkiewicz", "Wydawnictwo A", "2000");
        Book[2] = new Book("Quo Vadis","Sienkiewicz", "Wydawnictwo A", "2000");
        Book[3] = new Book("Lalka",  "Prus", "Wydawnictwo C", "2000");


        System.out.println(Book[0].equals(Book[2]));
        System.out.println(Book[1].equals(Book[2]));

    }
}