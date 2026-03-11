
    
// Creating Class to calculate salary increment
class SalaryComputation {

    public static void main(String[] args) {

        // Creating variables
        String employeeName = "Hyndavi";
        double salary = 50000;
        double incrementPercent = 10;

        // Calculating increment
        double incrementAmount = salary * incrementPercent / 100;
        double newSalary = salary + incrementAmount;

        // Displaying salary details
        System.out.println("Salary Details:\nEmployee Name: " + employeeName +
                "\nOld Salary: " + salary +
                "\nIncrement Amount: " + incrementAmount +
                "\nNew Salary: " + newSalary);
    }
}