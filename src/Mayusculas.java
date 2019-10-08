import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Mayusculas {
	
	
	public static void main(String[] args) {
		
		
		
		try {
			Process miProceso = new ProcessBuilder("java" , "-jar", "mayuscula.jar").start();
			
			BufferedReader miRd = new BufferedReader (new InputStreamReader(miProceso.getInputStream()));
			
			BufferedWriter miBw = new BufferedWriter (new OutputStreamWriter(miProceso.getOutputStream()));
			
			Scanner sc = new Scanner(System.in);
			
			boolean terminar = true;
			
			String hola;
			
			while (sc.hasNext() && terminar) {
				
				hola = sc.nextLine();
				
				if (!hola.equals("fin")) {
					
					miBw.write(hola);
					
					miBw.newLine();
					
					miBw.flush();
					System.out.println( miRd.readLine());
					
					
					
				}else {
					
			
					terminar=false;
					
					
				}

				
				
				
			}
			
			sc.close();
				
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
				
				
	}
	
	
	

}
