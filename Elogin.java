import java.util.Scanner;
public class Elogin
    {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your ID");
    String c=sc.nextLine();
    if(c.charAt(0)=='G' &&c.charAt(1)=='B'&&c.charAt(2)=='L')
    {
    System.out.println("Login success");
    }
    else
    {
    System.out.println("Incorrect ID");
    }
    }
    }