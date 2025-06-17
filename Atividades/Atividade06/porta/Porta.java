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
public class Porta {
    
    public boolean aberta;
    public String cor;
    public int dimensaoX;
    public int dimensaoY;
    public int dimensaoZ;

    public void abre(){
        this.dimensaoZ = 90;
    }
    
    public void fecha(){
        this.dimensaoZ = 0;
    }
    
    public void pintar(String s){
        this.cor = s;
    }
    
    boolean estaAberta(){
        return this.dimensaoZ != 0;
    }
    
}
