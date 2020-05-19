import java.util.Scanner;
public class operadoreslogicos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		Scanner leitor = new Scanner(System.in);
        int v1, v2, v3;
        System.out.println("Digite 1 valor para cada lado de um triângulo.");
        
        System.out.print("Primeiro valor:");
        v1 = leitor.nextInt();
        ;
        System.out.print("Segundo valor:");
        v2 = leitor.nextInt();
      
        System.out.print("Terceiro valor:");
        v3 = leitor.nextInt();
        
        if(v1 == v2 && v1 == v3){
            System.out.print("O triângulo é equilátero.");
        }else if(v1==v2 || v1==v3 || v2==v3){
            System.out.print("O triângulo é isósceles.");
        }else if(v1!=v2 && v2!=v3){
            System.out.print("O triângulo é escaleno.\n");
        }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
