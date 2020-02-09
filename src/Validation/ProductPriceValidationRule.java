package Validation;

import Domain.ProductVariables;
import java.math.BigDecimal;

public class ProductPriceValidationRule implements ProductValidationPriceRule {
    @Override
    public void validatePrice(ProductVariables productVariables){
        checkNotNull(productVariables);
        BigDecimal bigDecimalNull = new BigDecimal("0");
        if (productVariables.getPrice().compareTo(bigDecimalNull)<=0){

            throw new ProductValidationException ("Price is not correct. Please enter price that is more than 0.");
        }
    }
}

