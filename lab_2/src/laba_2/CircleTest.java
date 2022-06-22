package laba_2;


public class CircleTest {
    public static void main(String[] args) {
        Circle first = new Circle(20, 30, 40);
        Circle second = new Circle(10,10,10);
        System.out.println("Площадь первого круга: " + first.getArea());
        System.out.println("Диаметр до изменения: "+ second.getDiameter());
        second.setDiameter(45);
        System.out.println("Диаметр после изменения: " + second.getDiameter());
    }
}
