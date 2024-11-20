import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class AdventExtra{
  public static String reverse(String s){
    String toReturn = "";
    for (int count = s.length() - 1; count >= 0; count--){
      toReturn += s.charAt(count);
    }
  }
  public static boolean daySevenHelper(String toRead){
  String[] toReadList = toRead.split("[");
  String[] toReadList2 = toReadList[1].split("]");
  String[] toReadListFinal = new String[]{toReadList[0], toReadList2[0], toReadList2[1]};
  for (int count = 0; count <= toReadList2[0].length() - 4; count++){
    if (toReadList2[0].substring(count, count + 4).equals(reverse(toReadList2[0].substring(count, count + 4)))){
      return false;
    }
  }
  for (int count = 0; count <= toReadList[0].length() - 4; count++){
    if (toReadList[0].substring(count, count + 4).equals(reverse(toReadList[0].substring(count, count + 4))) &&
      !toReadList[0].substring(count, count + 2).equals(reverse(toReadList[0].substring(count, count + 2)))){
        return true;
      }
    }
      return false;
    }
  }
}
