import java.util.Objects;

public class Employee {
    private String name;
    private int department;
    private int salary;
    private int id = 0;

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        id++;
    }

    @Override
    public String toString() {
        return "Employee: " + name + "||| Department: " + department + "||| Salary: " + salary;
    }

    public static void getAllEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(i + 1 + ")" + employees[i]);
        }
    }

    public static int getSum(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee == null)
                continue;
            sum += employee.salary;
        }
        return sum;
    }

    public static Employee minSalary(Employee[] employee) {
        int idMin = 0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[i] == null)
                continue;
            if (employee[i].salary < employee[idMin].salary) {
                idMin = i;
            }
        }
        return employee[idMin];
    }

    public static Employee maxSalary(Employee[] employee) {
        int idMax = 0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[i] == null)
                continue;
            if (employee[i].salary > employee[idMax].salary) {
                idMax = i;
            }
        }
        return employee[idMax];
    }

    public static int averageSalary(Employee[] employees) {
        return Employee.getSum(employees) / employees.length;
    }

    public static void getAllNames(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee == null)
                continue;
            System.out.println(employee.name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary);
    }
}
