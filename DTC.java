
import java.util.*;


class Associate{
	private int associsateId ;
	private String associateName;
	private String workStatus;
	public int getAssocisateId() {
		return associsateId;
	}
	public void setAssocisateId(int associsateId) {
		this.associsateId = associsateId;
	}
	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public String getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	
	public void trackAssociateStatus(int days)
	{
		if (days <= 20) {
            setWorkStatus("Core skills");
        } else if (days>20 && days <= 40) {
            setWorkStatus("Advanced modules");
        } else if (days>40 && days <= 60) {
            setWorkStatus("Project phase");
        } else {
            setWorkStatus("Deployed in Project");
        }
	}
	public Associate(int associsateId, String associateName) {
		super();
		this.associsateId = associsateId;
		this.associateName = associateName;
		
	}
	
}

public class DTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the associate id:");
		int id=sc.nextInt();
		System.out.println("Enter the associate name:");
		String name=sc.next();
		System.out.println("Enter the number of days:");
		int days=sc.nextInt();
		
		
		Associate a= new Associate(id,name);
		a.trackAssociateStatus(days);
		System.out.println("The  associate "+a.getAssociateName()+" work status: "+a.getWorkStatus());

	}

}
