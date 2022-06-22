package laba_3;

public class FurnitureShop {

    private  String nameFurn;
    private int number;
    private boolean delivery;
    private  int cost;

    FurnitureShop(String name, int num, boolean del, int c) {
        nameFurn = name;
        number = num;
        delivery = del;
        cost = c;
    }

    public  void forBool() {
        if (delivery = false) {
            System.out.println("Without delivery");
        }
        else if(delivery = true) {
            System.out.println("With delivery");
        }
    }

    public boolean isDelivery() {
        return delivery;
    }

    public int getCost() {
        return cost;
    }

    public int getNumber() {
        return number;
    }

    public String getNameFurn() {
        return nameFurn;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public void setNameFurn(String nameFurn) {
        this.nameFurn = nameFurn;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void displayInform() {
        System.out.println(getNameFurn());
        System.out.println(getNumber());
        System.out.println(getCost());
    }
}




