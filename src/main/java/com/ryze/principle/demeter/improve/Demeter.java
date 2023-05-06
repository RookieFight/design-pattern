package com.ryze.principle.demeter.improve;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则  最少知道原则
 */
public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

@Setter
@Getter
class Employee {
    private String id;
}

@Setter
@Getter
class CollegeEmployee {
    private String id;
}

class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工ID："+i);
            list.add(collegeEmployee);
        }
        return list;
    }

    public void printCollegeEmployee() {
        List<CollegeEmployee> allEmployee = getAllEmployee();
        System.out.println("----------学院员工------------");
        for (CollegeEmployee collegeEmployee : allEmployee) {
            System.out.println(collegeEmployee.getId());
        }
    }
}

class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            Employee employee = new Employee();
            employee.setId("学院总部员工ID："+i);
            list.add(employee);
        }
        return list;
    }

    void printAllEmployee(CollegeManager sub) {
        //CollegeEmployee不是SchoolManager的成员变量、方法参数、方法返回，不是SchoolManager的直接朋友，违反了迪米特法则

        //将获取CollegeEmployee的方法封装到CollegeManager中
        sub.printCollegeEmployee();
        /*List<CollegeEmployee> allEmployee = sub.getAllEmployee();
        System.out.println("----------学院员工------------");
        for (CollegeEmployee collegeEmployee : allEmployee) {
            System.out.println(collegeEmployee.getId());
        }*/
        List<Employee> employee = getAllEmployee();
        System.out.println("-------------学校总部员工----------------");
        for (Employee e : employee) {
            System.out.println(e.getId());
        }
    }
}