package org.example;

public class Employee {
    String fullName;
    String job;
    int netSalary;
    boolean hasBonus;
    public void listSalary() {
        if (netSalary > 10000) {
            System.out.println(fullName + " earns more than 10000.");
        }
        else {
            System.out.println(fullName + " earns less than 10000.");
        }
    }

    public void listBonus() {
        if (hasBonus)  {
        System.out.println(fullName + " has a bonus.");
        }
        else {
            System.out.println(fullName + " does not have bonus.");
        }
    }

    public void listByJob() {
        System.out.println(fullName + " works as "+ job);
    }

          }
