package Employee;

public class ReachForMonth {
    public ReachForMonth () {
        System.out.println("Welcome to Employee Wage Computation Program...**");
    }

    public static void main(String[] args) {

        // constructor by creating the object of the class.
        ReachForMonth  employee = new ReachForMonth ();
        System.out.println();

        //Declaring the variables.
        final int isPartTime = 1;
        final int isFullTime = 2;
        int randomCheck;
        int empHour;
        int wagePerHour = 20;
        int salary = 0;
        int numWorkingDays = 20;
        int monthlySalary = 0;
        int maxHours = 100;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        while (totalWorkingDays < numWorkingDays && totalWorkingHours < maxHours)
        {
            totalWorkingDays++;
            randomCheck = (int) Math.floor((Math.random() * 10) % 3);
            switch (randomCheck) {
                default :
                    System.out.println("Employee is absent");
                    empHour=0;
                    salary = empHour * wagePerHour;
                    break;
                case isPartTime :
                    System.out.println("Employee is working part-time");
                    int partTimeHour = 4;
                    empHour = partTimeHour;
                    salary = empHour * wagePerHour;
                    break;
                case isFullTime :
                    System.out.println("Employee is working full-time");
                    int fullTimeHour = 8;
                    empHour = fullTimeHour;
                    salary = empHour * wagePerHour;
                    break;
            }
            monthlySalary += salary;
            totalWorkingHours += empHour;
        }
        System.out.println();
        System.out.println("Total working days of an Employee is : "+totalWorkingDays+"\n");
        System.out.println("Total working hour of an Employee is : "+totalWorkingHours+"\n");
        System.out.println("Salary of an Employee in a month is : $"+monthlySalary);

    }

}
