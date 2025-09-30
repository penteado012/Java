import javax.swing.*;

public class ExemploExcecao{
    //metodo para conversao
    static int charToNum (char c) throws EsperavaDigito{
        if (c>='0' && c <='9'){
            return (c-'0');
        } else {
            throw new EsperavaDigito(c);
        }
    }
    //metodo para formar maior valor com dois algarismos
    static int maiorComDois(int n1, int n2){
        return (n1 > n2) ? n1 * 10 + n2 : n2 * 10 + n1;
    }

    //exibe caixas de dialogo e monta as estruturas try..cath
    static void dialogo(){
        char c1, c2;
        int d1, d2, v;
        try{
            c1 = ( (String) JOptionPane.showInputDialog("Digite valor de 0 a 9:")).charAt(0);
            c2 = ( (String) JOptionPane.showInputDialog("Digite valor de 0 a 9:")).charAt(0);
            d1 = charToNum(c1);
            d2 = charToNum(c2);
            v = maiorComDois(d1, d2);
            JOptionPane.showMessageDialog(null,"Maior inteiro com "+c1+" e "+c2+" =\n"+ v , "Resultado",JOptionPane.INFORMATION_MESSAGE);
        }

        catch(EsperavaDigito excecao){
            JOptionPane.showMessageDialog(null,excecao.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args){
        dialogo();
    }
}
