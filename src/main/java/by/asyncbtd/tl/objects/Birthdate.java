package by.asyncbtd.tl.objects;

public class Birthdate {

    private Integer day;
    private Integer month;
    private Integer year;

    public Integer getDay() {
        return this.day;
    }

    public Integer getMonth() {
        return this.month;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String toString() {
        return "Birthdate(day=" + this.day +
                ", month=" + this.month +
                ", year=" + this.year + ")";
    }

    public Birthdate() {
    }

    public Birthdate(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
