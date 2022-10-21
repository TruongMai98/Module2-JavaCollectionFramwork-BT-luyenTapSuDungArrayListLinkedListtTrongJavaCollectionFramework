import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManagement {
    private List<Product> products;

    public ProductManagement() {
        this.products = new ArrayList<>();
    }

    public ProductManagement(List<Product> products) {
        this.products = products;
    }

    public void add(Product product) {
        products.add(product);
    }

    public Product searchById(int id) {
        for (Product product : products){
            if (product.getId() == id);
            return product;
        }
        return null;
    }

    public Product searchByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void remove(int id) {
        Product product = searchById(id);
        if (product != null) {
            products.remove(product);
        }
    }

    public void sortAscending() {
        ProductComparatorAscending productComparatorAscending = new ProductComparatorAscending();
        products.sort(productComparatorAscending);
    }

    public void sortDecrease() {
        ProductComparatorDecrease productComparatorDecrease = new ProductComparatorDecrease();
        products.sort(productComparatorDecrease);
    }
    public void update(int id, Product newProduct) {
        Product product = searchById(id);
        if (product != null) {
            product.setName(newProduct.getName());
            product.setPrice(newProduct.getPrice());
        }

    }
    @Override
    public String toString() {
        return "ProductManagement{" +
                "products=" + products +
                '}';
    }


}
