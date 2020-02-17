/**
 * Divisor 
 * @Author Raul Donizeti Nascimento
 * @Version 2018-05-09
 */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
	
	//Entrada
	System.out.println("Digite o valor a ser dividido:");
	
	
	
	//Processo 
	int y = in.nextInt();
        for(int i = y; i>0;i--){
            if(y%i==0){
                System.out.println(i);
            }
        }
		
	}
}
