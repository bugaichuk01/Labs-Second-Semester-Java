package laba_3;

public class Table extends Furniture {
    Table(String col, String mat, int w) {
        super(col,mat,w);
    }
    public void displayInfo() {
        System.out.println("Color of table: " + getColor());
        System.out.println("Material of table: " + getMaterial());
        System.out.println("Weight of table: " + getWeight());
    }
}
