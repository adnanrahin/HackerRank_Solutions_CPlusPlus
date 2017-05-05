package filePractice;

import java.io.*;
import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String args[])throws IOException{
		
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try{
			
			int test_Case;
			fout = new FileOutputStream("home:\\rahin\\Desktop\\newFile.txt");
			
			test_Case = input.nextInt();
			
			for(int i=1; i<=test_Case; i++){
				for(int j=1; j<=test_Case; j++){
					fout.write("*".getBytes());
				}
				fout.write("\n".getBytes());
			}
			
		}
		catch (Exception e) {
			System.out.println("File did not found: ");
		}
		try{
			fin = new FileInputStream("home:\\rahin\\Desktop\\newFile.txt");
			int i=0;
			while((i=fin.read())!=-1){
				System.out.print((char)i);
			}
		}
		catch (Exception e) {
			System.out.println("File did not read: ");
		}
		
		fin.close();
		fout.close();
	}	
}