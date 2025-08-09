package Lab_2;
import java.util.Date;
public class DateTime {

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	     Date dt=new Date();
	     System.out.println("Current date is "+dt);
	     int m=dt.getMonth();
	     int y=dt.getYear();
	     System.out.println("Month is "+m);
	     System.out.println("Year is "+y);
	     Date d1=new Date(2000,11,21);
	     Date d2=new Date();
	     Date d3=new Date(2011,1,3);
	     System.out.println(d1);
	     System.out.println(d2);
	     System.out.println(d3);
	     boolean a=d3.after(d1);
	     System.out.println(a);
	     a=d1.before(d3);
	     System.out.println(a);
	     int c=d1.compareTo(d3);
	     System.out.println(c);
	  }
}
