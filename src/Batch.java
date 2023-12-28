import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Batch implements Iterable<Product> {
    private List<Product> products;

    public Batch() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}