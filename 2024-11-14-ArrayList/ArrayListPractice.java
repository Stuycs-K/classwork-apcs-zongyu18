import java.util.ArrayList;

public class ArrayListPractice {
  public static ArrayList<String>createRandomArray(int size) {
    ArrayList<String> list = new ArrayList<String>(size);
    for (int i = 0; i < size; i++) {
      int rand = (int)(Math.random() * 11);
      list.add("" + rand);
      if (rand == 0) {
        list.set(i, "");
      }
    }
    return list;
  }
  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
  for (int count = 0; count < original.size(); count++){
    if (original.get(count).equals("")){
      original.set(count, "Empty");
    }
  }
}  
public static ArrayList<String> makeReversedList( ArrayList<String> original){
    ArrayList<String> ans = new ArrayList<String>(original.size());
  //return a new ArrayList that is in the reversed order of the original.
  for (int count = 0; count < original.size(); count++){
	  ans.add(original.get(original.size() - 1 - count));
  }
  return ans;
}
public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
  int smallerSize = Math.min(a.size(), b.size());
  ArrayList<String> toReturn = new ArrayList<String>(a.size() + b.size());
  for (int count = 0; count < smallerSize; count++){
	  toReturn.add(a.get(count));
	  toReturn.add(b.get(count));
  }
  if (a.size() > smallerSize){
	  for (int count = smallerSize; count < a.size(); count++){
		  toReturn.add(a.get(count));
	  }
  }
  else if (b.size() > smallerSize){
	  for (int count = smallerSize; count < b.size(); count++){
		  toReturn.add(b.get(count));
	  }
  }
  return toReturn;
  
} 

  public static void main(String args[]) {

    for (int count = 0; count < 20; count++){
      ArrayList<String> testCase = createRandomArray(10);
      System.out.println(testCase);
      replaceEmpty(testCase);
      System.out.println("" + testCase + "\n");
    }
    System.out.println(createRandomArray(30));
	/*
    ArrayList<String> longTest = createRandomArray(200000);
    System.out.println(longTest);
    replaceEmpty(longTest);
    System.out.println(longTest);*/
	for (int count = 0; count < 20; count++){
      ArrayList<String> testCase = createRandomArray(10);
      System.out.println(testCase);
      System.out.println(makeReversedList(testCase)+ "\n");
    }
  }


}