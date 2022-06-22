package laba_4;

public class Planet implements Nameable {
    String name;
    Planet(String n) {name = n;}
    public void getName() {System.out.println("Название планеты: " + name);}
}
