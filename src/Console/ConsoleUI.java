package Console;

import Domain.ProductVariables;
import Validation.ProductValidationService;
import Validation.Service;
import java.math.BigDecimal;
import java.util.Scanner;

public class ConsoleUI {
    private Service productService = new Service();

    public void execute() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("1. Create product");
                System.out.println("2. Find product by id");
                System.out.println("3. Change");
                System.out.println("4. Delete");
                System.out.println("5. Exit");
                Integer userInput = Integer.valueOf(scanner.nextLine());
                switch (userInput) {
                    case 1:
                        createProduct();
                        break;
                    case 2:
                        findProductID();
                        break;
                    case 3:
                        changeProduct();
                        break;
                    case 4:
                        deleteProduct();
                        break;
                    case 5:

                        return;
                }
            } catch (Exception e) {
                System.out.println("Incorrect choice. Please insert number more than 0 and less than 6.");
            }
        }
    }

    private void createProduct() {
        ProductVariables product = new ProductVariables();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        product.setName(name);




        while ((product.getName().length() < 3) | (product.getName().length() > 32)) {

            System.out.println("Name need to be more than 2 and less than 33 symbols." +
                    "Enter new name.");

            if ((product.getName().length() < 3) | (product.getName().length() > 32)) {
                name = scanner.nextLine();
                product.setName(name);
            }
        }

        System.out.println("Enter product price: ");
        BigDecimal price = new BigDecimal(scanner.nextLine());
        product.setPrice(price);

        BigDecimal bigDecimalNull = new BigDecimal("0");
        while (product.getPrice().compareTo(bigDecimalNull) <= 0) {

            if (product.getPrice().compareTo(bigDecimalNull) <= 0) {
                price = new BigDecimal(scanner.nextLine());
                product.setPrice(price);
            }
        }
        System.out.println("If you want to enter category, press 1, if you don`t want to enter category, press 2.");
        Integer userInput1 = Integer.valueOf(scanner.nextLine());
        if (userInput1 == 1) {
            System.out.println("Enter product category: ");
            String category = scanner.nextLine();
            product.setCategory(category);
        }
        while (userInput1 != 1 && userInput1 != 2) {
            System.out.println("You entered incorrect value. " +
                    "If you want to enter category, press 1, if you don`t want to enter category, press 2.");
            userInput1 = Integer.valueOf(scanner.nextLine());
            if (userInput1 == 1) {
                System.out.println("Enter product category: ");
                String category = scanner.nextLine();
                product.setCategory(category);
            }
        }
        System.out.println("Enter product percents: ");
        BigDecimal percent = new BigDecimal(scanner.nextLine());
        product.setPercent(percent);

        BigDecimal bigDecimalThousand = new BigDecimal("100");
        while (product.getPercent().compareTo(bigDecimalNull) < 0 |
                product.getPercent().compareTo(bigDecimalThousand) > 0) {

            if (product.getPercent().compareTo(bigDecimalNull) < 0 |
                    product.getPercent().compareTo(bigDecimalThousand) > 0) {
                percent = new BigDecimal(scanner.nextLine());
                product.setPercent(percent);
            }
        }

        Long id = productService.createProduct(product);
        System.out.println("Result: " + id);
        System.out.println("Chose your next step.");
    }

    private void findProductID() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id: ");
        Long id = scanner.nextLong();
        ProductVariables product = productService.findProductById(id);
        System.out.println(product);
    }

    private void changeProduct() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter product id to change it: ");
        Long id = scanner1.nextLong();
        ProductVariables product = productService.findProductById(id);
        product.setId(id);
        System.out.println("Enter product name: ");
        String name = scanner1.nextLine();
        name = scanner1.nextLine();
        product.setName(name);
        System.out.println("Enter product price: ");
        BigDecimal price = new BigDecimal(scanner1.nextLine());
        product.setPrice(price);
        System.out.println("You entered incorrect value. " +
                "If you want to enter category, press 1, if you don`t want to enter category, press 2.");
        Integer userInput1 = Integer.valueOf(scanner1.nextLine());
        if (userInput1 == 1) {
            System.out.println("Enter product category: ");
            String category = scanner1.nextLine();
            product.setCategory(category);
        }
        System.out.println("Enter product percents: ");
        BigDecimal percent = new BigDecimal(scanner1.nextLine());
        product.setPercent(percent);
    }

    private void deleteProduct() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter product id to change it: ");
        Long id = scanner1.nextLong();
        ProductVariables product = productService.findProductById(id);
        product.setPercent(null);
        product.setName(null);
        product.setPrice(null);
        product.setCategory(null);
        product.setId(null);
    }
}
