import java.util.Scanner;

public class AnimalSounds {
    public static void main(String[] args) {
        System.out.println("========== Activity One: What does the animal say? ===========");
        Selections choose = new Selections();
        choose.choices();
    }
}

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("woof! woof! woof!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("meow! meow! meow!");
    }
}

class Cow implements Animal {
    public void makeSound() {
        System.out.println("moo! moo! moo!");
    }
}

class Fox implements Animal {
    public void makeSound() {
        System.out.println("geek! geek! geek!");
    }
}
class Pig implements Animal {
    public void makeSound() {
        System.out.println("oink! oink! oink!");
    }
}
class Horse implements Animal {
    public void makeSound() {
        System.out.println("neigh! neigh! neigh!");
    }
}
class Dove implements Animal {
    public void makeSound() {
        System.out.println("coo! coo! coo!");
    }
}
class Selections {
    private Scanner scan = new Scanner(System.in);

    public void choices() {
        int number;
        System.out.println("Select an animal: ");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Cow");
        System.out.println("4. Fox");
        System.out.println("5. Pig");
        System.out.println("6. Horse");
        System.out.println("7. Dove");
        System.out.println("\nEnter a number: ");
        number = scan.nextInt();

        Animal animal = null;

        switch (number) {
            case 1:
                System.out.println("Animal: Dog");
                animal = new Dog();
                break;
            case 2:
                System.out.println("Animal: Cat");
                animal = new Cat();
                break;
            case 3:
                System.out.println("Animal: Cow");
                animal = new Cow();
                break;
            case 4:
                System.out.println("Animal: Fox");
                animal = new Fox();
            case 5:
                System.out.println("Animal: Pig");
                animal = new Pig();
            case 6:
                System.out.println("Animal: Horse");
                animal = new Horse();
            case 7:
                System.out.println("Animal: Dove");
                animal = new Dove();
                break;
            default:
                System.out.println("Out of the choices");
        }

        if (animal != null) {
            animal.makeSound();
        }
    }
}