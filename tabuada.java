/**
 * Tabuada
 * @Author Raul Donizeti Nascimento
 * @Version 2018-05-09
 */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		
		//Entrada
		System.out.println("Digite um numero inteiro: ");
		int i = in.nextInt();
		
		// Processo
		
		int a = (i * 1);
		int b = (i * 2);
		int c = (i * 3);
		int d = (i * 4);
		int e = (i * 5);
		int f = (i * 6);
		int g = (i * 7);
		int h = (i * 8);
		int k = (i * 9);
		int j = (i * 10);
		
		//Saida
		System.out.println(i + " x 1 = " + a );
		System.out.println(i + " x 2 = " + b );
		System.out.println(i + " x 3 = " + c );
		System.out.println(i + " x 4 = " + d );
		System.out.println(i + " x 5 = " + e );
		System.out.println(i + " x 6 = " + f );
		System.out.println(i + " x 7 = " + g );
		System.out.println(i + " x 8 = " + h );
		System.out.println(i + " x 9 = " + k );
		System.out.println(i + " x 10 = " + j );
		
	}
		
}
