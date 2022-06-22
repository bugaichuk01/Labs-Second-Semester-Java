package laba_4;

public class Animal implements Nameable {
    String name;
    Animal(String n) {name = n;}
    public void getName() {System.out.println("Имя животного: " + name);}
}
