public class EsperavaDigito extends Exception {
    EsperavaDigito(char c){
        super("Caracter Digitado: " + c + ". Espereado: 0 a 9");
    }    
}