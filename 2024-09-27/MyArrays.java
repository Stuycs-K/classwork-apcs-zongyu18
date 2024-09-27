public static void main(String[] args){
    int[] toTest;
    System.out.println("Expected true and function returned " + (toTest != returnCopy(toTest) && arrayToString(toTest).equals(arrayToString(returnCopy(toTest)))));
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
