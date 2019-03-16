package source;

import java.util.Scanner;

public class MainJava 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um valor");
		int valor = scanner.nextInt();
		
		try {
		dividirValor(valor);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divisão Inválida. " + e.getMessage());
		}
		finally{
			System.out.println("Fechando a Aplicação...");
		}
	}
	
	private static int dividirValor(int valor) 
	{
		return  10/valor;
	}
}
