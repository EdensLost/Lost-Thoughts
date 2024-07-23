package helpers;


import java.util.Scanner;

public class PyJav {


    //// Inputs
    /**
     * Method used to invoke different kinds of input.  This method can do:
     * {"string", "integer", "double", "boolean", "float", "byte", "long", "short"}
     *
     *
     * @param inputText  The {@code String} to be printed.
     * @param type  The type of the return value
     * @return {@code Object}
     */
    public static Object input(String inputText, String type) {
        String lowerType = type.toLowerCase();

        String types[] = {"string", 
                          "integer", 
                          "double", 
                          "boolean", 
                          "float", 
                          "byte", 
                          "long", 
                          "short"};
        // String
        if (lowerType.equals(types[0])) {
            return inputStr(inputText);
        }
        // Int
        else if (lowerType.equals(types[1])) {
            return inputInt(inputText);
        }
        // Double
        else if (lowerType.equals(types[2])) {
            return (double) inputDbl(inputText);
        }
        // Bool
        else if (lowerType.equals(types[3])) {
            return inputBool(inputText);
        }
        // Float
        else if (lowerType.equals(types[4])) {
            return inputFloat(inputText);
        }
        // Byte
        else if (lowerType.equals(types[5])) {
            return inputByte(inputText);
        }
        // Long
        else if (lowerType.equals(types[6])) {
            return inputLong(inputText);
        }
        // Short
        else if (lowerType.equals(types[7])) {
            return inputShort(inputText);
        }
        // Error
        else {
            printl(lowerType + " not supported");
            printl("Try one of these:");
            printl("lowerType");
            return null;
        }
        

    }

    // Input returns int
    /**
     * Method used to invoke single use input.  
     * 
     * 
     * @param inputText  The {@code String} to be printed.
     * @return {@code int}
     */
    public static int inputInt(String inputText) {
        @SuppressWarnings("resource")
        Scanner SCNR = new Scanner(System.in);

        print(inputText);
        int num = SCNR.nextInt();

        return num;
    }

    // Input returns string
    /**
     * Method used to invoke single use input.  
     * 
     * 
     * @param inputText  The {@code String} to be printed.
     * @return {@code string}
     */
    public static String inputStr(String inputText) {
        @SuppressWarnings("resource")
        Scanner SCNR = new Scanner(System.in);

        print(inputText);
        String str = SCNR.nextLine();

        return str;
    }
    
    // Input returns double
    /**
     * Method used to invoke single use input.  
     * 
     * 
     * @param inputText  The {@code String} to be printed.
     * @return {@code double}
     */
    public static double inputDbl(String inputText) {
        @SuppressWarnings("resource")
        Scanner SCNR = new Scanner(System.in);

        print(inputText);
        double dbl = SCNR.nextDouble();


        return dbl;
    }

    // Input returns boolean
    /**
     * Method used to invoke single use input.  
     * 
     * 
     * @param inputText  The {@code String} to be printed.
     * @return {@code boolean}
     */
    public static boolean inputBool(String inputText) {
        @SuppressWarnings("resource")
        Scanner SCNR = new Scanner(System.in);

        print(inputText);
        boolean dbl = SCNR.nextBoolean();


        return dbl;
    }

    // Input returns float
    /**
     * Method used to invoke single use input.  
     * 
     * 
     * @param inputText  The {@code String} to be printed.
     * @return {@code float}
     */
    public static float inputFloat(String inputText) {
        @SuppressWarnings("resource")
        Scanner SCNR = new Scanner(System.in);

        print(inputText);
        float dbl = SCNR.nextFloat();


        return dbl;
    }

    // Input returns byte
    /**
     * Method used to invoke single use input.  
     * 
     * 
     * @param inputText  The {@code String} to be printed.
     * @return {@code byte}
     */
    public static byte inputByte(String inputText) {
        @SuppressWarnings("resource")
        Scanner SCNR = new Scanner(System.in);

        print(inputText);
        byte dbl = SCNR.nextByte();


        return dbl;
    }

    // Input returns long
    /**
     * Method used to invoke single use input.  
     * 
     * 
     * @param inputText  The {@code String} to be printed.
     * @return {@code long}
     */
    public static long inputLong(String inputText) {
        @SuppressWarnings("resource")
        Scanner SCNR = new Scanner(System.in);

        print(inputText);
        long dbl = SCNR.nextLong();


        return dbl;
    }

    // Input returns short
    /**
     * Method used to invoke single use input.  
     * 
     * 
     * @param inputText  The {@code String} to be printed.
     * @return {@code short}
     */
    public static short inputShort(String inputText) {
        @SuppressWarnings("resource")
        Scanner SCNR = new Scanner(System.in);

        print(inputText);
        short dbl = SCNR.nextShort();


        return dbl;
    }

    //// Inputs end

    // Print for both print and println
    /**
     * Method used to print a string. [With new line] 
     * Outputs: {@code String}
     * 
     * @param prntS  The {@code String} to be printed.
     */
    public static void printl(String prntS) {
        System.out.println(String.format(prntS));

    }
    
    /**
     * Method used to print a formatted string. [With new line] 
     * Outputs: {@code String + "\n"}
     * 
     * @param prntS  The formatted {@code String} to be printed.
     * @param args  The arguments for the strings formatted parts.
     */
    public static void printl(String prntS, Object... args) {
        System.out.println(String.format(prntS, args));

    }
    
    /**
     * Method used to print a string. [No new line] 
     * Outputs: {@code String}
     * 
     * @param prntS  The {@code String} to be printed.
     */
    public static void print(String prntS) {
        System.out.print(String.format(prntS));

    }
    
    /**
     * Method used to print a formatted string. [No new line] 
     * Outputs: {@code String}
     * 
     * @param prntS  The formatted {@code String} to be printed.
     * @param args  The arguments for the strings formatted parts.
     */
    public static void print(String prntS, Object... args) {
        System.out.print(String.format(prntS, args));

    }
}
