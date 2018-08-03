import java.io.*;
import java.util.Scanner;

public class readTxtFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//File file = new File("/abbaZabba.txt");
		//System.out.print("asd");
		
		File fileA = new File(".");
		for(String fileNames : fileA.list()) System.out.println(fileNames);
		
		File file = new File("bom.txt");
		
		Scanner input = new Scanner(file);
		
			
			while(input.hasNext()) {
				System.out.println(input.nextLine());}}}
		
		//String line = null;
		//while (!System.in.) {
			//System.out.println(file.);
		//}


