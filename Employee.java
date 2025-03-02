/*
 * This is the definition of the Employee object
 */

 public class Employee {
    private int employeeId;
    private String pps;
    private String surname;
    private String firstName;
    private Gender gender; // Changed from char to Enum  
    private double salary;
    private Department department; // Changed from string to Enum 
    private boolean fullTime;

    public enum Gender {
     M,F
    }

    public enum Department {
        ADMINISTRATION, PRODUCTION, TRANSPORT, MANAGEMENT;
    }

    // Create Employee with no details
    public Employee() {
      this(0,"","","",Gender.F,Department.MANAGEMENT,0,false);
    }

    // Create Employee with details (Allow user to enter "M" or "F")
    public Employee(int employeeId, String pps, String surname, String firstName, Gender gender, Department department, double salary, boolean fullTime) {
        this.employeeId = employeeId;
        this.pps = pps;
        this.surname = surname;
        this.firstName = firstName;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.fullTime = fullTime;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getPps() {
        return pps;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public Gender getGender() {
        return this.gender;
    }

    public Department getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public boolean getFullTime() {
        return this.fullTime;
    }

    // Setter methods
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setPps(String pps) {
        this.pps = pps;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    // Display Employee details
    public String toString() {
        String bool = fullTime ? "Yes" : "No";

        return "Employee ID: " + this.employeeId +
                "\nPPS Number: " + this.pps +
                "\nSurname: " + this.surname +
                "\nFirst Name: " + this.firstName +
                "\nGender: " + this.gender +  
                "\nDepartment: " + this.department +
                "\nSalary: " + this.salary +
                "\nFull Time: " + bool;
    }
}
