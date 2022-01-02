package classstructureconstructors;

public class Store {

    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
    }

    public void store(int amount) {
        stock += amount;
    }

    public void dispatch(int amount) {
        stock -= amount;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }
}
