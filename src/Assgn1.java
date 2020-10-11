import java.util.Scanner;
public class Assgn1 
{
    public static void main(String args[])
    {
    Scanner sn=new Scanner(System.in);
    System.out.println("enter the marks of 5 subjects");
    int m1,m2,m3,m4,m5;
    m1=sn.nextInt();
    m2=sn.nextInt();
    m3=sn.nextInt();
    m4=sn.nextInt();
    m5=sn.nextInt();
    int percentage=((m1+m2+m3+m4+m5)*100)/500;
    if(percentage>=90 && percentage<=100)
        System.out.println("Grade A  Percentage is "+percentage);
    else if(percentage>=80 && percentage<90)
        System.out.println("Grade B Percentage is "+percentage);
    else if(percentage>=70 && percentage<80)
        System.out.println("Grade C Percentage is "+percentage);
    else if(percentage>=60 && percentage<70)
        System.out.println("Grade D Percentage is "+percentage);
    else if(percentage>=50 && percentage<60)
        System.out.println("Grade E Percentage is "+percentage);
    else 
        System.out.println("Fail with Percentage "+percentage);
   
    }
}
