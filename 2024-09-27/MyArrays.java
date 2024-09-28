public class MyArrays{
	public static void main(String[] args){
		int[] testReturnCopy;
		int[] testConcatArrayA;
		int[] testConcatArrayB;
		testReturnCopy = new int[]{};
		System.out.println("Expected arrays matching but not the same to return true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
		testReturnCopy = new int[0];
		System.out.println("Expected arrays matching but not the same to return true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
		testReturnCopy = new int[3];
		System.out.println("Expected arrays matching but not the same to return true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
		testReturnCopy = new int[]{1};
		System.out.println("Expected arrays matching but not the same to return true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
		testReturnCopy = new int[]{0, 1};
		System.out.println("Expected arrays matching but not the same to return true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
		testReturnCopy = new int[]{1, 0};
		System.out.println("Expected arrays matching but not the same to return true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
		testReturnCopy = new int[]{1, 2, 3};
		System.out.println("Expected arrays matching but not the same to return true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
		testConcatArrayA = new int[0];
		testConcatArrayB = new int[]{};
		System.out.println("Expected concatened array to be [] and function returned " + concatArray(testConcatArrayA, testConcatArrayB) + "; expected equals returned is " + arrayToString(concatArray(testConcatArrayA, testConcatArrayB)).equals("[]"));
		testConcatArrayB = new int[]{1};
		System.out.println("Expected concatened array to be [1] and function returned " + concatArray(testConcatArrayA, testConcatArrayB) + "; expected equals returned is " + arrayToString(concatArray(testConcatArrayA, testConcatArrayB)).equals("[1]"));
		testConcatArrayA = new int[]{1};
		System.out.println("Expected concatened array to be [1, 1] and function returned " + concatArray(testConcatArrayA, testConcatArrayB) + "; expected equals returned is " + arrayToString(concatArray(testConcatArrayA, testConcatArrayB)).equals("[1, 1]"));
		testConcatArrayA = new int[]{123, 456, 7890};
		testConcatArrayB = new int[]{};
		System.out.println("Expected concatened array to be [123, 456, 7890] and function returned " + concatArray(testConcatArrayA, testConcatArrayB) + "; expected equals returned is " + arrayToString(concatArray(testConcatArrayA, testConcatArrayB)).equals("[123, 456, 7890]"));
		testConcatArrayB = new int[0];
		System.out.println("Expected concatened array to be [123, 456, 7890] and function returned " + concatArray(testConcatArrayA, testConcatArrayB) + "; expected equals returned is " + arrayToString(concatArray(testConcatArrayA, testConcatArrayB)).equals("[123, 456, 7890]"));
		testConcatArrayB = new int[]{2, 3};
		System.out.println("Expected concatened array to be [1, 2, 3] and function returned " + concatArray(testConcatArrayA, testConcatArrayB) + "; expected equals returned is " + arrayToString(concatArray(testConcatArrayA, testConcatArrayB)).equals("[1, 2, 3]"));
		testConcatArrayA = new int[]{2, 18};
		testConcatArrayB = new int[]{2008};
		System.out.println("Expected concatened array to be [2, 18, 2008] and function returned " + concatArray(testConcatArrayA, testConcatArrayB) + "; expected equals returned is " + arrayToString(concatArray(testConcatArrayA, testConcatArrayB)).equals("[2, 18, 2008]"));
		testConcatArrayA = new int[]{2008};
		testConcatArrayB = new int[]{2, 18};
		System.out.println("Expected concatened array to be [2008, 2, 18] and function returned " + concatArray(testConcatArrayA, testConcatArrayB) + "; expected equals returned is " + arrayToString(concatArray(testConcatArrayA, testConcatArrayB)).equals("[2008, 2, 18]"));
	}

	public static String arrayToString(int[] nums){
		String toReturn = "[";
		for (int count = 0; count < nums.length; count++){
			toReturn += nums[count];    
			if (count < nums.length - 1){
				toReturn += ", ";        
			}
		}
		toReturn += "]";
		return toReturn;
	}

	public static int[] returnCopy(int[] ary){
		int[] toReturn = new int[ary.length];
		for (int count = 0; count < ary.length; count++){
			toReturn[count] = ary[count];
		}
		return toReturn;
	}

	public static int[] concatArray(int[]ary1, int[]ary2){
		int[] toReturn = new int[ary1.length + ary2.length];
		for (int count = 0; count < ary1.length; count++){
			toReturn[count] = ary1[count];
		}
		for (int count = 0; count < ary2.length; count++){
			toReturn[count + ary1.length] = ary2[count];
		}
		return toReturn;
	}
}