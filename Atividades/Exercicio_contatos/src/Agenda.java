public class Agenda {
    private Contato[] contatos = new Contato[10];

    public void adicionarContato(Contato contato){
        for(int i = 0; i < this.contatos.length; i++) {
            if(this.contatos[i] == null){
                this.contatos[i] = contato;
                break;
            }
        }
    }

    public Contato buscarContato(String nome){
        for (Contato contato : contatos) {
            if(contato != null && contato.getNome().equals(nome)){
                return contato;
            }
        }
        return null;
    }

    public boolean excluirContato(String excluirNome){
        for(int i = 0; i < contatos.length; i++){
            if(contatos[i] != null && excluirNome.equals(contatos[i].getNome()))
            {
                for(int j = i; j < contatos.length - 1; j++){
                    contatos[j] = contatos[j + 1];
                }
                contatos[contatos.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    public void listarContatos(){
        for (Contato contato : contatos) {
            if(contato != null){
                System.out.println("Nome: " + contato.getNome() + " Email: "+ contato.getEmail());
            }
        }
    }
}
