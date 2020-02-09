package Validation;

import Domain.ProductVariables;
import Product.ProductRepository;

public class Service {

    private ProductRepository repository = new ProductRepository();
    private ProductValidationService validationService = new ProductValidationService();

    public Long createProduct(ProductVariables productVariables){
        validationService.validate(productVariables);
        validationService.validatePrice(productVariables);
        validationService.validatePercent(productVariables);
        ProductVariables createdProduct= repository.insert(productVariables);

        return createdProduct.getId();
    }

    public ProductVariables findProductById (Long id){
        return repository.findProductById(id);
    }
}
