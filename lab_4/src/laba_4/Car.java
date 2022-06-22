package laba_4;

public class Car implements Nameable {
    String name;
    Car(String n) {name = n;}
    public void getName() {System.out.println("Название машины: " + name);}
}
