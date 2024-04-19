package homeworkShape;

class point{
    private double x;
    private double y;

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public point(){x=0;y=0;}
    public point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public static double distance(point p1, point p2) {
        return Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
    }
    public double distance(point p) {
        return distance(this,p);
    }
}

public class utils {
    public static double calcLength(double dot1x,double dot1y, double dot2x, double dot2y){
        return Math.sqrt(Math.pow((dot1x - dot2x), 2) - Math.pow((dot1y - dot2y), 2));
    }
}
