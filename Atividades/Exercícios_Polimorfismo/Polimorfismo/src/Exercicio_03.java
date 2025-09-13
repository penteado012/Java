public class Exercicio_03{
    public static void main(String[] args) throws Exception {
        /*Author author = new Author("Matheus", "matheuspent12@gmail.com", 'm');
        
        System.out.println(author.toString());

        author.setEmail("matheuzinho@gmail.com");

        System.out.println(author.toString());

        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        System.out.println(author.getName());*/

        /* Author[] authors = new Author[2];

        authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');

        authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');

        Book testeBook = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(testeBook); // toString() */
        Student s = new Student("Matheus", "#Gylmza2", "ADS", 2025, 10.2);

        Staff f = new Staff("Isabelle", "Isinha123", "Reverendo", 200.00);

        System.out.println(s.toString());
        System.out.println(f.toString());

        System.out.println(s.getProgram());
        s.setProgram("Analista");
        System.out.println(s.getProgram());

        System.out.println(s.getYear());
        s.setYear(2026);
        System.out.println(s.getYear());

        System.out.println(s.getFee());
        s.setFee(11.2);
        System.out.println(s.getFee());

        System.out.println(s.toString());

        //

        System.out.println(f.getSchool());
        f.setSchool("ETEC");
        System.out.println(f.getSchool());

        System.out.println(f.getPay());
        f.setPay(2027);
        System.out.println(f.getPay());

        System.out.println(f.toString());
    }
}
