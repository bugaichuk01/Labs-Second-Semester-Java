public class Square extends Rectangle {
    protected double side;
    Square() {}
    Square(double side) { this.side = side; }
    Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() { return  side; }
    public void  setSide() { this.side = side; }

    @Override
    public void setWidth(double side) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double side) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return getColor() + " " + getSide();
    }
}
