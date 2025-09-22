/*
Nome: Kaik Persike Maiorquino
Prontuário: CB3029689

Nome: Matheus Penteado de Barros
Prontuário: CB3031501
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhopratico03;

/**
 *
 * @author Kaik
 */
public class TrabalhoPratico03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Teste com entrada do usuário ===");
        Hora hora1 = new Hora();  // Vai pedir os valores via teclado
        System.out.println("Hora 1 (formato 24h): " + hora1.getHora1());
        System.out.println("Hora 1 (formato 12h): " + hora1.getHora2());
        System.out.println("Hora 1 em segundos: " + hora1.getSegundos());

        // Teste com valores diretos
        System.out.println("\n=== Teste com valores diretos ===");
        Hora hora2 = new Hora(27, 30, 99);  // Devera pedir ao usuario redigitar o 1º e 3º valores validos
        System.out.println("Hora 2 (formato 24h): " + hora2.getHora1());
        System.out.println("Hora 2 (formato 12h): " + hora2.getHora2());
        System.out.println("Hora 2 em segundos: " + hora2.getSegundos());

        // Teste dos setters
        System.out.println("\n=== Teste de setters ===");
        hora2.setHor(22);
        hora2.setMin(59);
        hora2.setSeg(89); // Devera pedir ao usuario redigitar
        System.out.println("Hora 2 atualizada (formato 24h): " + hora2.getHora1());
        
        // Teste dos setter para digitar o valor (vai pedir valores via teclado)
        System.out.println("\n=== Teste de entrada dos setters ===");
        hora2.setHor();
        hora2.setMin();
        hora2.setSeg();
        System.out.println("Hora 2 atualizada novamente (formato 24h): " + hora2.getHora1());
    }
    
}
