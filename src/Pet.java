// TTS: Week 7, Day 3, Assignment 1:

public class Pet {

// Create a Pet class with the following instance variables:
    private static String name;
    private static int age;
    private static String location;
    private static String type;

// Create two constructors with empty attributes (?):
// Here's a no-arg constructor:
    public Pet() {

    }

// Here's another constructor with arguments (for contrast):
    public Pet(String location, String type) {
        this.location = location;
        this.type = type;
    }

// Code to be able to access name, age & type (Get Methods):
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public  String getType() {
        return type;
    }

// Code to be able to change name, age & location (Set Methods):
    public void setName (String name){
        this.name = name;
    }

    public void setAge (int age){
        this.age = age;
    }

    public void setLocation (String location){
        this.location = location;
    }
}
