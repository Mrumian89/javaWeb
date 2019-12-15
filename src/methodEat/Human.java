package methodEat;

class Human {
    void eat () {
        System.out.println("Człowiek je!");
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.eat();

        Human human = new Human();
        human.eat();
    }
}

