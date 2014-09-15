package DataStructures_Algorithms;

public class array_contain_value {

	public static void main(String[] args) {
		String[] arr = new String[] {  "CD",  "BC", "EF", "DE", "AB"};

		for (int i = 0; i < 100000; i++) {
			useLoop(arr, "AB");
		}

	} // end of main method

	public static boolean useLoop(String[] arr, String targetValue) {
		for(String s: arr){
			if(s.equals(targetValue)){
				System.out.println("value found");
				return true;
			}
		}
		return false;
	} // end of method

} // end of class