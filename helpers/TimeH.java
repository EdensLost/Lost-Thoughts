package helpers;

public class TimeH {

    // ***[Time Conversions]***
    public static int SEC_MIN = 60;
    public static int SEC_HOUR = 3600;

    public static int MILLI_SEC = 1000;
    public static int MILLI_MIN = SEC_MIN * MILLI_SEC;
    public static int MILLI_HOUR = SEC_HOUR * MILLI_SEC;
    
    /**
     * Outputs a string that converts the time in milliseconds to text
     * <p> Displays: Hours, Minutes, Seconds, and Milliseconds
     * <p> "Time: 00h 00m 00s 000ms"
     * 
     * @param timeInMilliseconds = The time to convert
     * 
     * @return {@code String} = The time text
     */
    public static String milliToText(long timeInMilliseconds) {

        if (timeInMilliseconds / (MILLI_HOUR) > 0) {
            return "Time: " + (timeInMilliseconds / MILLI_HOUR) + "h " 
                            + (timeInMilliseconds % MILLI_HOUR / MILLI_MIN) + "m " 
                            + (timeInMilliseconds % MILLI_HOUR % MILLI_MIN / MILLI_SEC) + "s "
                            + (timeInMilliseconds % MILLI_HOUR % MILLI_MIN % MILLI_SEC) + "ms";
        }
        else if (timeInMilliseconds / MILLI_MIN > 0) {
            return "Time: " + (timeInMilliseconds / MILLI_MIN) + "m " 
                            + (timeInMilliseconds % MILLI_MIN / MILLI_SEC) + "s "
                            + (timeInMilliseconds % MILLI_MIN % MILLI_SEC) + "ms";
        }
        else {
            return "Time: " + (timeInMilliseconds % MILLI_MIN / MILLI_SEC) + "s "
                            + (timeInMilliseconds % MILLI_SEC) + "ms";
        }
    }
    /**
     * Outputs a string that converts the time in milliseconds to text
     * <p> Displays: Hours, Minutes, Seconds, and Milliseconds
     * <p> "{@code Display} 00h 00m 00s 000ms"
     * 
     * @param timeInMilliseconds = The time to convert
     * @param display = The custom text to display
     * 
     * @return {@code String} = The time text
     */
    public static String milliToText(long timeInMilliseconds, String display) {

        if (timeInMilliseconds / (MILLI_HOUR) > 0) {
            return display + (timeInMilliseconds / MILLI_HOUR) + "h " 
                            + (timeInMilliseconds % MILLI_HOUR / MILLI_MIN) + "m " 
                            + (timeInMilliseconds % MILLI_HOUR % MILLI_MIN / MILLI_SEC) + "s "
                            + (timeInMilliseconds % MILLI_HOUR % MILLI_MIN % MILLI_SEC) + "ms";
        }
        else if (timeInMilliseconds / MILLI_MIN > 0) {
            return display + (timeInMilliseconds / MILLI_MIN) + "m " 
                            + (timeInMilliseconds % MILLI_MIN / MILLI_SEC) + "s "
                            + (timeInMilliseconds % MILLI_MIN % MILLI_SEC) + "ms";
        }
        else {
            return display + (timeInMilliseconds % MILLI_MIN / MILLI_SEC) + "s "
                            + (timeInMilliseconds % MILLI_SEC) + "ms";
        }
    }
    /**
     * Outputs a string that converts the time in milliseconds to text
     * <p> Displays: Hours, Minutes, Seconds, and Milliseconds
     * <p> "{@code Display} 00h 00m 00s 000ms"
     * 
     * @param timeInMilliseconds = The time to convert
     * @param display = The custom text to display
     * 
     * @return {@code String} = The time text
     */
    public static String milliToText(long timeInMilliseconds, String display, long maxTime) {

        if (timeInMilliseconds > maxTime) { 
            if (maxTime / (MILLI_HOUR) > 0) {
                return display + (maxTime / MILLI_HOUR) + "h +";
            }
            else if (maxTime / MILLI_MIN > 0) {
                return display + (maxTime / MILLI_MIN) + "m +";
            }
            else {
                return display + (maxTime % MILLI_MIN / MILLI_SEC) + "s +";
            }
        }
        else {
            if (timeInMilliseconds / (MILLI_HOUR) > 0) {
                return display + (timeInMilliseconds / MILLI_HOUR) + "h " 
                                + (timeInMilliseconds % MILLI_HOUR / MILLI_MIN) + "m " 
                                + (timeInMilliseconds % MILLI_HOUR % MILLI_MIN / MILLI_SEC) + "s "
                                + (timeInMilliseconds % MILLI_HOUR % MILLI_MIN % MILLI_SEC) + "ms";
            }
            else if (timeInMilliseconds / MILLI_MIN > 0) {
                return display + (timeInMilliseconds / MILLI_MIN) + "m " 
                                + (timeInMilliseconds % MILLI_MIN / MILLI_SEC) + "s "
                                + (timeInMilliseconds % MILLI_MIN % MILLI_SEC) + "ms";
            }
            else {
                return display + (timeInMilliseconds % MILLI_MIN / MILLI_SEC) + "s "
                                + (timeInMilliseconds % MILLI_SEC) + "ms";
            }
        }
        
    }




    /**
     * Outputs a string that converts the time in milliseconds to text
     * <p> Displays: Hours, Minutes, and Seconds
     * <p> "Time: 00h 00m 00s"
     * 
     * @param timeInMilliseconds = The time to convert
     * 
     * @return {@code String} = The time text
     */
    public static String secToText(long timeInMilliseconds) {

        if (timeInMilliseconds / (MILLI_HOUR) > 0) {
            return "Time: " + (timeInMilliseconds / MILLI_HOUR) + "h " 
                            + (timeInMilliseconds % MILLI_HOUR / MILLI_MIN) + "m " 
                            + (timeInMilliseconds % MILLI_HOUR % MILLI_MIN / MILLI_SEC) + "s";
        }
        else if (timeInMilliseconds / MILLI_MIN > 0) {
            return "Time: " + (timeInMilliseconds / MILLI_MIN) + "m " 
                            + (timeInMilliseconds % MILLI_MIN / MILLI_SEC) + "s";
        }
        else {
            return "Time: " + (timeInMilliseconds % MILLI_MIN / MILLI_SEC) + "s";
        }
    }
    /**
     * Outputs a string that converts the time in milliseconds to text
     * <p> Displays: Hours, Minutes, and Seconds
     * <p> "{@code Display} 00h 00m 00s"
     * 
     * @param timeInMilliseconds = The time to convert
     * @param display = The custom text to display
     * 
     * @return {@code String} = The time text
     */
    public static String secToText(long timeInMilliseconds, String display) {

        if (timeInMilliseconds / (MILLI_HOUR) > 0) {
            return display + (timeInMilliseconds / MILLI_HOUR) + "h " 
                            + (timeInMilliseconds % MILLI_HOUR / MILLI_MIN) + "m " 
                            + (timeInMilliseconds % MILLI_HOUR % MILLI_MIN / MILLI_SEC) + "s ";
        }
        else if (timeInMilliseconds / MILLI_MIN > 0) {
            return display + (timeInMilliseconds / MILLI_MIN) + "m " 
                            + (timeInMilliseconds % MILLI_MIN / MILLI_SEC) + "s ";
        }
        else {
            return display + (timeInMilliseconds % MILLI_MIN / MILLI_SEC) + "s ";
        }
    }
    /**
     * Outputs a string that converts the time in milliseconds to text
     * <p> Displays: Hours, Minutes, and Seconds
     * <p> "{@code Display} 00h 00m 00s"
     * 
     * @param timeInMilliseconds = The time to convert
     * @param display = The custom text to display
     * 
     * @return {@code String} = The time text
     */
    public static String secToText(long timeInMilliseconds, String display, long maxTime) {

        if (timeInMilliseconds > maxTime) {
            if (maxTime / (MILLI_HOUR) > 0) {
                return display + (maxTime / MILLI_HOUR) + "h +";
            }
            else if (maxTime / MILLI_MIN > 0) {
                return display + (maxTime / MILLI_MIN) + "m +";
            }
            else {
                return display + (maxTime % MILLI_MIN / MILLI_SEC) + "s +";
            }
        }
        else {
            if (timeInMilliseconds / (MILLI_HOUR) > 0) {
                return display + (timeInMilliseconds / MILLI_HOUR) + "h " 
                                + (timeInMilliseconds % MILLI_HOUR / MILLI_MIN) + "m " 
                                + (timeInMilliseconds % MILLI_HOUR % MILLI_MIN / MILLI_SEC) + "s ";
            }
            else if (timeInMilliseconds / MILLI_MIN > 0) {
                return display + (timeInMilliseconds / MILLI_MIN) + "m " 
                                + (timeInMilliseconds % MILLI_MIN / MILLI_SEC) + "s ";
            }
            else {
                return display + (timeInMilliseconds % MILLI_MIN / MILLI_SEC) + "s ";
            }
        }
        
    }


}
