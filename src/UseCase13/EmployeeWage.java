package UseCase13;

import UseCase10.EmpWageBuilder;
public class EmployeeWage {

    // Default Constructor
    public EmployeeWage()
    {
        System.out.println("Welcome to Employee Wage Computation Program....**");
    }

    public static void main(String[] args) {

        //Initializing the constructor by creating the object of the class.
        EmployeeWage employee = new EmployeeWage();

        //Calculating employee wage for different companies.
        System.out.println("Calculate the salary for different company : ............");
        EmpWageBuilder employeeWageBuilder = new EmpWageBuilder();
        employeeWageBuilder.addCompanyEmployeeWage("dMart", 28, 2, 10);
        employeeWageBuilder.addCompanyEmployeeWage("Relience", 10, 4, 20);
        employeeWageBuilder.computeEmpWage();
    }}