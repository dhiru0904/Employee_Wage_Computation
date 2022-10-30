package UseCase14;

public interface ComputeEmpWage {

        //Some Variables
        int isPartTimeHour = 4;
        int isFullTimeHour = 8;

        //Some methods
        void addCompanyEmployeeWage(String companyName, int empWagePerHour, int maxWorkingHours, int maxWorkingDays);
        void computeEmpWage();
        int getTotalWage(String company);

    }
