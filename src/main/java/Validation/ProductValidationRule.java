package Validation;
import Domain.ProductVariables;

public interface ProductValidationRule {

    void validate(ProductVariables productVariables);
}
