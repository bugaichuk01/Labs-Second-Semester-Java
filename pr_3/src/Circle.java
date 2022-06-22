public class Circle extends Shape {
    protected double radius;

    Circle() {}
    Circle(double radius) { this.radius = radius; }
    Circle (double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    @Override
    public double getArea() {
        radius = radius + radius;
        return radius;
    }
    @Override
    public double getPerimeter() {
        radius = radius * radius;
        return radius;
    }
    @Override
    public String toString() { return getColor() + " " + getArea() + " " + getPerimeter() + " " + getRadius(); }
}
