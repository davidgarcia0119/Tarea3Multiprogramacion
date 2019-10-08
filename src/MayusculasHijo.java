import java.util.Scanner;

public class MayusculasHijo {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while (sc.hasNext()) {
			
			String aux = sc.nextLine();
			
			System.out.println(aux.toUpperCase());
			
		}
		sc.close();
	}
	
	

}
