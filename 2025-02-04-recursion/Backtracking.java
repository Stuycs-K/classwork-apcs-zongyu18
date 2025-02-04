public class Backtracking{
  public static long countNoDoubleLetterWords(int length,String word, String letters){
    if (length == 0){
      return 1;
    }
    else{
      for (int count = 0; count < letters.length(); count++){
        if (letters.charAt(count) != word.charAt(word.length() - 1){
          return (length, word + letters.charAt(count), letters);
        }
      }
    }
  }

  public static void main(String[] args){

  }
}
