public class Book extends Product {


    private String author;

    public Book() {

    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
        double price = this.getPrice() - (this.getPrice() * 0.25);
        System.out.println(" 25% Discount Applied ");
        return price;
    }
}
