import java.util.Scanner;

public class stringformatada {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero de minutos: ");
		int minutos = sc.nextInt();
		
		int horas = minutos / 60;
		int minutosrestantes = minutos % 60;
		
		System.out.println(horas + " horas " + minutosrestantes + " minutos");	
	}
}