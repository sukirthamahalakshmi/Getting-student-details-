package Demo;

import java.util.Scanner;

class Student{
	private int roll;
	private  String name;
	private  String clg;
	void setRoll(int roll)
	{
		this.roll=roll;
	}
	void setName(String name) {
		this.name=name;
	}
	void setClg(String clg)
	{
		this.clg=clg;
	}
	int getRoll()
	{
		return roll;
	}
	String getName()
	{
		return name;
	}
	String getClg()
	{
		return clg;
	}
	void setData(int r, String n, String c)
	{ 
		roll=r;
		 name=n;
		 clg=c;
		}
	String disp()
	{
		return roll+" "+name+" "+clg;
	}
	
	}
public class Cls {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Student st[]= new Student[3];
		for(int i=0;i<st.length;i++)
		{
			System.out.println("enter the roll");
			int roll=s.nextInt();
			s.nextLine();
			System.out.println("enter the name");
			String name=s.nextLine();
			System.out.println("enter the clg name");
			String clg=s.nextLine();
			Student s1= new Student();
			s1.setData(roll, name, clg);
			st[i]=s1;
		}
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i].disp());
		}
		
		 
		  
		 
	}

}
