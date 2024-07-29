package HW4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"234","Timur", 2);
        Employee employee2 = new Employee(2,"345","Oleg", 25);
        Employee employee3 = new Employee(3,"456","Alex", 4);
        Employee employee4 = new Employee(4,"567","Jon", 12);
        Employee employee5 = new Employee(5,"678","Don", 2);
        Employee employee6 = new Employee(6,"789","Jim", 11);

        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        employeeDirectory.addEmployee(employee1);
        employeeDirectory.addEmployee(employee2);
        employeeDirectory.addEmployee(employee3);
        employeeDirectory.addEmployee(employee4);
        employeeDirectory.addEmployee(employee5);
        employeeDirectory.addEmployee(employee6);

        List<Employee> experience = employeeDirectory.getEmpByExperience(2);
        List<Employee> experience1 = employeeDirectory.getEmpByNumber("567");
        List<Employee> experience2 = employeeDirectory.getEmpById(2);
        System.out.println(experience);
        System.out.println(experience1);
        System.out.println(experience2);
    }
}
