package gotThatProduct;

public class ExpirationDate {
    private String month;
    private String day;
    private String year;

    public ExpirationDate(String month, String day, String year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return month + " " + day + " " + year ;
    }
}
