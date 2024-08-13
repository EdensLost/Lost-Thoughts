package lostThoughts.crescent;
import java.awt.*;
import java.awt.geom.Path2D;

import lostThoughts.helpingHands.PyJav;


//DynamicShape 
    /**
     * Used to contain the info needed to generate a bezier shape
     * 
     */
public class DynamicShapeCG {
    private double scale;
    private Color color;
    private XYPointCG startPoint;
    private XYPointCG offsetPoint;
    private XYPointCG currentPoint;
    private XYPointCG[] pointList;
    private boolean[] curveList;
    private XYPointCG[][] bezierList;

    /**
     * Used to contain the info needed to generate a bezier shape
     * 
     * @param shapeScale = The scale of the shape
     * @param shapeColor = The color of the shape
     * @param shapeStartPoint = The starting point of the shape (Center)
     * @param shapePointList = The list of points along the shape
     * @param shapeCurveList = The boolean list for the curves of the shape
     * @param shapeBezierList = The list of bezier points for each curve of the shape
     */
    public DynamicShapeCG(double shapeScale, Color shapeColor, XYPointCG shapeStartPoint, XYPointCG[] shapePointList, boolean[] shapeCurveList, XYPointCG[][] shapeBezierList) {
        scale = shapeScale;
        color = shapeColor;
        startPoint = shapeStartPoint;
        offsetPoint = new XYPointCG(0, 0);
        currentPoint = new XYPointCG(0, 0);
        updateCurrentPoint();
        pointList = shapePointList;
        curveList = shapeCurveList;
        bezierList = shapeBezierList;
    }

    /**
     * Used to contain the info needed to generate a bezier shape
     * 
     * @param shapeScale = The scale of the shape
     * @param shapeColor = The color of the shape
     * @param shapeStartPoint = The starting point of the shape (Center)
     * @param shapePointList = The list of points along the shape
     */
    public DynamicShapeCG(double shapeScale, Color shapeColor, XYPointCG shapeStartPoint, XYPointCG[] shapePointList) {
        scale = shapeScale;
        color = shapeColor;
        startPoint = shapeStartPoint;
        offsetPoint = new XYPointCG(0, 0);
        currentPoint = new XYPointCG(0, 0);
        updateCurrentPoint();
        pointList = shapePointList;

        curveList = new boolean[shapePointList.length];
    }

    /**
     * Generates a the attached shape when given the graphics needed
     * 
     * @param g2d = The Graphics2D to add the shape to
     * 
     * @return {@code Path2D.Double} = The path shape
     */
    public Path2D.Double generateShape(Graphics2D g2d) {
        
        return bezierFromDynamic(g2d, this);
    }

    /**
     * Creates a clone of the DynamicShape
     * 
     * @return {@code DynamicShape} = The clone of the shape it's attached to
     */
    public DynamicShapeCG clone() {

        return new DynamicShapeCG(scale, color, currentPoint, pointList);
    }
    
// [Sets]
    /**
     * Used to set the scale of the shape
     * 
     * @param newScale = The scale of the shape to set
     */
    public void setScale(double newScale) {
        scale = newScale;
    }

    /**
     * Used to set the color of the shape
     * 
     * @param newColor = The color of the shape to set
     */
    public void setColor(Color newColor) {
        color = newColor;
    }

    /**
     * Used to set the start point of the shape
     * 
     * @param newStartPoint = The start point of the shape to set
     */
    public void setStartPoint(XYPointCG newStartPoint) {
        startPoint = newStartPoint;
        updateCurrentPoint();
    }

    /**
     * Used to set the offset point of the shape
     * 
     * @param newOffsetPoint = The offset point of the shape to set
     */
    public void setOffsetPoint(XYPointCG newOffsetPoint) {
        offsetPoint = newOffsetPoint;
        updateCurrentPoint();
        
    }

    /**
     * Updates the current point by adding the offset point to the start point
     */
    public void updateCurrentPoint() {
        currentPoint.setX(startPoint.getX() + offsetPoint.getX());
        currentPoint.setY(startPoint.getY() + offsetPoint.getY());
        
        //PyJav.printl("" + currentPoint);
        
    }

    /**
     * Used to set the points list of the shape
     * 
     * @param newPointList = The points list of the shape to set
     */
    public void setShapePoints(XYPointCG[] newPointList) {
        pointList = newPointList;
    }

    /**
     * Used to set the list of curves of the shape
     * 
     * @param newCurveList = The list of curves of the shape to set
     */
    public void setCurveList(boolean[] newCurveList) {
        curveList = newCurveList;
    }

    /**
     * Used to set the bezier list of the shape
     * 
     * @param newBezierList = The bezier list of the shape to set
     */
    public void setBezierList(XYPointCG[][] newBezierList) {
        bezierList = newBezierList;
    }
//

// [Gets]
    /**
     * Used to get the scale of the shape
     * 
     */
    public double getScale() {
        return scale;
    }

    /**
     * Used to get the color of the shape
     * 
     */
    public Color getColor() {
        return color;
    }

    /**
     * Used to get the start point of the shape
     * 
     */
    public XYPointCG getStartPoint() {
        return startPoint;
    }

    /**
     * Used to get the offset point of the shape
     * 
     */
    public XYPointCG getOffsetPoint() {
        return offsetPoint;
    }

    /**
     * Used to get the current point of the shape
     * 
     */
    public XYPointCG getCurrentPoint() {
        return currentPoint;
    }

    /**
     * Used to get the points list of the shape
     * 
     */
    public XYPointCG[] getShapePoints() {
        return pointList;
    }

    /**
     * Used to get the list of curves of the shape
     * 
     */
    public boolean[] getCurveList() {
        return curveList;
    }

    /**
     * Used to get the bezier list of the shape
     * 
     */
    public XYPointCG[][] getBezierList() {
        return bezierList;
    }
//
    
// [Methods]
    //Bezier Shape From Dynamic Shape
    /**
     * Used to generate and fill a complex shape into 
     * a path only needing the DynamicShape.
     * 
     * @param g2d = The Graphics2D to add the shape to
     * @param shape = The scale of the shape
     * 
     * @return {@code Path2D.Double} = The path shape
     */
    private Path2D.Double bezierFromDynamic(Graphics2D g2d, DynamicShapeCG shape) {
        Path2D.Double path = genBezierShape(g2d, shape.scale, shape.color, 
        shape.currentPoint, shape.pointList, shape.curveList, shape.bezierList);

        return path;
    }

    //Generate Bezier Shape
    /**
     * Used to generate and fill a complex shape into 
     * a path that can be added to a canvas.
     * 
     * @param g2d = The Graphics2D to add the shape to
     * @param scale = The scale of the shape
     * @param color = The color of the object
     * @param genPoint = The point where the shape starts (center)
     * @param pointList = The list of each point in the shape
     * @param curveList = The boolean list of which points curve
     * @param bezierList = The list of each curves beziers
     * 
     * @return {@code Path2D.Double} = The path shape
     */
    private Path2D.Double genBezierShape(Graphics2D g2d, double scale, Color color, XYPointCG genPoint, XYPointCG[] pointList, boolean[] curveList, XYPointCG[][] bezierList){ 
        
        Path2D.Double path = new Path2D.Double();

        double startX = genPoint.getX();
        double startY = genPoint.getY();

        path.moveTo(startX, startY);

        int curveCounter = 0;

        for (int i = 0; i < pointList.length; i++) {
            if (i == 0) {
                double pointX = startX + (pointList[i].getX() * scale);
                double pointY = startY + (pointList[i].getY() * scale);
    
                path.moveTo(pointX, pointY);
            }
            else {
                if (!curveList[i]) {
                    double pointX = startX + (pointList[i].getX() * scale);
                    double pointY = startY + (pointList[i].getY() * scale);
    
                    path.lineTo(pointX, pointY);
                }
                else {
                    double bezier1X = startX + (bezierList[curveCounter][0].getX() * scale);
                    double bezier1Y = startY + (bezierList[curveCounter][0].getY() * scale);
    
                    double bezier2X = startX + (bezierList[curveCounter][1].getX() * scale);
                    double bezier2Y = startY + (bezierList[curveCounter][1].getY() * scale);
    
                    double pointX = startX + (pointList[i].getX() * scale);
                    double pointY = startY + (pointList[i].getY() * scale);
    
                    path.curveTo(bezier1X,
                                    bezier1Y,
                                    bezier2X,
                                    bezier2Y,
                                    pointX,
                                    pointY
                                    );
                }
    
                curveCounter ++;
            }
            
   
        }

        g2d.setColor(color);
        g2d.fill(path); 
        
        return path;
    }

}
