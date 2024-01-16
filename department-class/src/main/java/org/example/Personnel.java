package org.example;

import java.util.ArrayList;

// Define a subclass named Personnel
class Personnel extends Department {

    // Constructor for Personnel class
    public Personnel(String departmentName, String personnelName, int birthDate, String teamLeadName) {
        super(departmentName, teamLeadName);
        this.personnelName = personnelName;
        this.birthDate = birthDate;
        this.departmentName= departmentName;
        this.teamLeadName= teamLeadName;
    }

}

