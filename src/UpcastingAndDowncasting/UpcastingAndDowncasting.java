package UpcastingAndDowncasting;


public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        // Upcasting
        Animal animal = new Dog(); // reference type 'Animal'
        // now animal has only method. i.e. 'makeNoise'. but, it does not print(I'm just an Animal). It prints(Woof woof).
        // since 'animal' is a reference type of 'Animal', it only has the methods in the 'Animal' class. But overwritten by methods of 'Dogs' class. as it an object of class 'Dog'


        Animal myAnimal = new Dog();
        System.out.print("1. ");
        doAnimalStuff(myAnimal);

        // we can even use an object of 'Dog' reference type in the 'doAnimalStuff' as 'Dog' is just a child class of the 'Animal' class
        Dog myDog = new Dog();
        System.out.print("2. ");
        doAnimalStuff(myDog);


        System.out.println("For downcasting, ");
        System.out.println("Refer this video" + "https://youtu.be/HpuH7n9VOYk?si=kFKQPR6qQttYPxy4");
    }

    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
    }
}
