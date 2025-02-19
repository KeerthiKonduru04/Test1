package org.college;

public class College extends Hostel{
public void collegeName()
{
	System.out.println("The College Name is RMK");
}
public void collegeCode()
{
	System.out.println("The College Code is 123");
}
public void collegeRank()
{
	System.out.println("The College Rank is 1st");
}
public static void main(String[] args) {
	College c=new College();
	c.collegeName();
	c.collegeCode();
	c.collegeRank();
}
}

