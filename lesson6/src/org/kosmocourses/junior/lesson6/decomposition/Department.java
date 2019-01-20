package org.kosmocourses.junior.lesson6.decomposition;

// модель взаимодействия - Bean
// инкапсуляция
public class Department {
    private Employee headOfDepartment;
    private String name;
    private Employee[] employees;

    public Department(String name) {
        this.name = name;
    }

    public Employee getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(Employee headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void  printNameOfDepartment(){
        System.out.println(name);
    }
}
