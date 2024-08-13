package lostThoughts.crescent;

import java.awt.*;

public class ButtonCG {

    private XYPointCG[] thisButtonDim;
    private DynamicShapeCG thisButtonShape;
    private TextCG thisButtonText;
    private XYPointCG thisCenterPoint;

    //Button
    /**
     * Used to generate a new centered button
     * 
     * @param centerPoint = The center point of the button
     * @param width = The width of the button
     * @param height = The height of the button
     * @param buttonColor = The color of the button in the background
     * @param buttonText = The text the button displays
     * @param textScale = The scale of the button text
     * @param textColor = The color of the button text
     */
    public ButtonCG(XYPointCG centerPoint, double width, double height, Color buttonColor, String buttonText, int textScale, Color textColor) {
        thisCenterPoint = centerPoint;
        thisButtonShape = genButtonShape(centerPoint, width, height, buttonColor);
        thisButtonText = genButtonText(buttonText, textScale, textColor);
    }

    //Button
    /**
     * Used to generate a new centered button
     * 
     * @param centerPoint = The center point of the button
     * @param width = The width of the button
     * @param height = The height of the button
     * @param buttonColor = The color of the button in the background
     * @param buttonText = The text the button displays
     * @param textFont = The Font of the button text
     * @param textColor = The color of the button text
     */
    public ButtonCG(XYPointCG centerPoint, double width, double height, Color buttonColor, String buttonText, Font textFont, Color textColor) {
        thisCenterPoint = centerPoint;
        thisButtonShape = genButtonShape(centerPoint, width, height, buttonColor);
        thisButtonText = genButtonText(buttonText, textFont, textColor);
    }

// TITLE [Gen button rect]
    //Gen button shape
    /**
     * Used to generate a new button shape
     * 
     * @param topLeft = The top left point of the button
     * @param bottomRight = The bottom right point of the button
     * @param buttonColor = The color of the button in the background
     * 
     * @return {@code DynamicShape} = The shape for the button
     */
    private DynamicShapeCG genButtonShape(XYPointCG centerPoint, double width, double height, Color buttonColor) {
        XYPointCG topLeft = new XYPointCG(centerPoint.getX() - (width / 2), centerPoint.getY() - (height / 2));
        XYPointCG bottomRight = new XYPointCG(centerPoint.getX() + (width / 2), centerPoint.getY() + (height / 2));

        thisButtonDim = new XYPointCG[] {topLeft, bottomRight};

        XYPointCG[] pointsList = new XYPointCG[] {new XYPointCG( -(width / 2.0), -(height / 2.0)), 
                                                new XYPointCG((width / 2.0), -(height / 2.0)), 
                                                new XYPointCG((width / 2.0), (height / 2.0)), 
                                                new XYPointCG(-(width / 2.0), (height / 2.0))};

        
        

        DynamicShapeCG returnShape = new DynamicShapeCG(1, buttonColor, centerPoint, pointsList);

        return returnShape;
    }
//

// TITLE [Gen button text]
    //Gen button text
    /**
     * Used to generate new button text
     * 
     * @param buttonText = The String text of the button
     * @param textScale = The scale of the button text
     * @param textColor = The Color of the button text
     * 
     * @return {@code DynamicShape} = The shape for the button
     */
    private TextCG genButtonText(String buttonText, int textScale, Color textColor) {
        XYPointCG centerPoint = XYPointCG.findCenter(thisButtonDim[0], thisButtonDim[1]);

        TextCG returnText = new TextCG(buttonText, textScale, textColor, centerPoint, true);

        return returnText;
    }

    /**
     * Used to generate new button text
     * 
     * @param buttonText = The String text of the button
     * @param textFont = The Font of the button text
     * @param textColor = The Color of the button text
     * 
     * @return {@code DynamicShape} = The shape for the button
     */
    private TextCG genButtonText(String buttonText, Font textFont, Color textColor) {
        XYPointCG centerPoint = XYPointCG.findCenter(thisButtonDim[0], thisButtonDim[1]);

        TextCG returnText = new TextCG(buttonText, textFont, textColor, centerPoint, true);

        return returnText;
    }
//

// TITLE [Gen button]
    //Gen full button
    /**
     * Generates the attached button when given the graphics needed
     * 
     * @param g2d = The Graphics2D to add the button to
     * 
     * @return {@code Button} = This button
     */
    public ButtonCG generateButton(Graphics2D g2d) {
        
        thisButtonShape.generateShape(g2d);
        thisButtonText.generateText(g2d);

        return this;
    }
//

// TITLE [Sets]
    // Set button shape
    /**
     * Sets the shape of the button
     * 
     * @param newDim = The new dimensions for the button
     */
    public void setButtonShape(XYPointCG centerPoint, double width, double height, Color buttonColor) {
        thisButtonShape = genButtonShape(centerPoint, width, height, buttonColor);
    }

    // Set button text
    /**
     * Sets the text of the button
     * 
     * @return {@code TextCG} = The button text
     */
    public void setButtonText(String buttonText, Font textFont, Color textColor) {
        thisButtonText = genButtonText(buttonText, textFont, textColor);
    }

    // Set center point
    /**
     * Sets the center of the button
     * 
     * @return {@code XYPointCG} = The button center
     */
    public void setCenter(XYPointCG newCenter) {
        thisCenterPoint = newCenter;
    }
//

// TITLE [Gets]
    // Get button dimension
    /**
     * Returns the dimensions of the button
     * 
     * @return {@code XYPointCG[]} = The button dimensions
     */
    public XYPointCG[] getDim() {
        return thisButtonDim;
    }

    // Get button shape
    /**
     * Returns the shape of the button
     * 
     * @return {@code DynamicShapeCG} = The button shape
     */
    public DynamicShapeCG getButtonShape() {
        return thisButtonShape;
    }

    // Get button text
    /**
     * Returns the text of the button
     * 
     * @return {@code TextCG} = The button text
     */
    public TextCG getButtonText() {
        return thisButtonText;
    }

    // Get center point
    /**
     * Returns the center of the button
     * 
     * @return {@code XYPointCG} = The button center
     */
    public XYPointCG getCenter() {
        return thisCenterPoint;
    }
//

// [Methods]
    //Point in button
    /**
     * Checks if the given point is inside the bounds of the button
     * 
     * @param compPoint = The XYPoint to compare
     * 
     * @return {@code boolean} = If the point is inside
     */
    public boolean isInButton(XYPointCG compPoint) {
        
        if (thisButtonDim[0].getX() <= compPoint.getX() && thisButtonDim[1].getX() >= compPoint.getX()) {
            if (thisButtonDim[0].getY() <= compPoint.getY() && thisButtonDim[1].getY() >= compPoint.getY()) {
                return true;
            }
        }

        return false;
    }
}
