public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){
        return name;
    }

    public Author[] getAuthors(){
        return authors;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Book: ");
        sb.append("Nome: ").append(name).append("\n");
        sb.append("Author: \n");
        for (Author a : authors) {
            if(a != null){
                sb.append("     Nome: ").append(a.getName()).append("      \nEmail: ").append(a.getEmail()).append("      \nGender: ").append(a.getGender());
            }
        }
        sb.append("\nPrice: ").append(price);
        sb.append("\nQty: ").append(qty);
        return sb.toString();
    }

    public String getAuthorNames(){
        StringBuilder sb = new StringBuilder();
            for (Author a : authors) {
                if(a != null){
                    if(sb.length() > 0){
                        sb.append(", ");
                    }
                    sb.append(a.getName());
                }
            }
        return sb.toString();
    }
}
