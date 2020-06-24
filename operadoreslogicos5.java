import java.util.Scanner;
public class operadoreslogicos5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner leitor = new Scanner(System.in);
	        float nota1, nota2, nota3, nota4, soma;
	        System.out.println("Digite suas 4 notas de fisica");
	        
	       
	        System.out.print("Nota 1:");
	        nota1 = leitor.nextFloat();
	        System.out.print("Nota 2:");
	        nota2 = leitor.nextFloat();
	        System.out.print("Nota 3:");
	        nota3 = leitor.nextFloat();
	        System.out.print("Nota 4:");
	        nota4 = leitor.nextFloat();
	       
	        soma = (nota1+nota2+nota3+nota4)/4;
	        System.out.println(soma);
	        
	        
	        if(soma >= 7 ){
	            System.out.printf("Media:"+soma);
	            System.out.println(",Aprovado");
	        
	        }else if(soma >= 3.5 || soma < 7){
	            System.out.printf("Media: " +soma);
	            System.out.println( ",Recuperacao");  
	        
	        }else if(soma < 3.5){
	            System.out.printf("Media:"+soma);
	            System.out.println(",Reprovado"); 
	        }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
