package maior_menor;

import java.util.Scanner;

public class NumeroInteiros {

	public static void main(String[] args) {
 
		int n1, n2, n3, menor, maior;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("N�mero um: ");
		n1 = leitor.nextInt();
		
		System.out.println("N�mero dois: ");
		n2 = leitor.nextInt();
		
		System.out.println("N�mero tr�s: ");
		n3 = leitor.nextInt();
		
		leitor.close();
		
		if (n1 > n2) {  
			if (n1 > n3) { 	
				
				System.out.println("O maior valor � " + n1);
				
			} else {
				
				System.out.println("O maior valor � " + n3);
				
			  }
			
			} else {
				
				if (n2 > n3) {
				
					System.out.println("O maior valor � " + n2);
					
			} else {
				
				System.out.println("O maior valor � " + n3);
				
			}
				if (n1 < n2 && n1 < n3) { 
					
					menor = n1;
							
					System.out.println("O menor valor � " + menor);
					
			  }
			 
				else if (n2 < n3) {
				  
				  menor = n2; 
				  
				  System.out.println("O menor valor � " + menor);
				  
			  } else { 
								
				menor = n3;
			    System.out.println("O menor valor � " + menor);
					
			}
		
	  }
     }
	
}
		

