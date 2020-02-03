package Validation;

import java.math.BigDecimal;

public class ProductPriceValidation {


    public String productPriceValidation(BigDecimal price){

        BigDecimal x = new BigDecimal("0");

        if (price.compareTo(x)>0){
            return"Price is correct.";
        }else {
            return"Price is not correct. Please enter price that is more than 0.";
        }
    }
}
