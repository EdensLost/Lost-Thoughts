package helpers;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

public class UtilH {
//Distance
    /**
     * Used to find the euclidean distance between two points
     * d = √[(x2 – x1)2 + (y2 – y1)2]
     * 
     * @param x1 = The first x point
     * @param y1 = The first y point
     * @param x2 = The second x point
     * @param y2 = The second y point
     * 
     * @return {@code double} = The distance between both points
     */
    public static double uDist(double x1, double y1, double x2, double y2) {
        double preSquare = Math.pow((x2 - x1) * 2, 2) + Math.pow((y2 - y1) * 2, 2);
        return Math.sqrt(preSquare);
    }
//

// Waits
    //Wait Time
    /**
     * Used to make the code sleep for a specified time
     * 
     * @param timeToWait The time the code waits for
     */
    public static void uWait(double timeToWait) {
        long waitTime = 0;
        long startTime = System.currentTimeMillis();

        while (waitTime < timeToWait) {
            waitTime = System.currentTimeMillis() - startTime;
        }
    }
//

//Random Int
    /**
     * Used to generate a random integer from 0 to max
     * 
     * @param max The maximum value
     * @return {@code int}
     */
    public static int randInt(double max) {
        return (int) (Math.random() * (int) max);
    }
    /**
     * Used to generate a random integer from min to max
     * <p> Max should be equal or greater than min
     * 
     * @param max The maximum value
     * @param min The minimum value
     * @return {@code int}
     */
    public static int randInt(double max, double min) {
        if (max >= min) {

            int shiftAmnt = (int) (max - min);

            int randomNum = (int) (Math.random() * shiftAmnt);

            randomNum = (int) (randomNum + min);

            return randomNum;
        }

        PyJav.printl("The max was less than the minimum");
        return 0;
    }
//


//Random Color
    /**
     * Used to generate a random color
     * 
     * @return {@code Color}
     */
    public static Color randomColor() {
        return new Color(randInt(256), randInt(256), randInt(256));
    }
//

// Console command
    /**
     * Runs a command through the console
     * 
     * @param directory = The directory to run the command in
     * @param cmdString = The command to run
     */
    public static void runCommand(File directory, String cmdString) {
        try {
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", cmdString);
            builder.directory(directory);
            builder.redirectErrorStream(true);  
            builder.start();
        } 
        
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
//

}


