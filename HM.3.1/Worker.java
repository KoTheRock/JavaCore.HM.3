public class Worker {
    public static int compareDates(int year1, int month1, int day1, int year2, int month2, int day2){
        int date1 = year1 * 10000 + month1 * 100 + day1;
        int date2 = year2 * 10000 + month2 * 100 + day2;

        return Integer.compare(date1, date2);
        }
    }

