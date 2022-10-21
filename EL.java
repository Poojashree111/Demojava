abstract class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double salary;
    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public abstract void calculateSalary();
}

 

class Loan {
    public double calculateLoanAmount(Employee employee) {
        double loan = 0.0;
        if (employee instanceof PermanentEmployee) {
            loan = employee.getSalary() * 15.0 / 100.0;
        } else if (employee instanceof TemporaryEmployee) {
            loan = employee.getSalary() * 10.0 / 100.0;
        }
        return loan;
    }
}
public class EL  {
public static void main(String[] args)
 { PermanentEmployee permanentemployee = new PermanentEmployee(102,"Pooja",23600.0);
        TemporaryEmployee temporaryemployee = new TemporaryEmployee(202,"shree",6,1000);
        
        permanentemployee.calculateSalary();
        temporaryemployee.calculateSalary();
        
        
        Loan loan=new Loan();
        
        double permanentEmployeeLoan = loan.calculateLoanAmount(permanentemployee);
        double temporaryEmployeeLoan = loan.calculateLoanAmount(temporaryemployee);
        
        System.out.println("Permanent Employee Salary:"+permanentemployee.getSalary());
        System.out.println("permanent employee loan:"+permanentEmployeeLoan);
        
        System.out.println();
        
        System.out.println("temporary Employee Salary:"+temporaryemployee.getSalary());
        System.out.println("temporary employee loan:"+temporaryEmployeeLoan);
}}
 class PermanentEmployee extends Employee {
    private double basicPay;
    public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
    }
    public double getBasicPay() {
        return basicPay;
    }
    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }
    @Override
    public void calculateSalary() {
        double pfAmount = basicPay * 0.12;
        double salary = basicPay - pfAmount;
        setSalary(salary);
    }
}
class TemporaryEmployee extends Employee {
    private int hoursWorked;
    private int hourlyWages;
    public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public int getHourlyWages() {
        return hourlyWages;
    }
    public void setHourlyWages(int hourlyWages) {
        this.hourlyWages = hourlyWages;
    }
    @Override
    public void calculateSalary() {
        double salary = hoursWorked * hourlyWages;
        setSalary(salary);
    }
}