
public class Garage_info {
	private int number;
	private int width;
	private int depth;
	private String name="s";
	private	boolean postion;
	private static int id = 1;
	private int ID =1;
	private int choice;
	public Garage_info()
	{
		postion = true;
		width = 0; depth = 0;
		ID = id;
		id++;
		number=0;
		choice=0;
		
	}
	public void setchoice(int tempchoice)
	{
		choice=tempchoice;
	}
	public int getchoice()
	{
		return choice;
	}
	
	public void setnumber(int tempnumber)
	{
		number=tempnumber;
	}
	public int getnumber()
	{
		return number;
	}
	public void setwidth(int tempwidth)
	{
		width=tempwidth;
	}
	public void setdepth(int tempdepth)
	{
		depth=tempdepth;
	}
	
	public final int getwidth()
	{
		return width;
	}
	public final int getdepth()
	{
		return depth;
	}
	//public final void setcar(vechile_info tempcar)
	//{
	//	car.equalop(tempcar);
	//	postion = false;
	//	name = "x";
//	}
	public int getid_static()
	{
		return id;
	}
	public int getID()
	{
		return ID;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String tempname)
	{
		name=tempname;
	}
	void setpostion(boolean value)
	{
		postion=value;
	}
	
	public boolean getposotion()
	{
		return postion;
	}
}
