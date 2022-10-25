package Employee;

public class DailyEmployeeWage {
    public DailyEmployeeWage() {
        System.out.println("Welcome to Employee Wage Computation Program...**");
    }

    public static void main(String[] args) {

        //Initializing the constructor by creating the object of the class.
        DailyEmployeeWage employee = new DailyEmployeeWage();
        System.out.println();

        //Declaring the variables.
        double isPresent = 1;
        double randomCheck = (double) Math.floor((Math.random() * 10) % 2);
        int fullDayHour = 8;
        int wagePerHour = 20;
        int salary = 0;

        //Checking if the Employee is present, then calculating his/her daily wage.
        if(randomCheck == isPresent)
        {
            System.out.println("Employee is present");
            salary = fullDayHour * wagePerHour;
            System.out.println("Salary is: $"+salary);
        }
        else
        {
            System.out.println("Employee is absent");
            System.out.println("Salary is: $"+salary);
        }

    }
}
