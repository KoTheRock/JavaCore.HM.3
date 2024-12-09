public class Manager extends Employee{
    public Manager(String name, int salary){
        super(name, salary);
    }
    public static void increaseSalaries(Employee[] employees, int amount){
        for (Employee employee : employees) {
            if(!(employee instanceof Manager)){
                employee.setSalary(employee.getSalary() + amount);
            }
        }

    }
}
