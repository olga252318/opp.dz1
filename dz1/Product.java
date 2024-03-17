public abstract class Product {
    
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    private String name;
    private int price;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo(){
        return String.format("name: s% price: %d", 
            this.name, this.price);
    }

}
