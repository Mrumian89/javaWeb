package animalshelter;

public class Cat extends Animal {
        private static int counter;

        public Cat(){
            counter++;
        }

        @Override
        public int getInstantNumber() {
            return counter;
        }

        @Override
        public String getType() {
            return "kot";
        }
    }

