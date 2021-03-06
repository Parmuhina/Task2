package Validation;
import Domain.ProductVariables;

public interface ProductValidationRule {

    void validate(ProductVariables productVariables);

    default void checkNotNull(ProductVariables productVariables) {
        if (productVariables == null) {
            throw new ProductValidationException("Product must be not null");
        }
    }
}
