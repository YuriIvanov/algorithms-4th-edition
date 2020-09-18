package yurivan.algorithms4th.examples.fundamentals.dataabstraction.dates.basicdate;

import java.util.Objects;

public class Date {
    private final int month;
    private final int day;
    private final int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return
                getMonth() + "/" +
                        getDay() + "/" +
                        getYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return getMonth() == date.getMonth() &&
                getDay() == date.getDay() &&
                getYear() == date.getYear();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMonth(), getDay(), getYear());
    }
}
