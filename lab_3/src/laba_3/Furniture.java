package laba_3;

public abstract class Furniture {

    private String color;
    private String material;
    private int weight;

    Furniture(String col, String mat, int w) {
        color = col;
        material = mat;
        weight = w;
    }

    public String getColor() {return  color;}
    public String getMaterial() {return  material;}
    public  int getWeight() {return weight;}

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public  abstract  void displayInfo();

}
