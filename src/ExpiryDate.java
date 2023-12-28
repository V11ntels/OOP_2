public class ExpiryDate {
    private int B_day;
    private int B_month;
    private int B_year;
    private int E_day;
    private int E_month;
    private int E_year;


    public ExpiryDate(int B_day, int B_month, int B_year, int E_day, int E_month, int E_year) {
        this.B_day = B_day;
        this.B_month = B_month;
        this.B_year = B_year;
        this.E_day = E_day;
        this.E_month = E_month;
        this.E_year = E_year;
    }
    public void setDate(int E_day, int E_month, int E_year) {
        this.E_day = E_day;
        this.E_month = E_month;
        this.E_year = E_year;
    }

    public String getDate() {
        return String.format("%d.%d.%d", this.E_day, this.E_month, this.E_year);
    }
}



