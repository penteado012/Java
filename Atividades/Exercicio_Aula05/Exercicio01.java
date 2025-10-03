package Atividades.Exercicio_Aula05;
import java.util.*;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};        
        try{
            System.out.println("Digite um numero de 1 a 12: ");
            int numero = sc.nextInt() - 1;      
            System.out.println(meses[numero]);      
        } 
        catch(InputMismatchException e){
            System.out.println("ERRO!!! Digite apenas numero de 1 á 12!!!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ERRO!!! Digite um número entre 1 e 12!!!");
        }
        sc.close();
    }     
}

