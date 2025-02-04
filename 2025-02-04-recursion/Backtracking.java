public class Backtracking{
  public static long countNoDoubleLetterWords(int length,String word, String letters){
    int tracker = 0;
    if (length == 0 && word.equals("")){
      return 0;
    }
    else if (length == 0){
      return 1;
    }
    else{
      for (int count = 0; count < letters.length(); count++){
        if (word.length() == 0){
          tracker += countNoDoubleLetterWords(length - 1, word + letters.charAt(count), letters);
        }
        else{
          if (word.charAt(word.length() - 1) != letters.charAt(count)){
            tracker += countNoDoubleLetterWords(length - 1, word + letters.charAt(count), letters);
          }
        }
      }
    }
    return tracker;
  }

  public static boolean groupSum(int start, int[] nums, int target) {
    if (target == 0){
      return true;
    }
    if (start == nums.length){
      return false;
    }
    else{
      return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);
    }
  }


  public static void main(String[] args){
    System.out.println(groupSum(0, new int[] {2, 4, 8}, 10));
    System.out.println(groupSum(0, new int[] {2, 4, 8}, 9));
    System.out.println(groupSum(0, new int[] {2, 4, 8}, 14));
    System.out.println(groupSum(0, new int[] {2, 4, 8}, 8));
    System.out.println((countNoDoubleLetterWords(0, "", "abcde")));
  }
}
