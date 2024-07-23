package helpers;

public class ArrayH {
    
    //Appends
        //Object
        /**
         * Used to append a value onto the end of an array
         * <p> Ex: array = {var1, var2} 
         * <p> append(array, var3)
         * <p> array == {var1, var2, var3}
         * 
         * @param array The array to add onto
         * @param value The value to add
         * @return {@code Object[]} The modified array
         */
        public static Object[] append(Object[] array, Object value) {
            Object[] returnArray = new Object[array.length + 1];

            for (int i = 0; i < array.length; i++) {
                returnArray[i] = array[i];
            }

            returnArray[array.length] = value;

            return returnArray;
        }
        //String
        /**
         * Used to append a value onto the end of an array
         * <p> Ex: array = {var1, var2} 
         * <p> append(array, var3)
         * <p> array == {var1, var2, var3}
         * 
         * @param array The array to add onto
         * @param value The value to add
         * @return {@code String[]} The modified array
         */
        public  static  String[] append(String[] array, String value) {
            String[] returnArray = new String[array.length + 1];

            for (int i = 0; i < array.length; i++) {
                returnArray[i] = array[i];
            }

            returnArray[array.length] = value;

            return returnArray;
        }
        //int
        /**
         * Used to append a value onto the end of an array
         * <p> Ex: array = {var1, var2} 
         * <p> append(array, var3)
         * <p> array == {var1, var2, var3}
         * 
         * @param array The array to add onto
         * @param value The value to add
         * @return {@code int[]} The modified array
         */
        public  static  int[] append(int[] array, int value) {
            int[] returnArray = new int[array.length + 1];

            for (int i = 0; i < array.length; i++) {
                returnArray[i] = array[i];
            }

            returnArray[array.length] = value;

            return returnArray;
        }
        //double
        /**
         * Used to append a value onto the end of an array
         * <p> Ex: array = {var1, var2} 
         * <p> append(array, var3)
         * <p> array == {var1, var2, var3}
         * 
         * @param array The array to add onto
         * @param value The value to add
         * @return {@code double[]} The modified array
         */
        public  static  double[] append(double[] array, double value) {
            double[] returnArray = new double[array.length + 1];

            for (int i = 0; i < array.length; i++) {
                returnArray[i] = array[i];
            }

            returnArray[array.length] = value;

            return returnArray;
        }
        //char
        /**
         * Used to append a value onto the end of an array
         * <p> Ex: array = {var1, var2} 
         * <p> append(array, var3)
         * <p> array == {var1, var2, var3}
         * 
         * @param array The array to add onto
         * @param value The value to add
         * @return {@code char[]} The modified array
         */
        public  static  char[] append(char[] array, char value) {
            char[] returnArray = new char[array.length + 1];

            for (int i = 0; i < array.length; i++) {
                returnArray[i] = array[i];
            }

            returnArray[array.length] = value;

            return returnArray;
        }
        //boolean
        /**
         * Used to append a value onto the end of an array
         * <p> Ex: array = {var1, var2} 
         * <p> append(array, var3)
         * <p> array == {var1, var2, var3}
         * 
         * @param array The array to add onto
         * @param value The value to add
         * @return {@code boolean[]} The modified array
         */
        public  static  boolean[] append(boolean[] array, boolean value) {
            boolean[] returnArray = new boolean[array.length + 1];

            for (int i = 0; i < array.length; i++) {
                returnArray[i] = array[i];
            }

            returnArray[array.length] = value;

            return returnArray;
        }
    //End

    //Clear
        //String
        /**
         * Used to clear the arrays values to defaults
         * <p> Ex: array = {"one", "two"} 
         * <p> clear(array)
         * <p> array == {"", ""}
         * 
         * @param array The array to clear
         * @return {@code String[]} The modified array
         */
        public  static  String[] clear(String[] array) {
            String[] returnArray = new String[array.length];
            for (int i = 0; i < returnArray.length; i++) {
                returnArray[i] = "";
            }
            return returnArray;
        }
        //int
        /**
         * Used to clear the arrays values to defaults
         * <p> Ex: array = {1, 2} 
         * <p> clear(array)
         * <p> array == {0, 0}
         * 
         * @param array The array to clear
         * @return {@code int[]} The modified array
         */
        public  static  int[] clear(int[] array) {
            int[] returnArray = new int[array.length];
            return returnArray;
        }
        //double
        /**
         * Used to clear the arrays values to defaults
         * <p> Ex: array = {1.0, 2.0} 
         * <p> clear(array)
         * <p> array == {0.0, 0.0}
         * 
         * @param array The array to clear
         * @return {@code double[]} The modified array
         */
        public  static  double[] clear(double[] array) {
            double[] returnArray = new double[array.length];
            return returnArray;
        }
        //char
        /**
         * Used to clear the arrays values to defaults
         * <p> Ex: array = {'a', 'b'} 
         * <p> clear(array)
         * <p> array == {'', ''}
         * 
         * @param array The array to clear
         * @return {@code char[]} The modified array
         */
        public  static  char[] clear(char[] array) {
            char[] returnArray = new char[array.length];
            return returnArray;
        }
        //boolean
        /**
         * Used to clear the arrays values to defaults
         * <p> Ex: array = {true, false} 
         * <p> clear(array)
         * <p> array == {false, false}
         * 
         * @param array The array to clear
         * @return {@code boolean[]} The modified array
         */
        public  static  boolean[] clear(boolean[] array) {
            boolean[] returnArray = new boolean[array.length];
            return returnArray;
        }
    //End

    //Count
        //String
        /**
         * Used to get the amount of a certain value in the array
         * <p> Ex: array = {"a", "b"} 
         * <p> count(array, "a")
         * <p> output = 1
         * 
         * @param array The array to search
         * @param value The value to search for
         * @return {@code int} The count of value
         */
        public  static  int count(String[] array, String value) {
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    count++;
                }
            }

            return count;
        }
        //int
        /**
         * Used to get the amount of a certain value in the array
         * <p> Ex: array = {1, 3} 
         * <p> count(array, 3)
         * <p> output = 1
         * 
         * @param array The array to search
         * @param value The value to search for
         * @return {@code int} The count of value
         */
        public  static  int count(int[] array, int value) {
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    count++;
                }
            }

            return count;
        }
        //double
        /**
         * Used to get the amount of a certain value in the array
         * <p> Ex: array = {0.1, 2.3} 
         * <p> count(array, 2.3)
         * <p> output = 1
         * 
         * @param array The array to search
         * @param value The value to search for
         * @return {@code int} The count of value
         */
        public  static  int count(double[] array, double value) {
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    count++;
                }
            }

            return count;
        }
        //char
        /**
         * Used to get the amount of a certain value in the array
         * <p> Ex: array = {'a', 'b'} 
         * <p> count(array, 'a')
         * <p> output = 1
         * 
         * @param array The array to search
         * @param value The value to search for
         * @return {@code int} The count of value
         */
        public  static  int count(char[] array, char value) {
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    count++;
                }
            }

            return count;
        }
        //boolean
        /**
         * Used to get the amount of a certain value in the array
         * <p> Ex: array = {true, false} 
         * <p> count(array, true)
         * <p> output = 1
         * 
         * @param array The array to search
         * @param value The value to search for
         * @return {@code int} The count of value
         */
        public  static  int count(boolean[] array, boolean value) {
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    count++;
                }
            }

            return count;
        }
    //End

    //Extend
        //String
        public  static  String[] extend(String[] array1, String[] array2) {
            String[] returnArray = new String[array1.length + array2.length];

            for (int i = 0; i < returnArray.length; i++) {
                if (i < array1.length) {
                    returnArray[i] = array1[i];
                }
                else {
                    returnArray[i] = array2[i - array1.length];
                }
            }

            return returnArray;
        }
        //int
        public  static  int[] extend(int[] array1, int[] array2) {
            int[] returnArray = new int[array1.length + array2.length];

            for (int i = 0; i < returnArray.length; i++) {
                if (i < array1.length) {
                    returnArray[i] = array1[i];
                }
                else {
                    returnArray[i] = array2[i - array1.length];
                }
            }

            return returnArray;
        }
        //double
        public  static  double[] extend(double[] array1, double[] array2) {
            double[] returnArray = new double[array1.length + array2.length];

            for (int i = 0; i < returnArray.length; i++) {
                if (i < array1.length) {
                    returnArray[i] = array1[i];
                }
                else {
                    returnArray[i] = array2[i - array1.length];
                }
            }

            return returnArray;
        }
        //char
        public  static  char[] extend(char[] array1, char[] array2) {
            char[] returnArray = new char[array1.length + array2.length];

            for (int i = 0; i < returnArray.length; i++) {
                if (i < array1.length) {
                    returnArray[i] = array1[i];
                }
                else {
                    returnArray[i] = array2[i - array1.length];
                }
            }

            return returnArray;
        }
        //boolean
        public  static  boolean[] extend(boolean[] array1, boolean[] array2) {
            boolean[] returnArray = new boolean[array1.length + array2.length];

            for (int i = 0; i < returnArray.length; i++) {
                if (i < array1.length) {
                    returnArray[i] = array1[i];
                }
                else {
                    returnArray[i] = array2[i - array1.length];
                }
            }

            return returnArray;
        }
    //End

    //Index
        //String
        public  static  int index(String[] array, String search) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(search)) {
                    return i;
                }
            }
            return -1;
        }
        //int
        public  static  int index(int[] array, int search) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == search) {
                    return i;
                }
            }
            return -1;
        }
        //double
        public  static  int index(double[] array, double search) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == search) {
                    return i;
                }
            }
            return -1;
        }
        //char
        public  static  int index(char[] array, char search) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == search) {
                    return i;
                }
            }
            return -1;
        }
        //boolean
        public  static  int index(boolean[] array, boolean search) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == search) {
                    return i;
                }
            }
            return -1;
        }
    //End

    //Insert
        //String
        public  static  String[] insert(String[] array, String value, int index) {
            String[] returnArray = new String[array.length + 1];

            int length = array.length;
            int curIndex = 0;
            int arrayIndex = 0;

            while (curIndex <= length) {
                if (curIndex == index) {
                    returnArray[curIndex] = value;
                }
                else {
                    returnArray[curIndex] = array[arrayIndex];
                    arrayIndex++;
                }
                curIndex++;
            }

            return returnArray;
        }
        //int
        public  static  int[] insert(int[] array, int value, int index) {
            int[] returnArray = new int[array.length + 1];

            int length = array.length;
            int curIndex = 0;
            int arrayIndex = 0;

            while (curIndex <= length) {
                if (curIndex == index) {
                    returnArray[curIndex] = value;
                }
                else {
                    returnArray[curIndex] = array[arrayIndex];
                    arrayIndex++;
                }
                curIndex++;
            }

            return returnArray;
        }
        //double
        public  static  double[] insert(double[] array, double value, int index) {
            double[] returnArray = new double[array.length + 1];

            int length = array.length;
            int curIndex = 0;
            int arrayIndex = 0;

            while (curIndex <= length) {
                if (curIndex == index) {
                    returnArray[curIndex] = value;
                }
                else {
                    returnArray[curIndex] = array[arrayIndex];
                    arrayIndex++;
                }
                curIndex++;
            }

            return returnArray;
        }
        //char
        public  static  char[] insert(char[] array, char value, int index) {
            char[] returnArray = new char[array.length + 1];

            int length = array.length;
            int curIndex = 0;
            int arrayIndex = 0;

            while (curIndex <= length) {
                if (curIndex == index) {
                    returnArray[curIndex] = value;
                }
                else {
                    returnArray[curIndex] = array[arrayIndex];
                    arrayIndex++;
                }
                curIndex++;
            }

            return returnArray;
        }
        //boolean
        public  static  boolean[] insert(boolean[] array, boolean value, int index) {
            boolean[] returnArray = new boolean[array.length + 1];

            int length = array.length;
            int curIndex = 0;
            int arrayIndex = 0;

            while (curIndex <= length) {
                if (curIndex == index) {
                    returnArray[curIndex] = value;
                }
                else {
                    returnArray[curIndex] = array[arrayIndex];
                    arrayIndex++;
                }
                curIndex++;
            }

            return returnArray;
        }
    //End
    
    //Pop
        //String
        public  static  String[] pop(String[] array) {
            String[] returnArray = new String[array.length - 1];

            for (int i = 0; i < returnArray.length; i++) {
                returnArray[i] = array[i];
            }

            return returnArray;
        }
        public  static  String[] pop(String[] array, int index) {
            String[] returnArray = new String[array.length - 1];

            int length = array.length;
            int curIndex = 0;
            int arrayIndex = 0;

            while (arrayIndex < length) {
                if (arrayIndex != index) {
                    returnArray[curIndex] = array[arrayIndex];
                    curIndex++;
                }
                arrayIndex++;
            }

            return returnArray;
        }
        //int
        public  static  int[] pop(int[] array) {
            int[] returnArray = new int[array.length - 1];

            for (int i = 0; i < returnArray.length; i++) {
                returnArray[i] = array[i];
            }

            return returnArray;
        }
        public  static  int[] pop(int[] array, int index) {
            int[] returnArray = new int[array.length - 1];

            int length = array.length;
            int curIndex = 0;
            int arrayIndex = 0;

            while (arrayIndex < length) {
                if (arrayIndex != index) {
                    returnArray[curIndex] = array[arrayIndex];
                    curIndex++;
                }
                arrayIndex++;
            }

            return returnArray;
        }
        //double
        public  static  double[] pop(double[] array) {
            double[] returnArray = new double[array.length - 1];

            for (int i = 0; i < returnArray.length; i++) {
                returnArray[i] = array[i];
            }

            return returnArray;
        }
        public  static  double[] pop(double[] array, int index) {
            double[] returnArray = new double[array.length - 1];

            int length = array.length;
            int curIndex = 0;
            int arrayIndex = 0;

            while (arrayIndex < length) {
                if (arrayIndex != index) {
                    returnArray[curIndex] = array[arrayIndex];
                    curIndex++;
                }
                arrayIndex++;
            }

            return returnArray;
        }
        //char
        public  static  char[] pop(char[] array) {
            char[] returnArray = new char[array.length - 1];

            for (int i = 0; i < returnArray.length; i++) {
                returnArray[i] = array[i];
            }

            return returnArray;
        }
        public  static  char[] pop(char[] array, int index) {
            char[] returnArray = new char[array.length - 1];

            int length = array.length;
            int curIndex = 0;
            int arrayIndex = 0;

            while (arrayIndex < length) {
                if (arrayIndex != index) {
                    returnArray[curIndex] = array[arrayIndex];
                    curIndex++;
                }
                arrayIndex++;
            }

            return returnArray;
        }
        //boolean
        public  static  boolean[] pop(boolean[] array) {
            boolean[] returnArray = new boolean[array.length - 1];

            for (int i = 0; i < returnArray.length; i++) {
                returnArray[i] = array[i];
            }

            return returnArray;
        }
        public  static  boolean[] pop(boolean[] array, int index) {
            boolean[] returnArray = new boolean[array.length - 1];

            int length = array.length;
            int curIndex = 0;
            int arrayIndex = 0;

            while (arrayIndex < length) {
                if (arrayIndex != index) {
                    returnArray[curIndex] = array[arrayIndex];
                    curIndex++;
                }
                arrayIndex++;
            }

            return returnArray;
        }
    //End

    //Prints
        //String
        public  static  void printArray(String[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) {
                    if (i != array.length - 1) {
                        System.out.print("[\"" + array[i] + "\"], ");
                    }
                    else {
                        System.out.println("[\"" + array[i] + "\"]");
                    }
                }
                else {
                    if (i != array.length - 1) {
                        System.out.print("[], ");
                    }
                    else {
                        System.out.println("[]");
                    }
                }
            }
        }
        //int
        public  static  void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i != array.length - 1) {
                    System.out.print("[" + array[i] + "], ");
                }
                else {
                    System.out.println("[" + array[i] + "]");
                }
            }
        }
        //double
        public  static  void printArray(double[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i != array.length - 1) {
                    System.out.print("[" + array[i] + "], ");
                }
                else {
                    System.out.println("[" + array[i] + "]");
                }
            }
        }
        //char
        public  static  void printArray(char[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i != array.length - 1) {
                    System.out.print("['" + array[i] + "'], ");
                }
                else {
                    System.out.println("['" + array[i] + "']");
                }
            }
        }
        //boolean
        public  static  void printArray(boolean[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i != array.length - 1) {
                    System.out.print("[" + array[i] + "], ");
                }
                else {
                    System.out.println("[" + array[i] + "]");
                }
            }
        }
    //End

    //Remove
        //String
        public  static  String[] remove(String[] array, String remove) {
            String[] returnArray = new String[0];
            boolean removed = false;

            int length = array.length;
            int arrayIndex = 0;

            while (arrayIndex < length) {
                String curVal = array[arrayIndex];
                //System.out.println(arrayIndex);

                if (curVal != remove || removed == true) {
                    String[] newHolder = new String[returnArray.length + 1];
                        
                    //System.out.println(curVal);

                    for (int j = 0; j < returnArray.length; j++) {
                        newHolder[j] = returnArray[j];
                        //printArray(returnArray);
                    }

                    newHolder[returnArray.length] = curVal;
                    
                    returnArray = newHolder.clone();
                }
                else {
                    removed = true;
                }
                
                arrayIndex++;
            }

            return returnArray;
        }
        //int
        public  static  int[] remove(int[] array, int remove) {
            int[] returnArray = new int[0];
            boolean removed = false;

            int length = array.length;
            int arrayIndex = 0;

            while (arrayIndex < length) {
                int curVal = array[arrayIndex];
                //System.out.println(arrayIndex);

                if (curVal != remove || removed == true) {
                    int[] newHolder = new int[returnArray.length + 1];
                        
                    //System.out.println(curVal);

                    for (int j = 0; j < returnArray.length; j++) {
                        newHolder[j] = returnArray[j];
                        //printArray(returnArray);
                    }

                    newHolder[returnArray.length] = curVal;
                    
                    returnArray = newHolder.clone();
                }
                else {
                    removed = true;
                }
                
                arrayIndex++;
            }

            return returnArray;
        }
        //double
        public  static  double[] remove(double[] array, double remove) {
            double[] returnArray = new double[0];
            boolean removed = false;

            int length = array.length;
            int arrayIndex = 0;

            while (arrayIndex < length) {
                double curVal = array[arrayIndex];
                //System.out.println(arrayIndex);

                if (curVal != remove || removed == true) {
                    double[] newHolder = new double[returnArray.length + 1];
                        
                    //System.out.println(curVal);

                    for (int j = 0; j < returnArray.length; j++) {
                        newHolder[j] = returnArray[j];
                        //printArray(returnArray);
                    }

                    newHolder[returnArray.length] = curVal;
                    
                    returnArray = newHolder.clone();
                }
                else {
                    removed = true;
                }
                
                arrayIndex++;
            }

            return returnArray;
        }
        //char
        public  static  char[] remove(char[] array, char remove) {
            char[] returnArray = new char[0];
            boolean removed = false;

            int length = array.length;
            int arrayIndex = 0;

            while (arrayIndex < length) {
                char curVal = array[arrayIndex];
                //System.out.println(arrayIndex);

                if (curVal != remove || removed == true) {
                    char[] newHolder = new char[returnArray.length + 1];
                        
                    //System.out.println(curVal);

                    for (int j = 0; j < returnArray.length; j++) {
                        newHolder[j] = returnArray[j];
                        //printArray(returnArray);
                    }

                    newHolder[returnArray.length] = curVal;
                    
                    returnArray = newHolder.clone();
                }
                else {
                    removed = true;
                }
                
                arrayIndex++;
            }

            return returnArray;
        }
        //double
        public  static  boolean[] remove(boolean[] array, boolean remove) {
            boolean[] returnArray = new boolean[0];
            boolean removed = false;

            int length = array.length;
            int arrayIndex = 0;

            while (arrayIndex < length) {
                boolean curVal = array[arrayIndex];
                //System.out.println(arrayIndex);

                if (curVal != remove || removed == true) {
                    boolean[] newHolder = new boolean[returnArray.length + 1];
                        
                    //System.out.println(curVal);

                    for (int j = 0; j < returnArray.length; j++) {
                        newHolder[j] = returnArray[j];
                        //printArray(returnArray);
                    }

                    newHolder[returnArray.length] = curVal;
                    
                    returnArray = newHolder.clone();
                }
                else {
                    removed = true;
                }
                
                arrayIndex++;
            }

            return returnArray;
        }
    //End

    //RemoveAll
        //String
        public  static  String[] removeAll(String[] array, String remove) {
            String[] returnArray = new String[0];

            int length = array.length;
            int arrayIndex = 0;

            while (arrayIndex < length) {
                String curVal = array[arrayIndex];
                //System.out.println(arrayIndex);

                if (curVal != remove) {
                    String[] newHolder = new String[returnArray.length + 1];
                        
                    //System.out.println(curVal);

                    for (int j = 0; j < returnArray.length; j++) {
                        newHolder[j] = returnArray[j];
                        //printArray(returnArray);
                    }

                    newHolder[returnArray.length] = curVal;
                    
                    returnArray = newHolder.clone();
                }
                
                arrayIndex++;
            }

            return returnArray;
        }
        //int
        public  static  int[] removeAll(int[] array, int remove) {
            int[] returnArray = new int[0];

            int length = array.length;
            int arrayIndex = 0;

            while (arrayIndex < length) {
                int curVal = array[arrayIndex];
                //System.out.println(arrayIndex);

                if (curVal != remove) {
                    int[] newHolder = new int[returnArray.length + 1];
                        
                    //System.out.println(curVal);

                    for (int j = 0; j < returnArray.length; j++) {
                        newHolder[j] = returnArray[j];
                        //printArray(returnArray);
                    }

                    newHolder[returnArray.length] = curVal;
                    
                    returnArray = newHolder.clone();
                }
                
                arrayIndex++;
            }

            return returnArray;
        }
        //double
        public  static  double[] removeAll(double[] array, double remove) {
            double[] returnArray = new double[0];

            int length = array.length;
            int arrayIndex = 0;

            while (arrayIndex < length) {
                double curVal = array[arrayIndex];
                //System.out.println(arrayIndex);

                if (curVal != remove) {
                    double[] newHolder = new double[returnArray.length + 1];
                        
                    //System.out.println(curVal);

                    for (int j = 0; j < returnArray.length; j++) {
                        newHolder[j] = returnArray[j];
                        //printArray(returnArray);
                    }

                    newHolder[returnArray.length] = curVal;
                    
                    returnArray = newHolder.clone();
                }
                
                arrayIndex++;
            }

            return returnArray;
        }
        //char
        public  static  char[] removeAll(char[] array, char remove) {
            char[] returnArray = new char[0];

            int length = array.length;
            int arrayIndex = 0;

            while (arrayIndex < length) {
                char curVal = array[arrayIndex];
                //System.out.println(arrayIndex);

                if (curVal != remove) {
                    char[] newHolder = new char[returnArray.length + 1];
                        
                    //System.out.println(curVal);

                    for (int j = 0; j < returnArray.length; j++) {
                        newHolder[j] = returnArray[j];
                        //printArray(returnArray);
                    }

                    newHolder[returnArray.length] = curVal;
                    
                    returnArray = newHolder.clone();
                }
                
                arrayIndex++;
            }

            return returnArray;
        }
        //double
        public  static  boolean[] removeAll(boolean[] array, boolean remove) {
            boolean[] returnArray = new boolean[0];

            int length = array.length;
            int arrayIndex = 0;

            while (arrayIndex < length) {
                boolean curVal = array[arrayIndex];
                //System.out.println(arrayIndex);

                if (curVal != remove) {
                    boolean[] newHolder = new boolean[returnArray.length + 1];
                        
                    //System.out.println(curVal);

                    for (int j = 0; j < returnArray.length; j++) {
                        newHolder[j] = returnArray[j];
                        //printArray(returnArray);
                    }

                    newHolder[returnArray.length] = curVal;
                    
                    returnArray = newHolder.clone();
                }
                
                arrayIndex++;
            }

            return returnArray;
        }
    //End

    //Reverse
        //String
        public  static  String[] reverse(String[] array) {
            String[] returnArray = new String[array.length];

            for (int i = 0; i < returnArray.length; i++) {
                returnArray[i] = array[array.length - 1 - i];
            }

            return returnArray;
        }
        //int
        public  static  int[] reverse(int[] array) {
            int[] returnArray = new int[array.length];

            for (int i = 0; i < returnArray.length; i++) {
                returnArray[i] = array[array.length - 1 - i];
            }

            return returnArray;
        }
        //double
        public  static  double[] reverse(double[] array) {
            double[] returnArray = new double[array.length];

            for (int i = 0; i < returnArray.length; i++) {
                returnArray[i] = array[array.length - 1 - i];
            }

            return returnArray;
        }
        //char
        public  static  char[] reverse(char[] array) {
            char[] returnArray = new char[array.length];

            for (int i = 0; i < returnArray.length; i++) {
                returnArray[i] = array[array.length - 1 - i];
            }

            return returnArray;
        }
        //boolean
        public  static  boolean[] reverse(boolean[] array) {
            boolean[] returnArray = new boolean[array.length];

            for (int i = 0; i < returnArray.length; i++) {
                returnArray[i] = array[array.length - 1 - i];
            }

            return returnArray;
        }
    //End

    //Swap
        //String
        public  static  String[] swap(String[] array, int a, int b) {
            String[] returnArray = new String[array.length];

            returnArray = array.clone();

            returnArray[a] = array[b];
            returnArray[b] = array[a];

            return returnArray;
        }

    //Extras
}