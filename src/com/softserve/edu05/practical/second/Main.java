package practical.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {


        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Andrew", 1,20.0);
        employees[1] = new Employee("Anna",2, 40.0);
        employees[2] = new Employee("Ivan", 1, 60.0);
        employees[3] = new Employee("Alla", 1, 120.0);
        employees[4] = new Employee("Inna", 2, 10.0);

        BufferedReader br = new BufferedReader(
                new InputStreamReader(in));

        System.out.print("Enter Department: ");

        //First part: employees of department
        int departmentNumber= Integer.parseInt(br.readLine());
        Employee temp;

        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == departmentNumber)
                System.out.println(employee);
        }

        //Second part: sort
        for ( int i=0; i<employees.length -1; i++){
            for(int j=i+1;j<employees.length;j++){
                if(employees[i].getSalary()<employees[j].getSalary()){
                    temp=employees[i];
                    employees[i]= employees[j];
                    employees[j]=temp;
                }
            }

        }

        System.out.println("Sorted in descending salary order: " +Arrays.toString(employees));
    }

}
