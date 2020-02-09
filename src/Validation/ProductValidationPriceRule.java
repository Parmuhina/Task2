package Validation;

import Domain.ProductVariables;

public interface ProductValidationPriceRule {

    void validatePrice(ProductVariables productVariables);

    default void checkNotNull(ProductVariables productVariables) {
        if (productVariables == null) {
            throw new ProductValidationException("Product must be not null");
        }
    }
}
