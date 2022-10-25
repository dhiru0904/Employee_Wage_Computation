package employeewage;

public class PresentOrAbsent {
    public PresentOrAbsent() {
        System.out.println("Welcome to Employee Wage Program...**");
    }

    public static void main(String[] args) {

        //Initializing the constructor by creating the object of the class.
        PresentOrAbsent employee = new PresentOrAbsent();
        System.out.println();

        //Declaring the variables.
        double isPresent = 1;
        double randomCheck = (double)Math.floor((Math.random()*10)%2);

        //Checking if the Employee is present!!!
        if (randomCheck == isPresent)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is absent");
        }

    }
}
