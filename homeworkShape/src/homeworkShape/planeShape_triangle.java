package homeworkShape;

import homeworkShape.*;

public class planeShape_triangle extends planeShape {
    private point pt[];
    private double a, b, c; // 边长

    private boolean isLegal(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return false;
        } else {
            return true;
        }
    }

    public planeShape_triangle(double dot1x, double dot1y, double dot2x, double dot2y, double dot3x, double dot3y) {
        pt = new point[3];
        pt[0] = new point(dot1x, dot1y);
        pt[1] = new point(dot2x, dot2y);
        pt[2] = new point(dot3x, dot3y);

        a = pt[0].distance(pt[1]);
        b = pt[1].distance(pt[2]);
        c = pt[2].distance(pt[0]);

        if (!isLegal(a, b, c)) {
            throw new RuntimeException("illegal triangle attributes.");
        }

        setAttr();
    }

    public planeShape_triangle(double dataa, double datab, double datac) {
        this.a = dataa;
        this.b = datab;
        this.c = datac;
        if (!isLegal(a, b, c)) {
            throw new RuntimeException("illegal triangle attributes.");
        }
        setAttr();
    }

    protected double calcArea() {
        return (Math.sqrt((a + b + c) * (a + b - c) * (a + c - b) * (b + c * a)) / 4);
    }

    protected double calcCircumference() {
        return (a + b + c);
    }
}
