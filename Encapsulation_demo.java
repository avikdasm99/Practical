package practical;
import java.util.Scanner;


class encap_d {
private String Student_name;
private int Studentuser_id;
private int password;
int total,percentage;

public  String get_name()                    // getter methods
{
return Student_name;
}
public int get_stu_id()                         // getter methods
{
return Studentuser_id;
}
public int get_pass()                             // getter methods
{
return password;
}
public void set_name(String stu)             // setter methods
{
Student_name = stu;
}
public void set_stu_id(int stu)               // setter methods
{
Studentuser_id = stu;
}
public void set_pass(int stu)                   // setter methods
{
password = stu;
}
public void calc (int sub1,int sub2,int sub3,int sub4,int sub5) {
	total=sub1+sub2+sub3+sub4+sub5;
	percentage=total/5;
	if (percentage>=35 && percentage<=45) {
		System.out.println("D grade");
	}
	else if (percentage>=45 && percentage<=55) {
		System.out.println("C grade");
	}else if (percentage>=60 && percentage<=75) {
		System.out.println("B grade");
	}else if (percentage>=75 && percentage<=85) {
		System.out.println("A grade");
	}else if(percentage>=85 && percentage<=100) {
		System.out.println("O grade");
	}
	else {
		System.out.println(" Fail/absent");
	}
}}

public class Encapsulation_demo {
public static void main(String[] args) 
{
Scanner s = new Scanner(System.in);
String stuname;
int stupass,sid;
int sub1,sub2,sub3,sub4,sub5;
		
System.out.println("Enter your Name :");
stuname = s.nextLine();
System.out.println("Enter your User_ID :");
sid= s.nextInt();
System.out.println("Enter your Password :");
stupass= s.nextInt();

System.out.println("Enter marks of 5 subjects :");
System.out.println("Enter marks of sub1 :");
sub1 = s.nextInt();
System.out.println("Enter marks of sub2 :");
sub2 = s.nextInt();
System.out.println("Enter marks of sub3 :");
sub3 = s.nextInt();
System.out.println("Enter marks of sub4 :");
sub4 = s.nextInt();
System.out.println("Enter marks of sub5 :");
sub5 = s.nextInt();
		
encap_d obj=new encap_d();
		
obj.set_name(stuname);
obj.set_pass(stupass);
obj.set_stu_id(sid);
		
System.out.println(" Name :"+obj.get_name());
System.out.println(" User ID :"+obj.get_stu_id());
System.out.println(" Password :"+obj.get_pass());
obj.calc(sub1, sub2, sub3, sub4, sub5);
System.out.println(" Percentage :"+obj.percentage);		
}
}
