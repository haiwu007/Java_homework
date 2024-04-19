package homeworkShape;

import homeworkShape.*;

public class planeShape_circle extends planeShape {
    private double radius;
    private double x, y;

    public double getRadius() {
        return this.radius;
    }

    public void setDot(double datax, double datay) {
        this.x = datax;
        this.y = datay;
    }

    public void setRadius(double dataRadius) {
        if (dataRadius == 0) {
            throw new RuntimeException("圆半径参数非法");
        }
        this.radius = Math.abs(dataRadius);
        
        setAttr();
    }

    public planeShape_circle(double dataRadius) {
        setDot(0, 0);
        setRadius(dataRadius);
    }

    public planeShape_circle(double datax, double datay, double dataRadius) {
        setDot(datax, datay);
        setRadius(dataRadius);
    }

    protected double calcArea() {
        return (Math.PI * this.radius * this.radius);
    }

    protected double calcCircumference() {
        return (Math.PI * this.radius * 2);
    }
}
