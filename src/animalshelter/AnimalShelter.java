package animalshelter;

import java.util.Random;

public class AnimalShelter {

    public final static int PEN_NUMBER = 33;
    public final static int TOTAL_PEN_NUMBER = 100;



    public static void main(String[] args) {
        Random random = new Random();
        Animal[] animals = new Animal[TOTAL_PEN_NUMBER];

        for (int i = 0; i < TOTAL_PEN_NUMBER; i++) {
            int r = random.nextInt(3); // 0,1,2
            switch (r) {
                case 0:
                    animals[i] = new Dog();
                    break;
                case 1:
                    animals[i] = new Cat();
                    break;
                case 2:
                    animals[i] = new Elephant();
                    break;
            }
        }

        System.out.println("W kojcu numer " + PEN_NUMBER +" przebywa jeden z " + animals[PEN_NUMBER].getInstantNumber()+ " "+animals[PEN_NUMBER].getType());

    }
}
