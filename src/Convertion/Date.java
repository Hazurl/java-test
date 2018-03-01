package Convertion;

/*
 *  Date
 */
public class Date implements IConvertibleInteger {
    private int day, month, year;
    
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void set_day(int day) {
        this.day = day;
    }

    public double get_day() {
        return day;
    }

    public void set_month(int month) {
        this.month = month;
    }

    public double get_month() {
        return month;
    }

    public void set_year(int year) {
        this.year = year;
    }

    public double get_year() {
        return year;
    }

    @Override
    public int to_int() {
        return year * 100 * 100 + month * 100 + day;
    }

    @Override
    public String toString() {
        return "{" + day + ", " + month + ", " + year + "} : " + to_int();
    }

}

