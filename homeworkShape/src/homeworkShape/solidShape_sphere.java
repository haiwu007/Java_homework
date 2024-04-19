package homeworkShape;

public class solidShape_sphere implements solidShapeInterface{
    private double volume;
    private double surfaceArea;
    private double radius;

    public solidShape_sphere(double radius){
        this.radius = radius;

        this.volume = calcVolume();
        this.surfaceArea = calcSurfaceArea();
    }

    public double calcVolume(){
        return (4 * Math.PI * this.radius * this.radius * this.radius / 3);
    }
    public double calcSurfaceArea(){
        return (4 * Math.PI * this.radius * this.radius);
    }
    public double getVolume(){
        return this.volume;
    }
    public double getSurfaceArea(){
        return this.surfaceArea;
    }
}
