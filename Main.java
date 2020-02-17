/**
 * Verificador de triângulo
 * @Author Raul Donizeti Nascimento
 * @Version 2018-04-13
 */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Entrada
		System.out.println("Qual o valor do lado A do triângulo?");
		double a = in.nextDouble(); 
		
		System.out.println("Qual o valor do lado B do triângulo?");
		double b = in.nextDouble(); 
		
		System.out.println("Qual o valor do lado C do triângulo?");
		double c = in.nextDouble();
		
		//Processo 
		if ((a < b+c || b < a + c || c < a + b))
		System.out.println("Isso é um triângulo");
	
	}
}
