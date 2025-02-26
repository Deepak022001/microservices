public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Deepak", 70000);
        
        SalaryService salaryService = new SalaryService();
        double bonus = salaryService.calculateBonus(emp);
        System.out.println("Bonus: " + bonus);

        EmployeePersistence persistence = new EmployeePersistence();
        persistence.saveToDatabase(emp);

        EmployeePrinter printer = new EmployeePrinter();
        printer.printEmployeeDetails(emp);
    }
}
