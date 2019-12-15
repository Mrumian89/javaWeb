package laboratorium14.com.laboratorium;

import java.util.Random;

public class AnimalShelter {
    public static void main(String[] args) {


        Animal[] animals = new Animal[100];


        for (int i = 0; i < animals.length; i++) {
            Random random = new Random();
            int k = random.nextInt(3);


            switch (k) {
                case 0:
                    System.out.println("pies");
                    break;
                case 1:
                    System.out.println("kot");
                    break;
                case 2:
                    System.out.println("ptak");
                    break;
            }

                    }

        System.out.println("W kojcu 33: " + animals[33]);

    }
}