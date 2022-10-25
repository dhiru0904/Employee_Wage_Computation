package Employee;

public class SwitchCase {
    public SwitchCase() {
        System.out.println("Welcome to Employee Wage Computation Program...**");
    }

    public static void main(String[] args) {

        // constructor by creating the object of the class.
        SwitchCase  employee = new  SwitchCase ();
        System.out.println();

        //Declaring the variables.
        final int isPartTime = 1;
        final int isFullTime = 2;
        int randomCheck = (int) Math.floor((Math.random() * 10) % 3);
        int empHour;
        int wagePerHour = 20;
        int salary = 0;

        //Checking for part-time and full time by Switch case.
        switch (randomCheck) {
            default :
                System.out.println("Employee is absent");
                empHour=0;
                salary = empHour * wagePerHour;
                System.out.println("Salary is: $"+salary);
                break;
            case isFullTime :
                System.out.println("Employee is working part-time");
                int partTimeHour = 4;
                empHour = partTimeHour;
                salary = empHour * wagePerHour;
                System.out.println("Salary is: $"+salary);
                break;
            case isPartTime :
                System.out.println("Employee is working full-time");
                int fullTimeHour = 8;
                empHour = fullTimeHour;
                salary = empHour * wagePerHour;
                System.out.println("Salary is: $"+salary);
                break;
        }

    }
}
