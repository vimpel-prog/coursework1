public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee(Calculations.getRandomName(), Calculations.getRandomDepartment(), Calculations.getRandomSalary());
        }
        Employee.getAllEmployee(employees);
        System.out.println(Employee.getSum(employees));
        System.out.println("Minimal salary have " + Employee.minSalary(employees));
        System.out.println("Maximum salary have " + Employee.maxSalary(employees));
        System.out.println("Average salary is " + Employee.averageSalary(employees));
        Employee.getAllNames(employees);

    }
}
