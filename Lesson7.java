/**
* Java. Homework 
*
* @auhtor Liulin Aleksei
*
* @version 01.03.2022
*/

class Lesson7 {
    
     public static void main(String[] args) {
        Cat[] cats = {new Cat("Vasily", 15), new Cat("Boom", 10), new Cat("Snezhok", 20)};
        Plate plate = new Plate(50, 30);
        System.out.println(plate);
        
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        
        System.out.println(plate);
        plate.add(40);
        System.out.println(plate);
        
        for (Cat cat : cats) {
            cat.setFullnes(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean fullness;
 
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }
 
    void setFullnes(boolean status){
        fullness = status;
    }
 
    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }
    
    @Override
    public String toString() {
        return "(name" + name + ", appetite=" + appetite + ", fullness=" + fullness + ")";
    }
}

class Plate {
 
    private int maxVolume;
    private int food;
    
    Plate(int maxVolume, int food) {
        this.maxVolume = maxVolume;
        this.food = food;
    }
 
 
    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }
    
    void add(int food) {
        if (this.food + food <= maxVolume) {
            this.food += food;
        }
    }
    
    @Override
    public String toString() {
        return "plate: " + food;
    }
}