class Vehicle implements Loan,Insurance
	{
	    private String vehicleNumber;
	    public String getVehicleNumber() {
	        return vehicleNumber;
	    }
	    public void setVehicleNumber(String vehicleNumber) {
	        this.vehicleNumber = vehicleNumber;
	    }
	    public String getModelName() {
	        return modelName;
	    }
	    public void setModelName(String modelName) {
	        this.modelName = modelName;
	    }
	    public String getVehicleType() {
	        return vehicleType;
	    }
	    public void setVehicleType(String vehicleType) {
	        this.vehicleType = vehicleType;
	    }
	    public double getPrice() {
	        return price;
	    }
	    public void setPrice(double price) {
	        this.price = price;
	    }
	    private String modelName;
	    private String vehicleType;
	    private double price;
	    
	    public Vehicle(String vehicleNumber,String modelName,String vehicleType,double price)
	{
	this.vehicleNumber=vehicleNumber;
	this.modelName=modelName;
	this.price=price;
	this.vehicleType=vehicleType;
	}
	public double issueLoan()
	{
	if(vehicleType=="4wheeler")
	{
	return((80*price)/100);
	}if(vehicleType=="3wheeler")
	{
	return((75*price)/100);
	}else
	{
	return((50*price)/100);
	}
	}
	public double takeInsurance()
	{
	if(price<=150000)
	return(3500);
	else if(price<=300000)
	return(4000);
	else
	return(5000);
	
	}
	}

	
interface Loan
	{
	    abstract double issueLoan();
	    
	}
	interface Insurance
	{
	    abstract double takeInsurance();
	}
	public class VI {

	
    public static void main(String[] args) {
	        
	        Vehicle v=new Vehicle("kl","xuv","4wheeler",150000);
	        System.out.println("Loan amount="+v.takeInsurance());
	System.out.println("Insurance amount="+v.issueLoan());
	Vehicle v1=new Vehicle("kl","xuv","2wheeler",350000);

	
        System.out.println("Loan amount="+v1.takeInsurance());
	System.out.println("Insurance amount="+v1.issueLoan());

	
    }

	
}