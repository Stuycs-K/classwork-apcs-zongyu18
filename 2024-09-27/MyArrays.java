public static void main(String[] args){
    int[] testReturnCopy;
	int[] testConcatArrayA;
	int[] testConcatArrayB;
	testReturnCopy = {};
    System.out.println("Expected arrays matching but not the same true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
	testReturnCopy = new int[0];
    System.out.println("Expected arrays matching but not the same true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
	testReturnCopy = new int[3];
    System.out.println("Expected arrays matching but not the same true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
	testReturnCopy = {1};
	System.out.println("Expected arrays matching but not the same true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
	testReturnCopy = {0, 1};
	System.out.println("Expected arrays matching but not the same true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
	testReturnCopy = {1, 0};
	System.out.println("Expected arrays matching but not the same true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
	testReturnCopy = {1, 2, 3};
	System.out.println("Expected arrays matching but not the same true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
	testConcatArrayA = 
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
