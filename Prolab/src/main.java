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
		String plakaS;
		int plaka;
		int neigbuffer;
		
		String[] splt = null;
		String str;
		while((str = oku.readLine()) != null) {
			splt = str.split(",");//okuduktan sonra virgüle göre parçalýyor
		
			int commabuffer = 0;
			commabuffer =  (splt.length - 1);
			neigbuffer = (commabuffer - 1);
			//System.out.println("comma adet:" + commabuffer);
			
			plakaS = splt[0];
			plaka = Integer.parseInt(plakaS);
			//System.out.println("plaka=" + plaka);
			
			cityName = splt[1];
			//System.out.println("sehir adi=" +cityName);
			
			
			int i;
			for(i=2;i<splt.length;i++) {
				neig[i-2] = splt[i];
			}
			
			for(i=0;i<(commabuffer-1);i++) {
				//System.out.println("komsu:" + neig[i]);
			}
			//System.out.println("komsu sayýsý:" + neigbuffer);
			
			list.addTail(plaka, cityName, neigbuffer, neig);//burda düðüme eklicez
			
		}
		
		
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