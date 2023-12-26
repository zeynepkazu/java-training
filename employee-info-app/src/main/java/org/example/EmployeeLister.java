package org.example;

public class EmployeeLister {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();

        employee1.fullName = "John Doe";
        employee1.job = "Engineer";
        employee1.netSalary = 8000;
        employee1.hasBonus = false;

        employee2.fullName = "Jane Doe";
        employee2.job = "Sales Representative";
        employee2.netSalary = 20000;
        employee2.hasBonus = true;

        employee3.fullName = "Scooby Doo";
        employee3.job = "Manager";
        employee3.netSalary = 50000;
        employee3.hasBonus = false;

        employee4.fullName = "Wilma Flintstone";
        employee4.job = "Social Media Specialist";
        employee4.netSalary = 9000;
        employee4.hasBonus = true;

        employee1.listSalary();
        employee2.listSalary();
        employee3.listSalary();
        employee4.listSalary();

        employee1.listBonus();
        employee2.listBonus();
        employee3.listBonus();
        employee4.listBonus();

        employee1.listByJob();
        employee2.listByJob();
        employee3.listByJob();
        employee4.listByJob();

        }
    }


