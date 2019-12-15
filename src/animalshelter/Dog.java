package animalshelter;

public class Dog extends Animal {
    private static int counter;

    public Dog(){
        counter++;
    }

    @Override
    public int getInstantNumber() {
        return counter;
    }

    @Override
    public String getType() {
        return "pies";
    }
}
