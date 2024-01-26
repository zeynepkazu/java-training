package org.example;
import java.util.ArrayList;

// Define a class named Department (superclass)
class Department {
    String departmentName;
    String teamLeadName;
    TaskList taskList;
    PersonnelList personnelList;
    String personnelName;
    int birthDate;

    // Constructor for Department class. Department Name and Team Lead is obligatory to construct a Department.
    public Department(String departmentName, String teamLeadName) {
        if (teamLeadName != null && !teamLeadName.isEmpty()) {
            this.departmentName = departmentName;
            this.teamLeadName = teamLeadName;
            this.taskList = new TaskList();
            this.personnelList = new PersonnelList();
        } else {
            throw new IllegalArgumentException("Team lead name cannot be empty.");
        }
    }

    // Method to modify the team lead
    public void setTeamLeadName (String newTeamLeadName) {
        System.out.println("Please update the team Lead of" + " " + departmentName + " " + "to: " + newTeamLeadName);
    }

    // Method to modify personnel name
    public void modifyPersonnel(String newPersonnelName, String personnelName) {
        this.personnelName = newPersonnelName;
        System.out.println("Name of" + " " + personnelName + " " + "is modified as" + " " + newPersonnelName);
    }

    // Declaring a PersonnelList class to add, remove and display personnel of a department
    public class PersonnelList {
        ArrayList<String> personnels;
        // Constructor for PersonnelList class
        public PersonnelList() {
            this.personnels = new ArrayList<>();
        }

        // Method to add a new personnel
        public void addPersonnel(String personnelName) {
            personnels.add(personnelName);
            System.out.println(personnelName + " " + "is added to" + " " + departmentName);
        }
        // Method to remove a personnel from the department
        public void removePersonnel(String personnelName) {
            personnels.remove(personnelName);
            System.out.println(personnelName + " " + "is removed from" + " " + departmentName );
        }

        // Method to display personnel list of a department
        public void displayPersonnel () {
            {
                System.out.println("Employees of the"+ " " + departmentName + " " + "are:" + " " + personnels);
            }

        }
    }
    // Declaring a TaskList class to add, remove, mark completed and display tasks of a personnel
    public class TaskList {
        ArrayList<String> tasks;

        // Constructor for TaskList class
        public TaskList() {
            this.tasks = new ArrayList<>();
        }

        // Method to add a task to the task list
        public void addTask(String task) {
            tasks.add(task);
        }

        // Method to mark a task as completed
        public void markTaskCompleted(String task) {
          System.out.println(task + " " + "task of" + " " + personnelName + " " + "is completed");
        }

        // Method to remove a task to the task list
        public void removeTask(String task) {
            tasks.remove(task);
            System.out.println(task + " " + "task of" + " " + personnelName + " " + "is removed.");
        }

        // Method to display tasks in the task list
        public void displayTasks() {
            System.out.println("Incomplete tasks of" + " " + personnelName);
            for (String task : tasks) {
                System.out.println("- " + task);
            }
        }
    }

    //Some additional methods
    public void displayDepartment() {
        System.out.println("Department of" + " " + personnelName + " " + "is" + " " + departmentName );
    }

    public void displayTeamLead() {
        System.out.println("Team Lead of" + " " + departmentName + " " + "is" + " " + teamLeadName );
    }

}
