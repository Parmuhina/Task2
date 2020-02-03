package Validation;
;


public class ProductNameValidation {

    public boolean correctName;


    public String productNameValidation(String name) {


        if (name.length() >= 3 && name.length() <= 32) {
            correctName = true;

            return "Name is correct.";
        } else {
            correctName = false;

            return "Name is incorrect. Please insert new name, more than 2 and less than 33 symbols.";


        }
    }


}



