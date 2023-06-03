import java.util.Calendar;
import java.lang.Math;

public class set_interval_time {
	private double start_time_H;
	private double start_time_M;
	private double end_time_H;
	private double end_time_M;
	

	
	
	
	
	public double getstart_timer()
	{
		double time;
		Calendar now = Calendar.getInstance();
		start_time_H=now.get(Calendar.HOUR_OF_DAY);
		start_time_M=now.get(Calendar.MINUTE);
		time=(start_time_M);
		
		return time;
	}
	public double getend_timer()
	{
		double time;
		Calendar now = Calendar.getInstance();
		 end_time_H=now.get(Calendar.HOUR_OF_DAY);
		 end_time_M=now.get(Calendar.MINUTE);
		time=start_time_H*60+(start_time_M);
		
	
		return time;
	}
	
}
