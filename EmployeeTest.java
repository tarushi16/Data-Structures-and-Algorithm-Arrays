public class EmployeeTest {
    private static int employeeCount = 0;
    public static void main(String[] args) {
        // Create some employees
        Employee employee1 = new Employee("John Doe", 100000);
        Employee employee2 = new Employee("Jane Doe", 90000);
        Employee employee3 = new Employee("Peter Parker", 80000);
        // Print the number of employees
        System.out.println("Number of employees: " + employeeCount);
    }
    private static class Employee {
        private String name;
        private double salary;
        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
            // Increment the employee count
            employeeCount++;
        }
    }
}
