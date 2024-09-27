public static void main(String[] args){
    int[] toTest;
    System.out.println("Expected true and function returned " + (toTest != returnCopy(toTest) && arrayToString(toTest).equals(arrayToString(returnCopy(toTest)))));
}
