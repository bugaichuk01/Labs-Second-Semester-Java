public class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {};
    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() { return width; }
    public double getLength() { return length; }

    public void setWidth(double width) { this.width = width; }
    public void setLength(double length) { this.length = length; }


    @Override
    public double getArea() {
        width = width * width;
        return width;
    }

    @Override
    public double getPerimeter() {
        length = length + length + length + length;
        return length;
    }

    @Override
    public String toString() { return getColor() + " "  + getLength() + " " + getWidth() + " " + getArea() + " " + getPerimeter(); }
}
