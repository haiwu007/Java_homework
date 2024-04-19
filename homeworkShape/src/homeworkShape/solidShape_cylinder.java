package homeworkShape;

public class solidShape_cylinder implements solidShapeInterface{
    private double volume;
    private double surfaceArea;
    private double height;
    private planeShape_circle bottomShape;

    public solidShape_cylinder(double height, double radius){
        this.bottomShape = new planeShape_circle(radius);
        this.height = height;

        this.volume = calcVolume();
        this.surfaceArea = calcSurfaceArea();
    }

    public double calcVolume(){
        return (this.height * this.bottomShape.getArea());
    }
    public double calcSurfaceArea(){
        return (this.height * this.bottomShape.getCircumference() + (2 * this.bottomShape.getArea()));
    }
    public double getVolume(){
        return this.volume;
    }
    public double getSurfaceArea(){
        return this.surfaceArea;
    }
}
