package yurivan.algorithms4th.examples.fundamentals.dataabstraction.dates.smalldate;

public class Date {
    private final int value;

    public Date(int month, int day, int year) {
        this.value = year * 512 + month * 32 + day;
    }

    public int getMonth() {
        return (value / 32) % 16;
    }

    public int getDay() {
        return value % 32;
    }

    public int getYear() {
        return value / 512;
    }

    @Override
    public String toString() {
        return
                getMonth() + "/" +
                        getDay() + "/" +
                        getYear();
    }
}
