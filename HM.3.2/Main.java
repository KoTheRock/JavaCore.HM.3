public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Артем", 100000),
                new Employee("Анатолий", 120000),
                new Manager("Максим", 150000),
                new Manager("Илья", 160000)
        };
        System.out.println("До:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        Manager.increaseSalaries(employees, 10000);

        System.out.println("После:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
