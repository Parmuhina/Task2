package Validation;

import Domain.ProductVariables;
import java.math.BigDecimal;

public class ProductPercentValidationRule implements ProductValidationPercentRule{

    @Override
    public void validatePercent (ProductVariables productVariables){
        checkNotNull(productVariables);
        BigDecimal bigDecimalNull = new BigDecimal("0");
        BigDecimal bigDecimalThousand = new BigDecimal("100");
        if (productVariables.getPercent().compareTo(bigDecimalNull)<0 |
                productVariables.getPercent().compareTo(bigDecimalThousand)>0){
            throw new ProductValidationException ("Percent is not correct. Please enter percent that is more than 0 " +
                    "and less or equal to 100.");
        }
    }
}