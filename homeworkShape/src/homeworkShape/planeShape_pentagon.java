package homeworkShape;

import homeworkShape.*;

public class planeShape_pentagon extends planeShape{
    private double edgeLen;
    private point cenPt;

    public void setEdgeLen(double dataEdgeLen){
        this.edgeLen = dataEdgeLen;
        setAttr();
    }

    public planeShape_pentagon(double dataEdgeLen){
        cenPt = new point(0,0);
        setEdgeLen(dataEdgeLen);
    }

    public double calcArea(){
        return ((edgeLen * edgeLen) * 6.881909602355868 / 4);
    }

    public double calcCircumference(){
        return (5 * edgeLen);
    }
}
