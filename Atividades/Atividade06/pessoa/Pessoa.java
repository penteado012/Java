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
public class Pessoa {
    
    public String nome;
    public int idade;
    
    public void fazAniversario(){
        this.idade++;
        System.out.println(this.nome + " fez " + idade);
    }    
}
