package lostThoughts.crescent;

import java.awt.*;


public class TextCG {

    
    private String thisText;
    private int thisScale;
    private Color thisColor;
    private XYPointCG thisStartPoint;
    private XYPointCG thisOffsetPoint;
    private XYPointCG thisCurrentPoint;
    private boolean thisIsCentered;
    private Font thisFont;
    
    //Centered Text
    /**
     * Generates text at the given centerpoint
     * 
     * @param text = The text to display
     * @param scale = The scale of the text
     * @param color = The color of the text
     * @param startPoint = The point the text draws based on {@code isCentered}
     * @param isCentered = If the text is centered
     */
    public TextCG(String text, int scale, Color color, XYPointCG startPoint, boolean isCentered) {
        thisText = text;
        thisScale = scale;
        thisColor = color;
        thisStartPoint = startPoint;
        thisOffsetPoint = new XYPointCG(0, 0);
        thisCurrentPoint = new XYPointCG(0, 0);
        updateCurrentPoint();
        thisIsCentered = isCentered;
        thisFont = new Font("Arial", Font.PLAIN, thisScale);

    }

    //Centered Text
    /**
     * Generates text at the given centerpoint
     * 
     * @param text = The text to display
     * @param scale = The scale of the text
     * @param color = The color of the text
     * @param startPoint = The point the text draws based on {@code isCentered}
     * @param isCentered = If the text is centered
     */
    public TextCG(String text, Font curFont, Color color, XYPointCG startPoint, boolean isCentered) {
        thisText = text;
        thisScale = curFont.getSize();
        thisColor = color;
        thisStartPoint = startPoint;
        thisOffsetPoint = new XYPointCG(0, 0);
        thisCurrentPoint = new XYPointCG(0, 0);
        updateCurrentPoint();
        thisIsCentered = isCentered;
        thisFont = curFont;

    }

    /**
     * Generates a the attached text when given the graphics needed
     * 
     * @param g2d = The Graphics2D to add the text to
     * 
     */
    public TextCG generateText(Graphics2D g2d) {
        
        if (thisIsCentered == true) {
            g2d.setFont(thisFont);
            g2d.setColor(thisColor);

            // Get the FontMetrics to measure the text
            FontMetrics metrics = g2d.getFontMetrics();
            int textWidth = metrics.stringWidth(thisText);
            int textHeight = metrics.getHeight();
            int textAscent = metrics.getAscent();

            // Calculate the position to center the text
            int centeredX = (int) thisCurrentPoint.getX() - textWidth / 2;
            int centeredY = (int) thisCurrentPoint.getY() + textAscent - textHeight / 2;

            // Draws the text
            g2d.drawString(thisText, centeredX, centeredY);
        }
        else {
            g2d.setFont(thisFont);
            g2d.setColor(thisColor);

            g2d.drawString(thisText, (int) thisCurrentPoint.getX(), (int) thisCurrentPoint.getY());
        }

        return this;
    }


// [Gets]
    /**
     * Gets the display text
     * 
     * @return {@code String} = This objects text
     * 
     */
    public String getText () {
        return thisText;
    }

    /**
     * Gets the text scale
     * 
     * 
     */
    public int getScale () {
        return thisScale;
    }

    /**
     * Gets the text color
     * 
     * 
     */
    public Color getColor () {
        return thisColor;
    }

    /**
     * Gets the text start point
     * 
     * 
     */
    public XYPointCG getStartPoint () {
        return thisStartPoint;
    }

    /**
     * Used to get the offset point of the text
     * 
     */
    public XYPointCG getOffsetPoint() {
        return thisOffsetPoint;
    }

    /**
     * Used to get the current point of the text
     * 
     */
    public XYPointCG getCurrentPoint() {
        return thisCurrentPoint;
    }

    /**
     * Gets the text font
     * 
     */
    public Font getFont (String fontName) {
        return thisFont;
    }

//

// [Sets]
    /**
     * Sets the display text
     * 
     * @param newText = The text to change to
     * 
     */
    public void setText (String newText) {
        thisText = newText;
    }

    /**
     * Sets the text scale
     * 
     * @param newScale = The scale to change to
     * 
     */
    public void setScale (int newScale) {
        thisScale = newScale;
    }

    /**
     * Sets the text color
     * 
     * @param newColor = The color to change to
     * 
     */
    public void setColor (Color newColor) {
        thisColor = newColor;
    }

    /**
     * Sets the text start point
     * 
     * @param newStartPoint = The start point to change to
     * 
     */
    public void setStartPoint (XYPointCG newStartPoint) {
        thisStartPoint = newStartPoint;
        updateCurrentPoint();
    }

    /**
     * Used to set the offset point of the text
     * 
     * @param newOffsetPoint = The offset point of the text to set
     */
    public void setOffsetPoint(XYPointCG newOffsetPoint) {
        thisOffsetPoint = newOffsetPoint;
        updateCurrentPoint();
    }

    /**
     * Updates the current point by adding the offset point to the start point
     */
    public void updateCurrentPoint() {
        thisCurrentPoint.setX(thisStartPoint.getX() + thisOffsetPoint.getX());
        thisCurrentPoint.setY(thisStartPoint.getY() + thisOffsetPoint.getY());
    }

    /**
     * Sets the text font name
     * 
     * @param fontName = The name of font to use
     * 
     */
    public void setFontName (String fontName) {
        thisFont = new Font(fontName, Font.PLAIN, thisScale);
    }

    /**
     * Sets the text font style
     * 
     * 
     */
    public void setFontStyle (String fontStyle) {
        thisFont = new Font(thisFont.getFontName(), Font.PLAIN, thisScale);
    }
//

// [Methods]
    
//
}
