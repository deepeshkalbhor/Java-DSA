public class Employee {
    String name;
    int id;

    public double calculatePay(){
        return 0.0;
    }
}
class SalariedEmployee extends Employee{

    public double calculatedPay(double annualSalary){
        return annualSalary/12;
    }
}

class HourlyEmployee extends Employee{

    public double calculatedPay(double hourlyRate, double hoursWorked){
        return (hourlyRate + hoursWorked);
    }

    public static void main(String[] args) {
    }
}


