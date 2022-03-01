/**
* Java. Homework 
*
* @auhtor Liulin Aleksei
*
* @version 01.03.2022
*/
class Lesson6 {
    public static void main(String[] args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog(500,10);
        
        IAnimal[] animals = {cat,dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(100));
            System.out.println(animal.run(250));
            System.out.println(animal.run(600));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(15));
        }
    }
}
    
class Dog extends Animal {
    Dog(int runLimit, int swimLimit) {
        super (runLimit, swimLimit);
    }
    
}

class Cat extends Animal {
    Cat(int runLimit) {
        super (runLimit, 0);
    }
    
    @Override
    public String swim(int dist) {
        return getClassName() + " can't swim";
    }
}

interface IAnimal {
    String run(int dist);
    String swim(int dist);
}

abstract class Animal implements IAnimal {
    protected int runLimit;
    protected int swimLimit;
    protected String className;
    
    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
    }
    
    public String getClassName(){
        return className;
    }
    
    @Override
    public String run(int dist) {
        if (dist > runLimit) {
            return className + " couldn't run " + dist;
        } else {
            return className + " successfully ran " + dist;
        }
    }
    
    @Override
    public String swim(int dist) {
        if (dist > swimLimit) {
            return className + " couldn't swim " + dist;
        } else {
            return className + " successfully swim " + dist;
        }
    }
    
    @Override
    public String toString() {
        return className + " runLimit: " + runLimit + ",swimLimit: " + swimLimit;
    }
}