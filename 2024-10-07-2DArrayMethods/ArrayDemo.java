import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    int testArr1[] = {10, 15, 20};
    int testArr2[] = {};
    int testArr3[][] = {{10, 15, 20}, {2, 3, 4}};
    int testArr4[][] = {{}};
	int testArr5[][] = {{0, 0, 0, 0, 0, 0, 1, 0}};
	int testArr6[][] = {{0, 1, 2}, {0, 5, 10}, {0, 10, 20}};
	int htmlTest[][] = {{1, 2}, {3}};
	int htmlTest2[][] = {{1}, {2}, {3}};
    System.out.println("Expected my arrayToString to return the same value as built-in toString method; expected matches actual is " + Arrays.toString(testArr1).equals(arrToString(testArr1)));
    System.out.println("Expected my arrayToString to return the same value as built-in toString method; expected matches actual is " + Arrays.toString(testArr2).equals(arrToString(testArr2)));
    //System.out.println("Expected my arrayToString to return the same value as built-in toString method; expected matches actual is " + Arrays.deepToString(testArr3).equals(arrToString(testArr3)));
    //System.out.println("Expected my arrayToString to return the same value as built-in toString method; expected matches actual is " + Arrays.deepToString(testArr4).equals(arrToString(testArr4)));
	System.out.println("Expected 0 and method returned " + countZeros2D(testArr3) + "; expected matches returned is " + (countZeros2D(testArr3) == 0));
	System.out.println("Expected 0 and method returned " + countZeros2D(testArr4) + "; expected matches returned is " + (countZeros2D(testArr4) == 0));
	System.out.println("Expected 7 and method returned " + countZeros2D(testArr5) + "; expected matches returned is " + (countZeros2D(testArr5) == 7));
	System.out.println("Expected 3 and method returned " + countZeros2D(testArr6) + "; expected matches returned is " + (countZeros2D(testArr6) == 3));
	System.out.println("HtmlTest: expected matches returned is " + "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>".equals(htmlTable(htmlTest)));
	System.out.println("HtmlTest: expected matches returned is " + "<table><tr><td>10</td><td>15</td><td>20</td></tr><tr><td>2</td><td>3</td><td>4</td></tr></table>".equals(htmlTable(testArr3)));
	System.out.println("HtmlTest: expected matches returned is " + "<table><tr></tr></table>".equals(htmlTable(htmlTest)));
	System.out.println("HtmlTest: expected matches returned is " + "<table><tr><td>1</td></tr><tr><td>2</td></tr><tr><td>3</td></tr></table>".equals(htmlTable(htmlTest)));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String result = "[";
    for (int i = 0; i < ary.length; i++) {
      result += ary[i];
      if (i < ary.length - 1) result += ", ";
    }
    return result + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String result = "[";
    for (int i = 0; i < ary.length; i++) {
      result += arrToString(ary[i]);
      if (i < ary.length - 1) result += ", ";
    }
    return result + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int toReturn = 0;
    for (int count = 0; count < nums.length; count++){
        for (int innerCount = 0; innerCount < nums[count].length; innerCount++){
			if (nums[count][innerCount] == 0){
				toReturn += 1;
			}
        }    
    }
	return toReturn;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int count = 0; count < nums.length; count++) {
      for (int innerCount = 0; innerCount < nums[count].length; innerCount++) {
        sum += nums[count][innerCount];
      }
    }
    return sum;
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
  public static int[] copyHelper(int[] ary){
		int[] toReturn = new int[ary.length];
		for (int count = 0; count < ary.length; count++){
			toReturn[count] = ary[count];
		}
		return toReturn;
  }
  public static int[][] copy(int[][] nums){
    int[][] toReturn = new int[nums.length][];
		for (int count = 0; count < nums.length; count++){
			toReturn[count] = copyHelper(nums[count]);
		}
	return toReturn;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] toReturn = new int[nums[0].length][nums.length];
	for (int count = 0; count < nums.length; count++){
		for (int innerCount = 0; innerCount < nums[count].length; innerCount++){
			toReturn[innerCount][count] = nums[count][innerCount];
		}
	}
	return toReturn;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String toReturn = "<table>";
	for (int count = 0; count < nums.length; count++){
		toReturn += "<tr>";
		for (int innerCount = 0; innerCount < nums[count].length){
			toReturn += ("<td>" + nums[count][innerCount] + "</td>");
		}
		toReturn += "</tr>"
	}
	return toReturn + "</table>";
  }
}
