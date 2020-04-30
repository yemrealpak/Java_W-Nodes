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
		String cityName;
		int plaka;
		int neigbuffer=0;
		
		String str;
		while((str = oku.readLine()) != null) {
			System.out.println(str);
		}
		
		list.addTail(plaka, city_name, neigcitynumber, neigs);//burda düðüme eklicez
		
		System.out.println("bye");
		dStream.close();
		}
		
		
		catch(Exception e)
		{
			System.err.println("Error : " + e.getMessage());
		}
	}
}