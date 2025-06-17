/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author aluno
 */
public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.idade = 18;
        pessoa1.nome = "Matheus";
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Kaik";
        pessoa2.idade = 21;
        
        pessoa1.fazAniversario();
        pessoa2.fazAniversario();
    }    
}
