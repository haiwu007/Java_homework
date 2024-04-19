package homeworkShape;

import homeworkShape.*;

public class planeShape_square extends planeShape{
    private double edgeLen;
    private point cenPt;

    public void setEdgeLen(double dataEdgeLen){
        this.edgeLen = dataEdgeLen;
        setAttr();
    }

    public planeShape_square(double dataEdgeLen){
        cenPt = new point(0,0);
        setEdgeLen(dataEdgeLen);
    }

    public double calcArea(){
        return (edgeLen * edgeLen);
    }

    public double calcCircumference(){
        return (4 * edgeLen);
    }
}
