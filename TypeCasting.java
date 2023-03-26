package Variation;

class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog is barking.");
    }
    public void playFetch() {
        System.out.println("Dog is playing fetch.");
    }
}

class Cat extends Animal{
	public void makeSound() {
		System.out.println("Cat Meow's");
	}
	public void playFetch() {
		System.out.println("Cat is playing with knitting wool");
	}
}  

public class TypeCasting {
    public static void main(String[] args) {
        Cat animal = new Cat();
//        animal.makeSound();
//        animal.playFetch();
       doAnimalStuff(animal);
        
//        if (animal instanceof Dog)
//        {
//            Dog dog = (Dog) animal;
//            dog.playFetch();
//         }
    }
    
    public static void doAnimalStuff(Animal animal) 
    {
    	animal.makeSound();
    	 if(animal instanceof Dog) {
    		 Dog dog = (Dog) animal;
             dog.playFetch();
    	 }
    	
		
	}
}

