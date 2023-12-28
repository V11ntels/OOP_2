public class ProductRange {
    private Batch productBatch;

    public ProductRange(Batch productBatch) {
        this.productBatch = productBatch;
    }

    public void displayExpiredProducts(Warehouse_Controller warehouseController) {
        warehouseController.checkExpiry(productBatch);

        for (Product product : productBatch) {
            System.out.println(product.getName() + " - " + product.getExpiryDate());
        }
    }
}