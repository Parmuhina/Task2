package Validation;
import Domain.ProductVariables;

import java.util.HashSet;
import java.util.Set;

public class ProductValidationService {

    private Set<ProductValidationRule> validationRules = new HashSet<>();
    private Set<ProductValidationPercentRule> validationPercentRules = new HashSet<>();
    private Set<ProductValidationPriceRule> validationPriceRules = new HashSet<>();

    public ProductValidationService() {
        validationRules.add(new ProductNameValidationRule());
        validationPercentRules.add(new ProductPercentValidationRule());
        validationPriceRules.add(new ProductPriceValidationRule());
    }

    public void validate(ProductVariables productVariables) {
        validationRules.forEach(s -> s.validate(productVariables));
    }


    public void validatePercent(ProductVariables productVariables) {
        validationPercentRules.forEach(s -> s.validatePercent(productVariables));
    }

    public void validatePrice(ProductVariables productVariables) {
        validationPriceRules.forEach(s -> s.validatePrice(productVariables));
    }
}
