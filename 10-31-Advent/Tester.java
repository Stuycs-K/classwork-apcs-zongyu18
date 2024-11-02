import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tester{
	public static void main(String[] args){
		// Helper Tests
		int counter = 0;
		if (!TriangleTester.helper(5, 10, 25)){
			counter++;
		}
		if (!TriangleTester.helper(5, 100, 5)){
			counter++;
		}
		if (TriangleTester.helper(5, 5, 2)){
			counter++;
		}
		if (!TriangleTester.helper(1, 2, 3)){
			counter++;
		}
		if (TriangleTester.helper(3, 2, 3)){
			counter++;
		}
		System.out.println(counter + " helper tests passed out of 5 total");
		
		
	}
}

