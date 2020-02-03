package Validation;
import Domain.ProductVariables;
import Product.ProductRepository;


public class Service {

    private ProductRepository repository = new ProductRepository();

    public Long createProduct(ProductVariables productVariables){
        ProductVariables createdProduct= repository.insert(productVariables);
        return createdProduct.getId();
    }

    public ProductVariables findProductById (Long id){

        return repository.findProductById(id);
    }
}
