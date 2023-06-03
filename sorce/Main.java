import java.util.Scanner;


public class Main {
	static double start_time;
	static double price;
	static double total_income=0;
	static int cars=0;
	public static void main(String[] args) {
		
		System.out.println("welcome to your garage ---->");
		System.out.println("please enter number of slots in garage");
		int size;
		Garage_info []arr;
		
		
		int customer_id;
		int choice_owner, choice_driver, choice;
		 boolean value=true;
		 boolean system=true;
		int temp_width,temp_depth;
		int temp_widh_driver,temp_depth_driver,temp_modelyear;
		String temp_name_driver;
		vechile_info car = new vechile_info();
		
		 Scanner input = new Scanner(System.in);//for input
		
		 size=input.nextInt();
		 arr=new Garage_info[size];
			
			
			 for(int i=0;i<size;i++)
			 {
				 arr[i] = new Garage_info();
				 System.out.println("please enter width and depth of slots");
				 temp_width=input.nextInt();
				 temp_depth=input.nextInt();
				 arr[i].setdepth(temp_depth);
				 arr[i].setwidth(temp_width);
			 }
			
			 System.out.println("you have 2 option first served slots and best fit");
			
			 
			 System.out.println("for first served press 1 for best fit press 2");
			 choice_owner=input.nextInt();
			while(choice_owner!=1 && choice_owner!=2)
			{
				System.out.println("please enter vaild choice");
				choice_owner=input.nextInt();
			}
			 System.out.println(" slots in garage by numbers");
			 for(int i=0;i<size;i++)
			 {
				 System.out.print(arr[i].getwidth());
				 System.out.print("*");
				 System.out.print(arr[i].getdepth());
				 System.out.print("\t");
				 
				 
			 }
			 System.out.print("\n");
			 while(system==true)
			 {
				 System.out.println("do you want to receive  cusomter ? ");
				 System.out.println("if yes press 1 or no press 2");
				 System.out.println("do you want to total income ?");
				 System.out.println("if yes press 3");
				 System.out.println("do you want to total numbers of vechile ?");
				 System.out.println("if yes press 4");
				 
				 choice=input.nextInt();
				 if(choice==1)
				 {
					 System.out.println("welcome driver------>>");
				 }
				 else if(choice==2)
				 {
					 break;
				 }
				 else if(choice==3)
				 {
					 System.out.print("total income is ");
					 System.out.println(total_income);
					 
				 }
				 else if(choice==4)
				 {
					 System.out.print("total number of vechiles are ");
					 System.out.println(cars);
					 
				 }
				 else
				 {
					 System.out.println("invalid input");
				 }
				 while(choice==1)
				 {
					 System.out.println("if you wanna see postions are avaliable press 1");
					 System.out.println("if you wanna park your car press 2");
					 System.out.println("if you wanna parkout press 3");
					 System.out.println("if you wanna exit press 4");
					 choice_driver=input.nextInt();
					 if(choice_driver==1)
					 {
						 display screen=new display();
						screen.display_slots(arr,size);
						System.out.println();
						 
					 }
					 else if(choice_driver == 2)
					 {
						 parkin parkingin=new parkin();
						 System.out.println("enter your info : car name , car modle ,widh and depth");
						 car = new vechile_info();
						 temp_name_driver=input.next();
						 temp_modelyear=input.nextInt();
						 temp_widh_driver=input.nextInt();
						 temp_depth_driver=input.nextInt();
						 car.setname(temp_name_driver);
						 car.setmodel_year(temp_modelyear);
						 car.setwidth(temp_widh_driver);
						 car.setdepth(temp_depth_driver);
						 System.out.print("please remember your id is ");
						 start_time = parkingin.parkin_fun(arr,car,size,choice_owner);
						 System.out.println();
						 cars++;
						 
					 }
					 
					 else if(choice_driver==4)
						 break;
					 else if(choice_driver==3)
					 {
						 System.out.println("please enter your id ");
						 
						 
						 customer_id =input.nextInt();
						 while(customer_id<0||customer_id==0)
						 {
							 System.out.println("please enter vaild id ");
						 }
						 parkout parking=new parkout();
						 price=parking.parkout_fun(arr, size,customer_id,start_time);
						 System.out.print("fees is");
						 System.out.println(price);
						 total_income=total_income+price;
						
					 }
					
					 else
						 System.out.println("invalid input");
				 }
				 
			 }
		}

	}


