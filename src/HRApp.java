public class HRApp {
    public static void main(String[] args) {
        System.out.println("System Online");

        Department departmentQA = new Department("QA");
        System.out.println("QA Info: " + departmentQA.toString());

        Employee employee1 = new Employee(12, "Margaret", 98.99);
        Employee employee2 = new Employee(13, "Daniel", 100.11);
        Employee employee3 = new Employee(14, "John", 78.11);

        try {
            departmentQA.addEmployee(employee1);
            departmentQA.addEmployee(employee2);
            departmentQA.addEmployee(employee3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Employee employeeByID = departmentQA.getEmployeeByID(12);
        System.out.println("Employee Info: " + employeeByID.toString());


        for (Employee employeeFromDept : departmentQA.getEmployees()) {
            System.out.println("Employee Info: " + employeeFromDept.toString());
        }

        System.out.println("Salaries Total: " + departmentQA.getTotalSalaries());

        System.out.println("Average Salary: " + departmentQA.getAverageSalary());

    }
}
