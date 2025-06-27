interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    void jump(){
        System.out.println("Jumping..");
    }
    void bite(){
        System.out.println("Biting..");
    }
}

class Human extends Monkey implements BasicAnimal{
    public void speak(){
        System.out.println("Hello Good Sir!");
    }

    @Override
    public void eat(){
        System.out.println("Eating..");
    }

    @Override
    public void sleep(){
        System.out.println("Sleeping..");
    }
}

public class pr03_07 {
    public static void main(String[] args) {
        Human harry = new Human();
        harry.eat();
        harry.bite();
        harry.speak();

        Monkey yash = new Human();
        // yash.speak(); // not allowed as yash is referred as monkey and not human
        yash.jump();
        yash.bite();
        // yash.eat(); // not allowed as yash is referred as monkey and not basicanimal

        BasicAnimal kks = new Human();
        kks.eat();
        kks.sleep();
        // kks.speak() // not allowed as kks is referred as basicanimal and not human 
        // kks.bite() // not allowed as kks is referred as basicanimal and not monkey
    }
}