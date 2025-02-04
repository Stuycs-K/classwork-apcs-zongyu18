public class Backtracking{
  public static long countNoDoubleLetterWords(int length,String word, String letters){
    if (length == 0){
      return 0;
    }
    else{
      for (int count = 0; count < letters.length(); count++){
        if (word.length() == 0){
          return 1 + countNoDoubleLetterWords(length - 1, word + letters.charAt(count), letters);
        }
        else if (letters.charAt(count) != word.charAt(word.length() - 1)){
          return 1 + countNoDoubleLetterWords(length - 1, word + letters.charAt(count), letters);
        }
      }
    }
    return 0;
  }


  public static void main(String[] args){
    System.out.println((countNoDoubleLetterWords(1, "", "abcd")));
  }
}
