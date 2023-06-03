
public class display {
public void display_slots(Garage_info arr[],int size)
{
	for(int i=0;i<size;i++)
	{
		System.out.print(arr[i].getname());
		System.out.print(arr[i].getID());
		System.out.print(" ");
	}
}
}
