public class Pessoa {
    protected static int kp = 0;
    protected String nome;
    protected char sexo;
    protected int idade;

    public Pessoa() {
        kp++;
    }

    public Pessoa(String Nome, char Sexo, int Idade){
        this.nome = Nome;
        this.sexo = Sexo;
        this.idade = Idade;
        kp++;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public void setSexo(char Sexo){
        this.sexo = Sexo;
    }

    public void setIdade(int Idade){
        this.idade = Idade;
    }

    public int getKp(){
        return kp;
    }

    public String getNome(){
        return nome;
    }

    public char getSexo(){
        return sexo;
    }

    public int getIdade(){
        return idade;
    }

    public void setKp(){
        kp++;
    }


}
