package org.example;
import java.util.ArrayList;

// Define a subclass named TeamLead
class TeamLead extends Department {

    // Constructor for TeamLead class
    public TeamLead(String departmentName, String teamLeadName, String personnelName, int birthDate) {
        super(departmentName, teamLeadName);
        this.teamLeadName = teamLeadName;
        this.personnelName = personnelName;
        this.birthDate = birthDate;
    }
}

