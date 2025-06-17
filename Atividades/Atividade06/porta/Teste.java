/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porta;

/**
 *
 * @author aluno
 */
public class Teste {
    
    public static void confere(Porta porta_azul_ou_verde){
        if(!porta_azul_ou_verde.estaAberta()){
            System.out.println("NÃO TÔ ABERTO!!!");
        }else{
            System.out.println("TÔ ABERTO!");
        }
    }
    
    public static void main(String[] args) {
        Porta porta_azul_verde = new Porta();
        
        porta_azul_verde.dimensaoX = 100;
        porta_azul_verde.dimensaoY = 15;
        porta_azul_verde.dimensaoZ = 90; // abierto
        porta_azul_verde.cor = "verda";

        confere(porta_azul_verde);
        
        porta_azul_verde.fecha();
        
        confere(porta_azul_verde);
        
        porta_azul_verde.pintar("azula");
        
        System.out.println(porta_azul_verde.cor);
        
        porta_azul_verde.abre();
        
        confere(porta_azul_verde);
    }
    
}
