import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;



public class Aufgabe94 {

	
	
	 protected void finalize() throws Throwable {
		 super.finalize();
		
	}
	public static void main(String[] args) throws IOException {

		
		
		BufferedReader einlesen=new BufferedReader(new InputStreamReader(System.in));
		/*PrintWriter p=new PrintWriter("Test.txt");
		
		
	String n=einlesen.readLine();
	
	
	
	p.println(n);
		
		
		p.close();
*/
		
		System.out.println("Den zu verschlüsselnden Text eingeben oder aus einer Datei einlesen(E/D)?");
		
		String wahl=einlesen.readLine();
		
		
		
		
		if(wahl.equals("e")) {
			
			
			
			
			
			
			
			
			
			
		}
		
		else if(wahl.contentEquals("d")) {
			
			Random r=new Random();
		System.out.println("wie heißt die Textdatei?");	
			
		String textdatei=einlesen.readLine();
		
		FileReader file=new FileReader(textdatei);
		
		char []a=new char[100];
		
		file.read(a);
		System.out.println("wie soll die verschlüsselte Datei lauten!");
		String textdatei2=einlesen.readLine();
		PrintWriter p=new PrintWriter(textdatei2);
		
	
		for(int i=0;i<a.length;i++)
		{    
		
		
		p.print(a[i]);
	
		p.print((char)(r.nextInt(26) + 'a'));
		
		p.print((char)(r.nextInt(26) + 'a'));
		
		
			
			
			
		}
		
		p.close();
			file.close();
	
		}

			System.out.println("Den zu entschlüsselnden Text eingeben oder aus einner Datei einlese (e/d)?");
			
			String wahl1=einlesen.readLine();
			if(wahl1.equals("e")) {
				
				
				
				
				
				
				
				
				
				
			}
			
			else if(wahl.contentEquals("d"))  {
				
				
				
				System.out.println("Wie heißt die Textdatei !");
				
		String textdatei3=einlesen.readLine();
		FileReader file1=new FileReader(textdatei3);
		
		char []a1=new char[100];
		
		file1.read(a1);
		System.out.println("wie soll die entschlüsselte Datei lauten!");
		
		String textdatei4=einlesen.readLine();
		PrintWriter p2=new PrintWriter(textdatei4);
		
		
				for(int j=0;j<a1.length;j+=3)
				{
					p2.print(a1[j]);
					
					
					
					
					
					
				}
				
				
				
				
				file1.close();
				p2.close();
				
			}
			
			
			
		
		
		
		
		
		
	}

}
