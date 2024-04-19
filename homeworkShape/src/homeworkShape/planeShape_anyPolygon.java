package homeworkShape;

public class planeShape_anyPolygon extends planeShape{
    private int edgeNum;
    private point pt[];
    private double len[];

    public planeShape_anyPolygon(int n, double[] data){
        if (n <= 2) {
            throw new RuntimeException("创建多边形边参数错误，多边形边数为 " + n);
        }
        edgeNum = n;
        pt = new point[n];
        len = new double[n];
        for(int i = 0; i < n; i++){
            pt[n] = new point(data[n * 2], data[n * 2 + 1]);
        }

        setAttr();
    }

    protected double calcArea(){
        //shoelace formula
        double tempNum = 0;
        for(int i = 0; i < edgeNum; i++){
            if (i == edgeNum - 1) {
                tempNum += ((pt[i].getX() * pt[0].getY()) - (pt[0].getX() * pt[i].getY()));
            }
            else{
                tempNum += ((pt[i].getX() * pt[i + 1].getY()) - (pt[i + 1].getX() * pt[i].getY()));
            }
        }
        return (Math.abs(tempNum) / 2);
    }

    protected double calcCircumference(){
        double res = 0;
        for(int i = 0; i < edgeNum; i++){
            if (i == edgeNum - 1) {
                len[i] = pt[i].distance(pt[0]);
            }
            else{
                len[i] = pt[i].distance(pt[i + 1]);
            }
            res += len[i];
        }
        return res;
    }
}
