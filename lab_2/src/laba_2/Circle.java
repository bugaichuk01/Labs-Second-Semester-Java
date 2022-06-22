package laba_2;

public class Circle {
    private float diameter;
    private float radius;
    private float area;

    public Circle(float d, float r, float a) {
        diameter = d;
        radius = r;
        area = a;
    }
    public float getDiameter() {
        return diameter;
    }

    public float getArea() {
        return area;
    }

    public float getRadius() {
        return radius;
    }

    public void setDiameter(float d) {
        diameter = d;
    }

    public void setArea(float a) {
        area = a;
    }

    public void setRadius(float r) {
        radius = r;
    }
}
