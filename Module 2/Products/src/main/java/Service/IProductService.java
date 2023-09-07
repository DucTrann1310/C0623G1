package Service;

import Models.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
    void createProduct(Product product);
    void updateProduct(long id, Product product);
    void deleteProduct(long id);
    List<Product> findMaxPriceProduct(List<Product> products);
    Product findProductById(long id);
}
