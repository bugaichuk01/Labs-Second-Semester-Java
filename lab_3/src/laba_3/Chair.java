package laba_3;

class Chair extends Furniture {

    Chair(String col, String mat, int w) {
        super(col,mat,w);
    }
    public void displayInfo() {
        System.out.println("Color of chair: " + getColor());
        System.out.println("Material of chair: " + getMaterial());
        System.out.println("Weight of chair: " + getWeight());
    }
}
