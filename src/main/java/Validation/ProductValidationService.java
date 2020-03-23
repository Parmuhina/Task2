package Validation;
import Domain.ProductVariables;
import Product.ProductRepository;

import java.util.HashSet;
import java.util.Set;


public class ProductValidationService {

    private Set<ProductValidationRule> validationRules = new HashSet<>();
    private Set<ProductValidationPercentRule> validationPercentRules = new HashSet<>();
    private Set<ProductValidationPriceRule> validationPriceRules = new HashSet<>();
    private Set<ProductValidationUniqueRule> validationUniqueRules = new HashSet<>();



    public ProductValidationService() {
        validationRules.add(new ProductNameValidationRule());
        validationPercentRules.add(new ProductPercentValidationRule());
        validationPriceRules.add(new ProductPriceValidationRule());
        validationUniqueRules.add(new ProductUniqueName());
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

    public void validateUniqueName(ProductVariables productVariables) {
        validationUniqueRules.forEach(s -> s.validateUniqueName(productVariables));
    }
}
