package stuctural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public static List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<Employee>();

        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "abc@email.com");

        EmployeeLdap employeeFromLdap = new EmployeeLdap("5678", "Han", "Solo", "hss@email.com");

        employees.add(employeeFromDB);

        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeFromCSV = new EmployeeCSV("9012,Luke,Skywalker,lsv@email.com");

        employees.add(new EmployeeAdapterCSV(employeeFromCSV));

        return employees;
    }

    public static void main(String[] args) {
        System.out.println(getEmployeeList());
    }
}
