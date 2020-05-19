import java.util.Scanner;
public class operadoreslogicos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		Scanner leitor = new Scanner(System.in);
        int l1, l2, l3;
        System.out.println("Digite 1 valor para cada lado de um triângulo.");
        
        System.out.print("Primeiro valor:");
        l1 = leitor.nextInt();
        ;
        System.out.print("Segundo valor:");
        l2 = leitor.nextInt();
      
        System.out.print("Terceiro valor:");
        l3 = leitor.nextInt();
        
        if(l1 == l2 && l1 == l3){
            System.out.print("triangulo equilatero.");
        }else if(l1==l2 || l1==l3 || l2==l3){
            System.out.print("triangulo isosceles.");
        }else if(l1!=l2 && l2!=l3){
            System.out.print("triangulo  escaleno.");
        }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
