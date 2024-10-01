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
    for (int[] arr : nums) {
      for (int n : arr) {
        sum += n;
      }
    }
    return sum;
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    return new int[1][1];
  }

  public static void main(String[] args) {
    int[][] arr1 = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10}};
	int[][] arr2 = {{10, 20, 30}, {40, 50, 60}};
	int[][] arr3 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
	int[][] arr4 = {{1, 2, 3, 4}};
    System.out.println("arrToString test expected true and returned " + arrToString(arr1).equals("[[1, 2, 3], [4, 5, 6, 7], [8, 9, 10]]"));
	System.out.println("arrToString test expected true and returned " + arrToString(arr2).equals("[[10, 20, 30], [40, 50, 60]]"));
    System.out.println("arrToString test expected true and returned " + arrToString(arr3).equals("[[10, 20, 30], [40, 50, 60], [70, 80, 90]]"));
	System.out.println("arrToString test expected true and returned " + arrToString(arr4).equals("[[1, 2, 3, 4]]"));


    System.out.println("Expected 55 and method returned " + arr2DSum(arr1));
    int[][] rectangularArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] expectedArr = {{1, 4, 7}, {2, 5, 8}, {3, 8, 9}};
    System.out.println("Expected " + arrToString(expectedArr) + " Returned " + arrToString(swapRC(rectangularArr)));
  }
}
