public class Words{
  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters == 0){
      System.out.println(result);
    }
    else{
      for (int count = 0; count < alphabet.length(); count++){
        makeWords(remainingLetters - 1, result + alphabet.charAt(count), alphabet);
      }
    }
  }
  public static void main(String[] args){
    makeWords(2,"","abc");
    makeWords(3,"","xy");
  }
}
