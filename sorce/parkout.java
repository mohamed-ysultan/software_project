import java.util.Calendar;
public class parkout  {
	public double parkout_fun(Garage_info[] arr, int size, int id,double start_time)
	 {
		double fees;
		 for(int i=0;i<size;i++)
		 {
			 if(arr[i].getID()==id)
			 {
				 set_interval_time obj_time=new set_interval_time();
				  
					
				 arr[i].setname("s");
				 arr[i].setpostion(true);
				// fees=Math.ceil((obj_time.getend_timer()-start_time)/60)*5;
				 //System.out.println(fees);
				 Calendar now = Calendar.getInstance();
				 fees=now.get(Calendar.MINUTE);
				 return (fees-start_time)*5;
			 }
		 }
		return 0;
	 }
}
