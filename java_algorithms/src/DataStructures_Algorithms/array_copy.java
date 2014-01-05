/*
 * To copy the contents of one array into another array you can use 
 * the static method arraycopy() of the System class.
 * The method takes five parameters: source, source start position, 
 * destination, destination start position and finally the length 
 * of the data to be copied. 
 * In this example we create an array of integers with ten values 
 * and then use the arraycopy() method to copy the contents to 
 * another array.
 */

package DataStructures_Algorithms;

public class array_copy {
    public void copyArrayExample() {
        
        int[] intArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        
        int[] arrayCopy = new int[intArray.length];
        
        System.arraycopy(intArray, 0, arrayCopy, 0, intArray.length);
        
        for (int i = 0; i < arrayCopy.length; i++)
            System.out.println( arrayCopy[i]);
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new array_copy().copyArrayExample();
    }
}