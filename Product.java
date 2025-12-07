public class Product {
    private String name;
    private int stock;
    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }
    public void buyOne() {
        if (stock > 0) {
            this.stock --;
        }else{
            System.out.println("No such product!");
        }
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Stock: " + stock);
    }
    public String getName(){return name;}
}
