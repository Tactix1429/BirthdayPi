package pi;

import java.io.*;
import java.util.Scanner;

public class Geburtstagsfinder {
	
	  static String pifertig;
	  

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("Pi.txt");
		File file = new File("Pifertig.txt");
		FileWriter writer = new FileWriter("Pifertig.txt");
	    BufferedReader br = new BufferedReader(fr);
	    int i = 0;
	    int a = 0;
	    String pi= null;
	    pifertig = null;
	    int Prozent = 0;
while(i<=2500000)
{
	    String zeile1 = br.readLine();
	    zeile1 = zeile1.replaceAll(" ", "");
	    if(zeile1 != null)
	    {
	    writer.write(zeile1);
	    if(pi == null)
	    {
	    	pi = zeile1;
	    }
	    else
	    {
	    pi = pi + zeile1;
	    }
	    Prozent = i/13800;
	    i++;
	    }
	   
	    
	    
	    if(Prozent == a)
	    	
	    {
	    	if(pifertig == null)
	    	{
	    		pifertig = pi;
	    	}
	    	else
	    	{
	    	pifertig = pifertig + pi;
	    	}
	    	System.out.println(""+i/25000+" % wurde(n) geladen; Mach dir nen Kaffee und geniesse die Show ");
	    	System.out.println(" Pi hat nun "+pifertig.length()+" Nachkommastellen");
	    	a++;
	    	pi = null;
	    	
	    }
	    
	  
}System.out.println("Es wurden 100 Mio Nachkommastellen von Pi kompiliert und geladen");
{
}

	    
	    
	    writer.close();
	    br.close();
	    Anzeige Gui = new Anzeige();
	    Gui.main(args);
	    
	    
		
 
	
	}
	 public static int Scanner(String Geburtsdatum) throws IOException
	 {
		 //FileReader fr = new FileReader("Pifertig.txt");
		// BufferedReader br = new BufferedReader(fr);
	//Scanner scanner = new Scanner(System.in);


		
		//System.out.print("Geburtsdatum: ");
		//String eingabeAlter = scanner.nextLine();
		
		
			
			if(pifertig.indexOf(Geburtsdatum)!=-1)
			{
				//System.out.println("Wurde gefunden");
				//System.out.println("Der String wurde an der "+pifertig.indexOf(Geburtsdatum)+ " Stelle von Pi gefunden");
				
			return pifertig.indexOf(Geburtsdatum);	
			}
			else
			{
				//System.out.println("Ihr Alter wurde in den ersten 10 Mio Nachkommastellen von PI leider nicht gefunden");
				
			}
			return -1;
			
		
	
	
	
	
	
}

}
