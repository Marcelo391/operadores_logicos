import java.util.Scanner;
public class operadoreslogicos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leitor=new Scanner (System.in);
		
	int numero;
	
	System.out.print("digite um numero");
	numero =leitor.nextInt();
		  
	
	if(numero>=20 && numero<=90) 
		System.out.println("O numero " + numero + " esta entre 20 e 90");
	
	else
		System.out.println("o numero " + numero + " nao esta entre 20 e 90");
   
	
	
	
	
	

	
	
	
	
	}

}
