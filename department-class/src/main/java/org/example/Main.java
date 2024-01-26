package org.example;

// Main class to demonstrate Department, TeamLead, Female, and Male classes
public class Main {
    public static void main(String[] args) {
        // Create objects of TeamLead, Female, and Male classes
        TeamLead itTeamLead = new TeamLead("IT Department","Polly Frack", "Polly Frack", 1979);
        Department informationTech = new Department(itTeamLead.departmentName, itTeamLead.teamLeadName);
        Personnel newItTeamLead = new Personnel (itTeamLead.departmentName, "Janice Bloomberg", 1981, itTeamLead.teamLeadName );

        TeamLead financeTeamLead = new TeamLead("Finance Department", "Margaret Wellington", "Margaret Wellington", 1982);
        Department finance = new Department(financeTeamLead.departmentName, financeTeamLead.teamLeadName);
        Male maleEmployee = new Male(financeTeamLead.departmentName, "John Gregor", 1995, finance.teamLeadName);
        Personnel newPersonnel = new Personnel (financeTeamLead.departmentName, "Judy Garland", 2000, finance.teamLeadName);

        TeamLead hrTeamLead = new TeamLead("HR Department","Martin Pillar", "Martin Pillar", 1969);
        Department humanResources = new Department(hrTeamLead.departmentName, hrTeamLead.teamLeadName);
        Female femaleEmployee = new Female(hrTeamLead.departmentName, "Jane Smith", 1980, hrTeamLead.teamLeadName);



        //Add employees to the department
        finance.personnelList.addPersonnel(financeTeamLead.personnelName);
        finance.personnelList.addPersonnel(newPersonnel.personnelName);
        finance.personnelList.addPersonnel(maleEmployee.personnelName);

        humanResources.personnelList.addPersonnel(hrTeamLead.personnelName);
        humanResources.personnelList.addPersonnel(femaleEmployee.personnelName);

        //Remove employees from the department
        finance.personnelList.removePersonnel(newPersonnel.personnelName);

        //Show the department employees
        finance.personnelList.displayPersonnel();
        humanResources.personnelList.displayPersonnel();

        // Add and remove tasks, mark tasks as completed and display tasks
        itTeamLead.taskList.addTask("Develop new feature");
        itTeamLead.taskList.addTask("Fix bugs");
        itTeamLead.taskList.addTask("New version release");
        itTeamLead.taskList.markTaskCompleted("Start new sprint");
        itTeamLead.taskList.removeTask("New version release");
        itTeamLead.taskList.displayTasks();

        femaleEmployee.modifyPersonnel("Jane Smith Martinez", "Jane Smith");
        femaleEmployee.calculateRetirementAge(femaleEmployee.birthDate, femaleEmployee.retirementAge);

        maleEmployee.taskList.addTask("Financial analysis");
        maleEmployee.taskList.addTask("Budget planning");
        maleEmployee.calculateRetirementAge(maleEmployee.birthDate, maleEmployee.retirementAge);



        // Display and modify the team lead for the IT Department
        informationTech.displayTeamLead();
        itTeamLead.setTeamLeadName(newItTeamLead.personnelName);

        //Display department
        newItTeamLead.displayDepartment();

    }
}