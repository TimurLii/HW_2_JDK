package HW4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDirectory {
    private static List<Employee> list;


    public EmployeeDirectory() {
        list = new ArrayList<>();
    }

    public List<Employee> getEmpByExperience(int experience) {
        List<Employee> newList = new ArrayList<>();
        for (Employee emp : list) {
            if (emp.getExperience() == experience)
                newList.add(emp);

        }
        return newList;

    }

    public List<Employee> getEmpByNumber(String phoneNumber) {
        List<Employee> newList = new ArrayList<>();
        for (Employee emp : list) {
            if (emp.getPhoneNumber().equals(phoneNumber))
                newList.add(emp);

        }

        return newList;

    }

    public List<Employee> getEmpById(int id) {
        List<Employee> newList = new ArrayList<>();
        for (Employee emp : list) {
            if (emp.getId() == id)
                newList.add(emp);

        }
        return newList;

    }

    public void addEmployee(Employee employee) {
        list.add(employee);
    }


    @Override
    public String toString() {
        return "EmployeeDirectory{" +
                "list=" + list +
                '}';
    }
}
