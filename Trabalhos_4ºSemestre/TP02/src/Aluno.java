import java.util.UUID;

public class Aluno {
    private String endereco;
    private int idade;
    private String nome;
    private UUID uuid;

    public Aluno(String Endereco, int Idade, String Nome){
        this.endereco = Endereco;
        this.idade = Idade;
        this.nome = Nome;
        this.uuid = UUID.randomUUID();
    }

    public String getEndereco(){
        return endereco;
    }

    public int getIdade(){
        return idade;
    }

    public String getNome(){
        return nome;
    }

    public UUID getUuid(){
        return uuid;
    }

    public void setEndereco(String Endereco){
        this.endereco = Endereco;
    }

    public void setIdade(int Idade){
        this.idade = Idade;
    }

    public void setNome(String Nome){
        this.nome = Nome;
    }

    public void setUuid(UUID Uuid){
        this.uuid = Uuid;
    }
}
