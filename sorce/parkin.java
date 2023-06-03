
public class parkin  {
	
	

	public double parkin_fun(Garage_info[] arr, vechile_info b, int size, int choice)
	 {
		set_interval_time obj=new set_interval_time();
		
		int counter = 0;
		if (choice == 1)
		{
			
			for (int i = 0; i < size; i++)
			{
				if (arr[i].getname().equals("x"))
				{
					counter++;
				}
			}
			if (counter >= size)
			{
				System.out.print("no place is available");
				System.out.print("\n");
				return 0;
			}
			for (int i = 0; i < size; i++)
			{
				if (arr[i].getposotion() == true && arr[i].getwidth() >= b.getwidth() && arr[i].getdepth() >= b.getdepth())
				{
					
					obj.getstart_timer();
					
					arr[i].setpostion(false);
					arr[i].setname("x");
					System.out.print(arr[i].getID());
					return obj.getstart_timer();
					
				}
			

				
					
			}
		}
		if(choice==2)
		{
			for (int i = 0; i < size; i++)
			{
				if (arr[i].getname() == "x")
				{
					counter++;
				}

			}
			if (counter >= size)
			{
				System.out.print( "no place is available");
				System.out.print("\n");
				return 0 ;
			}
			for(int i=0;i<size;i++)
			{
				if (arr[i].getposotion() == true && arr[i].getwidth() == b.getwidth() && arr[i].getdepth() == b.getdepth())
				{
					arr[i].setpostion(false);
					arr[i].setname("x");
					
					System.out.print("\n");
					System.out.print(arr[i].getID());
					return obj.getstart_timer();
				}
				else if (arr[i].getposotion() == true && arr[i].getwidth() == b.getwidth() && arr[i].getdepth() > b.getdepth())
				{
					arr[i].setpostion(false);
					arr[i].setname("x");
					System.out.print("\n");
					System.out.print(arr[i].getID());
					return obj.getstart_timer();
				}
				else if (arr[i].getposotion() == true && arr[i].getwidth() > b.getwidth() && arr[i].getdepth() == b.getdepth())
				{
					arr[i].setpostion(false);
					arr[i].setname("x");
					
					System.out.print("\n");
					System.out.print(arr[i].getID());
					return obj.getstart_timer();
					
				}
				else if (arr[i].getposotion() == true && arr[i].getwidth() > b.getwidth() && arr[i].getdepth() > b.getdepth())
				{
					arr[i].setpostion(false);
					arr[i].setname("x");
					
					System.out.print("\n");
					System.out.print(arr[i].getID());
					return obj.getstart_timer();
				}
			}
		}
		return 0 ;
	 }

}
