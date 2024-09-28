public static void main(String[] args){
    int[] testReturnCopy;
	testReturnCopy = [];
    System.out.println("Expected true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
	testReturnCopy = ["Hello"];
	System.out.println("Expected true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
	testReturnCopy = ["Hello", "World"];
	System.out.println("Expected true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
	testReturnCopy = ["1", "2", "3"];
	System.out.println("Expected true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
	testReturnCopy = ["1", "Hello", "World"];
	System.out.println("Expected true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
	testReturnCopy = ["\n", "\\"];
	System.out.println("Expected true and function returned " + (testReturnCopy != returnCopy(testReturnCopy) && arrayToString(testReturnCopy).equals(arrayToString(returnCopy(testReturnCopy)))));
}

public static String arrayToString(int[] nums){
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
