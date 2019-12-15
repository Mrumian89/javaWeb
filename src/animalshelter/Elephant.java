package animalshelter;

public class Elephant extends Animal {
    private static int counter;

    public Elephant(){
        counter++;
    }

    @Override
    public int getInstantNumber() {
        return counter;
    }

    @Override
    public String getType() {
        return "słoń";
    }
}
