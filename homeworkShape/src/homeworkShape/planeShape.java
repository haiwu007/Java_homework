package homeworkShape;

public abstract class planeShape {
    protected double area;
    protected double circumference;

    protected abstract double calcArea();

    protected abstract double calcCircumference();

    protected void setAttr(){
        this.area = calcArea();
        this.circumference = calcCircumference();
    }

    public double getArea() {
        return this.area;
    }

    public double getCircumference() {
        return this.circumference;
    }
}
