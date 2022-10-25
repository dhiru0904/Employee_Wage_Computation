package Employee;

public class MultipleCompany {
    private final static int isPartTime = 1;
    private final static int isFullTime = 2;

    // Default Constructor
    public  MultipleCompany() {

        System.out.println("Welcome to Employee Wage Computation Program...**");
    }

    public static void main(String[] args) {

        // constructor by creating the object of the class.
        MultipleCompany employee = new  MultipleCompany();

        //Calculating employee wage for different companies.
        System.out.println("Calculating the salary for different companies : ............");
        printData(calculateSalary("Google",40,20,80));
        printData(calculateSalary("Oppo",20,18,130));
        printData(calculateSalary("microsoft",60,22,150));
        printData(calculateSalary("Samsung",30,26,180));
    }

    public static int[] calculateSalary(String s, int wagePerHour, int numWorkingDays, int maxHours) {

        //Declaring the variables
        int randomCheck;
        int empHour = 0;
        int salary = 0;
        int monthlySalary = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        System.out.println();
        System.out.println("For Company : " + s + "..........");
        System.out.println();
        while (totalWorkingDays < numWorkingDays && totalWorkingHours < maxHours) {
            totalWorkingDays++;
            randomCheck = (int) Math.floor((Math.random() * 10) % 3);
            if (randomCheck == 0) {
                System.out.println("Employee is absent");
                empHour = 0;
                salary = empHour * wagePerHour;
            } else if (randomCheck == isPartTime) {

                System.out.println("Employee is working part-time");
                int partTimeHour = 4;
                empHour = partTimeHour;
                salary = empHour * wagePerHour;
            } else if (randomCheck == isFullTime) {
                System.out.println("Employee is working full-time");
                int fullTimeHour = 8;
                empHour = fullTimeHour;
                salary = empHour * wagePerHour;
            }
            monthlySalary += salary;
            totalWorkingHours += empHour;
        }
        int[] employeeData = {monthlySalary, totalWorkingDays, totalWorkingHours};
        return employeeData;
    }

    //Printing the data
    public static void printData(int[] calculateSalary) {
        int monthlySalary = calculateSalary[0];
        int totalWorkingDays = calculateSalary[1];
        int totalWorkingHours = calculateSalary[2];
        System.out.println();
        System.out.println("Total working days of an Employee is : "+totalWorkingDays+"\n");
        System.out.println("Total working hour of an Employee is : "+totalWorkingHours+"\n");
        System.out.println("Salary of an Employee in a month is : $"+monthlySalary);
        System.out.println();
    }

}
