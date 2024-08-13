package lostThoughts.crescent;

import java.awt.Color;

public class PredefinedShapeCG {

    /**
     * Creates a dynamic shape that represents an equilateral triangle
     * 
     * @param scale = The scale of the shape
     * @param color = The color of the shape
     * @param center = The center point of the shape
     * 
     * @return {@code DynamicShape} = The predefined shape
     */
    public static final DynamicShapeCG triangle(double scale, Color color, XYPointCG center) {
        return new DynamicShapeCG(scale, color, center, 
        new XYPointCG[]{new XYPointCG(-50, 50), new XYPointCG(0, -50), new XYPointCG(50, 50)});} 
    
    /**
     * Creates a dynamic shape that represents an upward arrow
     * 
     * @param scale = The scale of the shape
     * @param color = The color of the shape
     * @param center = The center point of the shape
     * 
     * @return {@code DynamicShape} = The predefined shape
     */
    public static final DynamicShapeCG arrow(double scale, Color color, XYPointCG center) {
        return new DynamicShapeCG(scale, color, center, 
        new XYPointCG[]{new XYPointCG(0, 0), new XYPointCG(-50, 50), new XYPointCG(0, -50), new XYPointCG(50, 50)});} 

    /**
     * Creates a dynamic shape that represents a heart
     * 
     * @param scale = The scale of the shape
     * @param color = The color of the shape
     * @param center = The center point of the shape
     * 
     * @return {@code DynamicShape} = The predefined shape
     */
    public static final DynamicShapeCG heart(double scale, Color color, XYPointCG center) {
        return new DynamicShapeCG(scale, color, center, 
        new XYPointCG[]{new XYPointCG(-50, -27.5), new XYPointCG(0, -47.5), 
                        new XYPointCG(50, -27.5), new XYPointCG(0, 47.5)},
        new boolean[]{false, true, true, false}, 
        new XYPointCG[][]{{new XYPointCG(-60, -67.5), new XYPointCG(-10, -67.5)}, 
                        {new XYPointCG(10, -67.5), new XYPointCG(60, -67.5)}});} 


    /**
     * Creates a dynamic shape that represents a rectangle
     * 
     * @param centerPoint = The center of the rectangle
     * @param width = The width of the rectangle
     * @param height = The height of the rectangle
     * @param color = The color of the rectangle
     * 
     * @return {@code DynamicShape} = The rectangle
     */
    public static DynamicShapeCG rectangle(XYPointCG centerPoint, double width, double height, Color color) {

        XYPointCG[] pointsList = new XYPointCG[] {new XYPointCG( -(width / 2.0), -(height / 2.0)), 
                                                new XYPointCG((width / 2.0), -(height / 2.0)), 
                                                new XYPointCG((width / 2.0), (height / 2.0)), 
                                                new XYPointCG(-(width / 2.0), (height / 2.0))};

        DynamicShapeCG returnShape = new DynamicShapeCG(1, color, centerPoint, pointsList);

        return returnShape;
    }

}
