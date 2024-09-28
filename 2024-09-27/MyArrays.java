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

public static String[] arrayToString(int[] nums){
    String result = "[";
    for (int count = 0; count < nums.length; count++){
        result += nums[count];    
        if (count < nums.length - 1){
            result += ", "        
        }
    }
    result += "]";
    return result;
}

public static int[] returnCopy(int[] ary){
	int[] toReturn = new int[ary.length];
	for (int count = 0; count < ary.length; count++){
		toReturn[count] = ary[count];
	}
	return toReturn;
}