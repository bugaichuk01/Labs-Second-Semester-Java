package laba_3;

public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair("Blue", "Wood", 10 );
        chair.displayInfo();
        Table table = new Table("Brown", "Red wood", 14 );
        table.displayInfo();
        FurnitureShop first = new FurnitureShop("Table", 1, true, 15000);
        first.forBool();
        first.displayInform();
    }
}
