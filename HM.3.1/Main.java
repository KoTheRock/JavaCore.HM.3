public class Main {
    public static void main(String[] args) {

        int result = Worker.compareDates(2024, 12, 9, 2017, 7, 3);
        System.out.println(result > 0 ? "Первая дата позже" : result < 0 ? "Первая дата раньше" : "Даты равны");
    }
}
