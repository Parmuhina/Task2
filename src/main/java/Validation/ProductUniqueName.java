package Validation;
import Domain.ProductVariables;
import Product.ProductRepository;

public class ProductUniqueName implements ProductValidationUniqueRule {

   private final ProductRepository repository;

    public ProductUniqueName(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void validateUniqueName(ProductVariables productVariables) {
        checkNotNull(productVariables);
        if (repository.existsByName(productVariables.getName())) {
            throw new ProductValidationException("Task name must be unique.");
        }
    }

}
