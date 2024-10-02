//1. Write both your names + emails at the top of the document as a comment.
// James Lei (jamesl291@nycstudents.net), Andy Li (andyl239@nyctudents.net)
public class ArrayMethods {
  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrToString(int[]ary){
    String result = "[";
    for (int i = 0; i < ary.length; i++) {
      result += ary[i];
      if (i < ary.length - 1) result += ", ";
    }
    return result + "]";
  }

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString(int[][]ary){
    //this should use arrToString(int[])
    String result = "[";
    for (int i = 0; i < ary.length; i++) {
      result += arrToString(ary[i]);
      if (i < ary.length - 1) result += ", ";
    }
    return result + "]";
  }

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
    int sum = 0;
    for (int count = 0; count < nums.length; count++) {
      for (int innerCount = 0; innerCount < nums[count].length; innerCount++) {
        sum += nums[count][innerCount];
      }
    }
    return sum;
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    int[][] toReturn = new int[nums[0].length][nums.length];
	for (int count = 0; count < nums.length; count++){
		for (int innerCount = 0; innerCount < nums[count].length; innerCount++){
			toReturn[innerCount][count] = nums[count][innerCount];
		}
	}
	return toReturn;
  }
  
	//3. Modify a given 2D array of integer as follows:
	//Replace all the negative values:
	//-When the row number is the same as the column number replace
	//that negative with the value 1
	//-All other negatives replace with 0
	public static void replaceNegative(int[][] vals){
		for (int count = 0; count < vals.length; count++){
			for (int innerCount = 0; innerCount < vals[count].length; innerCount++){
				if (vals[count][innerCount] < 0){
					if (count == innerCount){
						vals[count][innerCount] = 1;
					}
					else{
						vals[count][innerCount] = 0;
					}
				}
			}
		}
	}

	//4. Make a copy of the given 2d array.
	//When testing : make sure that changing the original does NOT change the copy.
	//DO NOT use any built in methods that "copy" an array.
	//You SHOULD write a helper method for this.
	//If you don't see a good way to do that, you should stop and look at prior methods.
	public static int[][] copy(int[][] nums){
	  return null;//placeholder so it compiles
	}

  public static void main(String[] args) {
	// initializing the arrays
	int[][] emptyArr = {{}};
    int[][] arr1 = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10}};
	int[][] arr2 = {{10, 20, 30}, {40, 50, 60}};
	int[][] arr3 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
	int[][] arr4 = {{1, 2, 3, 4}};
	
	// tests for arrToString
    System.out.println("arrToString test expected true and returned " + arrToString(arr1).equals("[[1, 2, 3], [4, 5, 6, 7], [8, 9, 10]]"));
	System.out.println("arrToString test expected true and returned " + arrToString(arr2).equals("[[10, 20, 30], [40, 50, 60]]"));
    System.out.println("arrToString test expected true and returned " + arrToString(arr3).equals("[[10, 20, 30], [40, 50, 60], [70, 80, 90]]"));
	System.out.println("arrToString test expected true and returned " + arrToString(arr4).equals("[[1, 2, 3, 4]]"));

	// tests for arr2DSum
    System.out.println("Expected 55 and arr2DSum returned " + arr2DSum(arr1) + "; expected matches returned is " + (55 == arr2DSum(arr1)));
	System.out.println("Expected 210 and arr2DSum returned " + arr2DSum(arr2) + "; expected matches returned is " + (210 == arr2DSum(arr2))); 
	System.out.println("Expected 450 and arr2DSum returned " + arr2DSum(arr3) + "; expected matches returned is " + (450 == arr2DSum(arr3)));
	System.out.println("Expected 10 and arr2DSum returned " + arr2DSum(arr4) + "; expected matches returned is " + (10 == arr2DSum(arr4)));

	
	// tests for swapRC
	int[][] rectangularArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] expectedArr = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
	int[][] expectedArr2 = {{10, 40}, {20, 50}, {30, 60}};
	int[][] expectedArr3 = {{10, 40, 70}, {20, 50, 80}, {30, 60, 90}};
	int[][] expectedArr4 = {{1}, {2}, {3}, {4}};
	System.out.println("swapRC test expected true and returned " + arrToString(expectedArr).equals(arrToString(swapRC(rectangularArr))));
	System.out.println("swapRC test expected true and returned " + arrToString(expectedArr2).equals(arrToString(swapRC(arr2))));
	System.out.println("swapRC test expected true and returned " + arrToString(expectedArr3).equals(arrToString(swapRC(arr3))));
	System.out.println("swapRC test expected true and returned " + arrToString(expectedArr4).equals(arrToString(swapRC(arr4))));
	
	// tests for replaceNegative
	int[][] arr5 = {{-1, 0, 1}, {-2, -5, -8, 10}, {-4}};
	int[][] expectedArr5 = {{1, 0, 1}, {0, 1, 0, 10}, {0}};
	System.out.println("Original array is " + arrToString(arr5) + " and expected modified array is " + arrToString(expectedArr5));
	replaceNegative(arr5);
	System.out.println("Expected modified array matches modified array is " + arrToString(expectedArr5).equals(arrToString(arr5)));
	int[][] arr6 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
	int[][] expectedArr6 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
	System.out.println("Original array is " + arrToString(arr6) + " and expected modified array is " + arrToString(expectedArr6));
	replaceNegative(arr6);
	System.out.println("Expected modified array matches modified array is " + arrToString(expectedArr6).equals(arrToString(arr6)));
	int[][] arr7 = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9, -10}};
	int[][] expectedArr7 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1, 0}};
	System.out.println("Original array is " + arrToString(arr7) + " and expected modified array is " + arrToString(expectedArr7));
	replaceNegative(arr7);
	System.out.println("Expected modified array matches modified array is " + arrToString(expectedArr7).equals(arrToString(arr7)));
	int[][] arr8 = {{-1}};
	int[][] expectedArr8 = {{1}}; 
	System.out.println("Original array is " + arrToString(arr8) + " and expected modified array is " + arrToString(expectedArr8));
	replaceNegative(arr8);
	System.out.println("Expected modified array matches modified array is " + arrToString(expectedArr8).equals(arrToString(arr8)));
  }
}
