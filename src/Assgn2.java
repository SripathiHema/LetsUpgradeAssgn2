import java.util.*;
public class Assgn2 {
  public static void main(String args[])
  {
  Scanner sn=new Scanner(System.in);
  System.out.println("Enter Employee Name, Date of Birth, Month of Birth(string value), Birth Year and  Monthly Salary");
  String en=sn.nextLine();
  int db=sn.nextInt();
  String mb=sn.next();
  int yb=sn.nextInt();
  double ms=sn.nextDouble();
  double as=ms*12;
  int age=2020-yb;
  double tax;
  if(as>=500000)
      tax=as*20/100;
  else if(as>=400000 && as<500000)
      tax=as*15/100;
  else if(as>=300000 && as<400000)
      tax=as*10/100;
  else if(as>=200000 && as<300000)
      tax=as*5/100;
  else
      tax=0;
  System.out.println("Employee Name is "+en+"\nEmployee Age is "+age+"\nAnnual Salary Of Employee is "+as+"\nTax Amount is "+tax);
  
  }
}
