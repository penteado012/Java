package comparavel;

public class Comparavel {

    private int valorInteiro;
    
    public Comparavel(int valor)
    {
        this.valorInteiro = valor;
        
         MaiorOuIgual(5);
         MenorOuIgual(4);
         DiferenteDe(3);
    }
    
    public boolean MaiorOuIgual(int par){
        if(par <= valorInteiro) {
            System.out.println("O valor digitado é maior ou igual ao parametro");
        } else {
            System.out.println("O valor Digitado não é menor ou igual ao parametro");
        }
    }
    
    public boolean MenorOuIgual(int par){
        if(par >= valorInteiro)
    }
    
    public boolean DiferenteDe(int par) {
        
    }
}
