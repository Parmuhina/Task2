package Validation;

import Domain.ProductVariables;

import java.util.Scanner;

public class ProductNameValidationRule implements ProductValidationRule {

    @Override
    public void validate(ProductVariables productVariables) {

        checkNotNull(productVariables);
            if (productVariables.getName().length() < 3 | productVariables.getName().length() > 32) {
                throw new ProductValidationException("Name is incorrect. Please insert new name, more than 2" +
                        " and less than 33 symbols.");
            }

    }
}
