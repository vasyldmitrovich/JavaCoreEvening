package com.softserve.edu10.MyProjects.PracticalTask;

/*Roman Sitko. Lesson 10? Practical Task
*/
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(0, "Bob Sting");
        employeeMap.put(1, "Bill Still");
        employeeMap.put(2, "Vasyl Zubriv");
        employeeMap.put(3, "Mark Prokopenko");
        employeeMap.put(4, "Max Zayets");
        employeeMap.put(5, "Borys Santa");
        employeeMap.put(6, "Dmytro Shylyak");
        employeeMap.put(7, "Dmytro Shylyak");

        Employee employee = new Employee();
        employee.print(employeeMap);
        employee.findValue(employeeMap);
        employee.findKey(employeeMap);
    }
}
