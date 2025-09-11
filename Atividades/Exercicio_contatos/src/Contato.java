public class Contato {
    private String nome;
    private String email;

    public String getNome(){
        return this.nome;
    }

    public void setnome(String Novonome){
        this.nome = Novonome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String novoEmail){
        this.email = novoEmail;
    }

    public Contato(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
}
