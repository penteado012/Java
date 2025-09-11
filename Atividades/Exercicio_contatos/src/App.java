public class App {
    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda();
        Contato contato = new Contato("Matheus", "matheuspent12@gmail.com");
        Contato contato2 = new Contato("Junior", "Alcides.ojr@hotmail.com");
        Contato contato3 = new Contato("Marcia", "marcia.o.penteado@gmail.com");

        agenda.adicionarContato(contato);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);

        Contato c = agenda.buscarContato("Matheus");

        if(c != null) {
            System.out.println("Nome: " + c.getNome() + " Email: " + c.getEmail() + "\n");
        } else {
            System.out.println("Nenhum contato foi achado com esse nome!");
        }

        if(agenda.excluirContato("Junior")){
            System.out.println("Contato Excluido com sucesso!");
        } else {
            System.out.println("Esse nome de contato não existe!");
        }

        System.out.println("Nome: " + contato.getNome() + " Email: " + contato.getEmail() + "\n");
        System.out.println("Nome: " + contato2.getNome() + " Email: " + contato2.getEmail() + "\n");
        System.out.println("Nome: " + contato3.getNome() + " Email: " + contato3.getEmail() + "\n");


        System.out.println("Contatos do Array contatos: ");
        agenda.listarContatos();
    }
}
