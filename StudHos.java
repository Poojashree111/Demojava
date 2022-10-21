import java.util.*;
class Student1{
    protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}

 

class Hosteller extends Student1{
    private String hostelName;
    private int roomNumber;
    public String getHostelName() {
        return hostelName;
    }
    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
}

 

public class StudHos {
    
    
    public static Hosteller getHostellerDetails() {
        System.out.println("Enter the Details");
        System.out.println("Student Id");
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("Studet Name");
        String name=sc.next();
        System.out.println("Department Id");
        int dn=sc.nextInt();
        System.out.println("Gender");
        String g=sc.next();
        System.out.println("Phone Number");
        String p=sc.next();
        Hosteller h= new Hosteller();
        h.setStudentId(n);
        h.setName(name);
        h.setDepartmentId(dn);
        h.setGender(g);
        h.setPhone(p);
        
        
        System.out.println("Hostel Name");
        String hn=sc.next();
        System.out.println("Room Number");
        int rn = sc.nextInt();
        h.setHostelName(hn);
        h.setRoomNumber(rn);
        
        
        return h;
        }

 

    public static void main(String[] args) {
        
        
        Hosteller hm= StudHos.getHostellerDetails();
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Modify Room number (y/n)");
        String m=sc.next();
        if(m.equals("y"))
        {
            System.out.println("New Room Number");
            int nr=sc.nextInt();
            hm.setRoomNumber(nr);
        }
        
        System.out.println("Modify phone number (y/n)");
        String m2=sc.next();
        if(m2.equals("y"))
        {
            System.out.println("New Phone Number");
            String pn=sc.next();
            hm.setPhone(pn);
        }
        
        
        System.out.println("The Student Details");
        System.out.println(hm.getStudentId()+" "+hm.getName()+" "+hm.getDepartmentId()+" "+hm.getGender()+" "+hm.getPhone()+" "+hm.getHostelName()+" "+hm.getRoomNumber());
        
        

 

    }

 

}