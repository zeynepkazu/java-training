package org.example;

// Define a subclass named Female
class Female extends Personnel {
    final int retirementAge = 60;
    // Constructor for Female class
    public Female(String departmentName, String personnelName, int birthDate, String teamLeadName) {
        super(departmentName, personnelName, birthDate, teamLeadName);
    }
    // method to calculate retirement age for females
    public void calculateRetirementAge(int birthDate, int retirementAge) {
        this.birthDate = birthDate;
        int timeUntilRetirement = (birthDate) + (retirementAge);
        System.out.println(personnelName + " " + "will retire in:" + " " + timeUntilRetirement);
    }
}
