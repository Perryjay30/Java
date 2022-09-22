package Exercise5_32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FairTaxException {
        Scanner input  = new Scanner(System.in);
        FairTaxCalculator fairTaxCalculator = new FairTaxCalculator();
        System.out.println("number of products? ");
        int numberOfProducts = input.nextInt();
        if(numberOfProducts < 1) throw new FairTaxException("product number cannot be " + numberOfProducts);

        for(int index = 1; index <= numberOfProducts; index++) {
            System.out.printf("Enter product %d 's name:\n ", index);
            String productName = input.next();
            System.out.printf("Enter the price of %s:\n", productName);
            double productPrice = input.nextDouble();
            Product product = new Product(productName,productPrice);
            fairTaxCalculator.calculateTotalPrice(product.getPrice());
        }

        double grandTotal = fairTaxCalculator.getTotalPrice();
        double fairTax = fairTaxCalculator.calculateTax(grandTotal);
        System.out.printf("pay %.2f now!!!", fairTax);
    }
}
