package Validation;

import java.math.BigDecimal;

public class ProductPercentValidation {

    public String productPercentValidation(BigDecimal percent){

        BigDecimal x = new BigDecimal("0");
        BigDecimal y = new BigDecimal("100");
        if (percent.compareTo(x)>0 && percent.compareTo(y)<=0){
            return"Percent is correct.";
        }else {
            return"Percent is not correct. Please enter percent that is more than 0 and less or equal to 100.";
        }

    }
}
