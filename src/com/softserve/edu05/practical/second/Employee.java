package practical.second;

public class Employee {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private String name;
    private int departmentNumber;
    private double salary;

    Employee(String name, int departmentNumber, double salary){
        this.name=name;
        this.departmentNumber=departmentNumber;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee " +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                ";\n";
    }
}
