class Animal{
    public void makeSound(){
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("The Dog barks");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("The Cat meows ");
    }
}

public class Question2
{
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.makeSound();
		cat.makeSound();
	}
}