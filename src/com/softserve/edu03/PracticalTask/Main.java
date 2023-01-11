package softserve.edu03.PracticalTask;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee("George",7.5, 35);
        Employee emp2 = new Employee("Mike",6.0, 40);
        Employee emp3 = new Employee("Emilly",8.0, 37);

        double salary = emp1.getSalary()+emp2.getSalary()+emp2.getSalary();
        double salaryWithBonuses= emp1.getBonuses()+emp3.getBonuses()+emp3.getBonuses();

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp1.getSalary());
        System.out.println("Total salary for 3 employees is "+salary);
        System.out.println("Total salary for 3 employees with bonuses is "+salaryWithBonuses);
    }

}
