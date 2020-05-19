import java.util.Scanner;
public class operadoreslogicos3{ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		
		double salario;
		int num = 15;
		int num2 = 7;
		double aumento = 0,valor;
		
		System.out.print("Digite seu salário:");
		salario =leitor.nextFloat();
		
	
		 if(salario >= 0 && salario <=1000) {
	            aumento = num*salario/100;
	            valor = salario + aumento;
	            System.out.println("Almento de 15%");
	            System.out.printf("Novo salário:R$"+valor);
		 }
	
		 else if(salario >= 1000.01 && salario <= 2500.00) {
	            aumento=num2*salario/100;
			 valor = num2*salario/100;
	            valor = salario + aumento;
	            System.out.println("Almento de 7%");
	            System.out.printf("Novo salário:R$"+valor);
		 }
	
		 else
		 {
	            System.out.println("Acima de 2.500,00R$ não tem aumento");
		 }
		 	
	}
	
}	
	



