import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущую дату (день.месяц.год):");
        String currentDate = scanner.nextLine();
        ProductType productType1 = new ProductType("Fish");
        Quantity quantity1 = new Quantity(10, 500);
        ExpiryDate expiryDate1 = new ExpiryDate(15, 12, 2022, 29, 12, 2022);
        Product product1 = new Product(expiryDate1, productType1, quantity1, 199.99, "salmon");

        ProductType productType2 = new ProductType("Fruit");
        Quantity quantity2 = new Quantity(5, 1000);
        ExpiryDate expiryDate2 = new ExpiryDate(10, 6, 2023, 24, 6, 2023);
        Product product2 = new Product(expiryDate2, productType2, quantity2, 49.99, "orange");

        ProductType productType3 = new ProductType("Meat");
        Quantity quantity3 = new Quantity(20, 2000);
        ExpiryDate expiryDate3 = new ExpiryDate(31, 8, 2022, 10, 9, 2023);
        Product product3 = new Product(expiryDate3, productType3, quantity3, 9.99, "Bacon");

        Batch productBatch = new Batch();
        productBatch.addProduct(product1);
        productBatch.addProduct(product2);
        productBatch.addProduct(product3);

        Warehouse_Controller warehouseController = new Warehouse_Controller(currentDate, productBatch);
        warehouseController.checkExpiry(productBatch);

    }

}