package maior_menor;

import java.util.Scanner;

public class NumeroInteiros {

	public static void main(String[] args) {
 
		int n1, n2, n3, menor, maior;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Número um: ");
		n1 = leitor.nextInt();
		
		System.out.println("Número dois: ");
		n2 = leitor.nextInt();
		
		System.out.println("Número três: ");
		n3 = leitor.nextInt();
		
		leitor.close();
		
		if (n1 > n2) {  
			if (n1 > n3) { 	
				
				System.out.println("O maior valor é " + n1);
				
			} else {
				
				System.out.println("O maior valor é " + n3);
				
			  }
			
			} else {
				
				if (n2 > n3) {
				
					System.out.println("O maior valor é " + n2);
					
			} else {
				
				System.out.println("O maior valor é " + n3);
				
			}
				if (n1 < n2 && n1 < n3) { 
					
					menor = n1;
							
					System.out.println("O menor valor é " + menor);
					
			  }
			 
				else if (n2 < n3) {
				  
				  menor = n2; 
				  
				  System.out.println("O menor valor é " + menor);
				  
			  } else { 
								
				menor = n3;
			    System.out.println("O menor valor é " + menor);
					
			}
		
	  }
     }
	
}
		

