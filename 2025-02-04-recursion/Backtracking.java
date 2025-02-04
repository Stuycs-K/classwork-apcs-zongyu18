public class Backtracking{
  public static long countNoDoubleLetterWords(int length,String word, String letters){
    int tracker = 0;
    if (length == 0){
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


  public static void main(String[] args){
    System.out.println((countNoDoubleLetterWords(3, "", "abcde")));
  }
}
