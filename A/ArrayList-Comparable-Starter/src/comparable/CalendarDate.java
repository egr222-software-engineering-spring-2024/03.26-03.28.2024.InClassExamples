package comparable;

//Make this code implement Comparable interface
public class CalendarDate implements Comparable<> {
    private int year;
    private int month;
    private int day;
    
    public CalendarDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getDay() {
        return day;
    }
    
    public String toString() {
        return year + "/" + String.format("%02d", month) + "/" + String.format("%02d", day);
    }

    @Override
    public int compareTo(CalendarDate o) {
        if (this.year == o.year) {
            if (this.month == o.month) {
                return this.day - o.day;
            }
            return this.month - o.month;
        }
        return this.year - o.year;
    }

// YOUR CODE GOES HERE
}