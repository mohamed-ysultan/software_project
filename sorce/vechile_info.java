
public class vechile_info {

   private String model_name = "S";
	
	private int modle_year;
	private int width; //car diamntions
	private int depth;
	public vechile_info()
	{
		model_name = "none";
		 modle_year = 0; width = 0; depth = 0;
		
	}
	public String getmodel_name()
	{
		return model_name;
	}
	
	public final int getmodel_year()
	{
		return modle_year;
	}
	
	public final int getwidth()
	{
		return width;
	}
	public final int getdepth()
	{
		return depth;
	}
	public void setname(String name)
	{
		model_name=name;
	}
	public void setmodel_year(int model)
	{
		modle_year=model;
	}
	public void setwidth(int tempwidth)
	{
		width=tempwidth;
	}
	public void setdepth(int tempdepth)
	{
		depth=tempdepth;
	}
}
