public class Employee {

    private String name;
    private double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }
}

//public class Main {
//
//    public static void main(String[] args) {
//        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
//                "John Doe", 100000, 0.1, 1000000);
//
//        double salary = employee.calculateSalary();
//
//        System.out.println("Salary: " + salary);
//    }
//}
