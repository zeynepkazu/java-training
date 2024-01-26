package org.example;

// Define a subclass named Male
class Male extends Personnel {
    final int retirementAge = 65;
    // Constructor for Male class
    public Male(String departmentName, String personnelName, int birthDate, String teamLeadName) {
        super(departmentName, personnelName, birthDate, teamLeadName);
    }
    // method to calculate retirement age for males
    public void calculateRetirementAge(int birthDate, int retirementAge) {
        this.birthDate = birthDate;
        int timeUntilRetirement = (birthDate) + (retirementAge);
        System.out.println(personnelName + " " + "will retire in:" + " " + timeUntilRetirement);
    }
}
