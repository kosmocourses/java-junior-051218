package org.kosmocourses.junior.lesson6.decomposition;

import java.util.zip.DeflaterInputStream;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Vasja");
        Engineer engineer1 = new Engineer("Kolja");
//        String string = new String("Я тоже хочу быть сотрудником");

        Department department1 = new Department("NanoTech");
        Employee[] employeesOfDepartment1 = {director, engineer1};

        department1.setEmployees(employeesOfDepartment1);
        department1.setHeadOfDepartment(director);

        for (Employee employee : employeesOfDepartment1){
            System.out.println(employee.getName());
        }

    }
}
