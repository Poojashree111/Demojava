import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.text.DecimalFormat;
import java.util.Scanner;

 

 class EmployeeUtility {

 

    public Emp[] getEmployeeDetails(String[] details) {

 

        //Fill your code here
       
       Emp ob[] =new Emp[details.length];
       
       for(int i=0;i<details.length;i++){
           
           String x[] =details[i].split(";");
           
           Emp o=new Emp();
           o.setEmpId(x[0]);
           o.setEmpName(x[1]);
           o.setSalary(Double.parseDouble(x[2]));
           
           ob[i]=o;
           
       }
       
       return ob;
       
    }

 

    public Stream<Emp> getStreamOfEmp(Emp[] empDetails) {

 

        //Fill your code here
        Stream<Emp> s=Arrays.stream(empDetails);
        return s;
         
    }

 

    public String[] shortlistedEmp(Stream<Emp> empStream,double minSalary) {

 

        //Fill your code here
        
        ArrayList<String> name=new ArrayList<>();
        
        empStream.forEach(a->{
            
           if(a.getSalary()>=minSalary){
               
               DecimalFormat df=new DecimalFormat("#.0");
               String sal=df.format(a.getSalary());
               
               name.add(a.getEmpId()+" "+a.getEmpName()+" "+sal);
           } 
            
            
            
        });

 

            
            String x[]=new String[name.size()];
            for(int i=0;i<x.length;i++){
                x[i]=name.get(i);
            }
            Arrays.sort(x);
            return x;

 

 

    }

 

}
class Emp {
    private String empId;
    private String empName;
    private double salary;

 

    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

 

public class ELE {

 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        EmployeeUtility utilObj=new EmployeeUtility();
        System.out.println("Enter the number of Employees");
        int n=sc.nextInt();
        sc.nextLine();
        if(n>0) {
            System.out.println("Enter the details of Employees");
            String [] details=new String[n];
            for(int i=0;i<n;i++) {
                details[i]=sc.nextLine();
            }
            System.out.println("Enter the minimum eligible salary");
            double minSalary=sc.nextDouble();

 

            String[] result=utilObj.shortlistedEmp(utilObj.getStreamOfEmp(utilObj.getEmployeeDetails(details)),minSalary);
            if(result.length>0)    {
                System.out.println("Shortlisted Employees are");
                for(String s:result) {
                    System.out.println(s);
                }
            }
            else {
                System.out.println("No Employee is having the required salary");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}