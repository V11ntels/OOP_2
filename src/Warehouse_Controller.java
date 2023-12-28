import com.sun.jdi.Value;

public class Warehouse_Controller {
    private String currentDate;
    private Batch productBatch;

    public Warehouse_Controller(String currentDate, Batch productBatch) {
        this.currentDate = currentDate;
        this.productBatch = productBatch;
    }

    public void checkExpiry(Batch productBatch) {

        for (Product product : productBatch) {
            ExpiryDate expiryDate = product.getExpiryDate();
            System.out.println(dateToString(expiryDate));
            if (compareDates(currentDate, dateToString(expiryDate)) > 0) {
                System.out.println("Товар удален");
            }
            else {System.out.println("Товар добавлен"); }

        }
    }

    public String dateToString(ExpiryDate expiryDate) {
        String date = expiryDate.getDate();
        return date;
    }

    private int compareDates(String date1, String date2) {
        String[] parts1 = date1.split("\\.");
        String[] parts2 = date2.split("\\.");

        int day1 = Integer.parseInt(parts1[0]);
        int month1 = Integer.parseInt(parts1[1]);
        int year1 = Integer.parseInt(parts1[2]);

        int day2 = Integer.parseInt(parts2[0]);
        int month2 = Integer.parseInt(parts2[1]);
        int year2 = Integer.parseInt(parts2[2]);

        if (year1 != year2) {
            return year1 - year2;
        } else if (month1 != month2) {
            return month1 - month2;
        } else {
            return day1 - day2;
        }
    }
}