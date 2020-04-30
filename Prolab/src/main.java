import java.io.*;
import java.util.*;

import jdk.internal.org.jline.utils.InputStreamReader;


public class main {

	Scanner scanner;
	
	public static void main(String[] args) {
		try {
		FileInputStream fStream = new FileInputStream("Sehirler.txt");
		DataInputStream dStream = new DataInputStream(fStream);
		BufferedReader oku = new BufferedReader(new InputStreamReader(dStream));
		
		System.out.println("Hello\n");
		
		
		LL list = new LL();
		
		String[] neig = new String[100];
		int neigbuffer=0;
		int elemansayısı=0;
		
		int c;
		int vbuffer=0;
		int j=0;
		
		String cityname;
		
		while ((c = oku.read()) != -1) {
			
			char ch = (char) c;
			
			if(vbuffer == 0) {
				System.out.println(ch);
			}
			
			if(vbuffer == 1 ) {
				cityname[j] = ch;
				j++
			}
			
			if(ch == ',') {
				
				vbuffer ++;
				j = 0;
			}
			if(ch == '\n') {
				
				vbuffer = 0;
				j = 0;
			}
			
		}
		
		
		System.out.println("\n");
		System.out.println("satır" + elemansayısı);
		
		list.printList();
		
		System.out.println("bye");
		dStream.close();
		}
		
		
		catch(Exception e)
		{
			System.err.println("Error : " + e.getMessage());
		}
	}
}
