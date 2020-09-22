package Emp_info;

public class Emp_AttendanceUC1
{ 
	
	public static void main(String[] args)
	{
	    int full_time=1;
	    double number=Math.floor(Math.random()*10)%2;
	    if(full_time==number)
	    	System.out.println("Emp present");
	    else
	    	System.out.println("Emp absent");
		
	}

}
