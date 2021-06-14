import java.util.Arrays;

public class Department {
    private String name;
    private Employee[] employees = new Employee[10];
    private int counter = 0;

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee person) throws Exception {
        if (counter < 10) {
            employees[counter] = person;
            counter++;
        } else {
            throw new Exception("Cannot add new employee. Department is full");
        }
    }

    public Employee[] getEmployees() {
        Employee[] nonNullEmployees = new Employee[counter];
        int index = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                nonNullEmployees[index] = employee;
                index++;
            }
        }

        return nonNullEmployees;
    }

    public int getNoOfEmployees() {
        return counter;
    }

    public Employee getEmployeeByID(int ID) {
        for (Employee employee : employees) {
            if (employee.getID() == ID) {
                return employee;
            }
        }
        return null;
    }

    public double getTotalSalaries() {
        double total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total = total + employee.getSalary();
            }
        }
        return total;
    }

    public double getAverageSalary() {
        return getTotalSalaries() / counter;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", counter=" + counter +
                '}';
    }
}
