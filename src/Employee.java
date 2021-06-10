public class Employee {
    private String ID;
    private String name;
    private double salary;

    public Employee(String ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
