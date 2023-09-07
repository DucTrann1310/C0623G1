package Service;

import Models.Product;
import Utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{
    @Override
    public List<Product> getAll() {
        return FileUtils.readDataUseFor();
    }

    @Override
    public void createProduct(Product product) {
        List<Product> products = getAll();
        products.add(product);

        FileUtils.writeData(products);
    }

    @Override
    public void updateProduct(long id,  Product product) {
        List<Product> products = getAll();
        for(Product p : products){
            if(p.getId() == id){
                p.setId(product.getId());
                p.setName(product.getName());
                p.setCategory(product.getCategory());
                p.setPrice(product.getPrice());
                p.setQuantity(product.getQuantity());
                p.setDescription(product.getDescription());
                break;
            }
        }
        FileUtils.writeData(products);
    }

    @Override
    public void deleteProduct(long id) {
        List<Product> products = getAll();
        products.removeIf(p -> p.getId() == id);
        FileUtils.writeData(products);
    }

    @Override
    public List<Product> findMaxPriceProduct(List<Product> products) {
        List<Product> priceProduct = new ArrayList<>();
        if(products.isEmpty()){
            return priceProduct;
        }
        double maxPrice = Double.MIN_VALUE;
        for(Product p : products){
            if(p.getPrice() > maxPrice){
                maxPrice = p.getPrice();
            }
        }
        for(Product p : products){
            if(p.getPrice() == maxPrice){
                priceProduct.add(p);
            }
        }
        return priceProduct;
    }

    @Override
    public Product findProductById(long id) {
        List<Product> products = getAll();
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst().orElse(null);
    }

}
