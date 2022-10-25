package Employee;

public class PartTimeEmployee {
    public PartTimeEmployee() {
        System.out.println("Welcome to Employee Wage Computation Program..**");
    }

    public static void main(String[] args) {

        //constructor by creating the object of the class.
        PartTimeEmployee employee = new PartTimeEmployee();
        System.out.println();

        //Declaring the variables.
        double isPartTime = 1;
        double isFullTime = 2;
        double randomCheck = (double) Math.floor((Math.random() * 10) % 3);
        int empHour;
        int wagePerHour = 20;
        int salary = 0;

        //Adding part-time Employee and his/her wage.
        if (randomCheck == isFullTime)
        {
            int fullTimeHour = 8;
            empHour = fullTimeHour;
            salary = empHour * wagePerHour;
            System.out.println("Employee is working full time.");
            System.out.println("Salary is: $"+salary);
        }
        else if (randomCheck == isPartTime)
        {
            int partTimeHour = 4;
            empHour = partTimeHour;
            salary = empHour * wagePerHour;
            System.out.println("Employee is working part time.");
            System.out.println("Salary is: $"+salary);
        }
        else
        {
            empHour=0;
            System.out.println("Employee is absent.");
            System.out.println("Salary is: $"+salary);
        }

    }
}

