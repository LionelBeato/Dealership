package dealership;

import java.util.*;

public class CustomerInformation {
	
	
	
	 
	 
	 
	 public static Client showFrontdeskmenu() {
		 
		 //creating an arraylist to store the client's personal information and car preferences
		 
		 ArrayList <String> personalInfo = new ArrayList<>();
			
		//Prompting User 1 to input data about the client
		 
			   Scanner input = new Scanner(System.in);
			     
				 System.out.println("Full Name: ");
			    String name = input.nextLine();
			     personalInfo.add(name);
			   
			     System.out.println("Address: ");
			    String address = input.nextLine();
			     personalInfo.add(address);
			     
			     System.out.println("Phone Number (xxx)xxx-xxxx: ");
			     String phone = input.nextLine();
			     personalInfo.add(phone);
			     
			     System.out.println("Email Address: ");
			     String email = input.nextLine();
			     personalInfo.add(email);
			     
			     System.out.println("Which type of car is the client looking for?");
			     String type = input.nextLine();
			     personalInfo.add(type);
			     
			     System.out.println("Which make?");
			     String make = input.nextLine();
			     personalInfo.add(make);
			     
			     System.out.println("Which model?");
			     String model = input.nextLine();
			     personalInfo.add(model);
			     
			     System.out.println("Which year?");
			     String year = input.nextLine();
			     personalInfo.add(year);
			     
			     System.out.println("Which towing capacity?");
			     String tow = input.nextLine();
			     personalInfo.add(tow); 
			     
			     System.out.println("Which kind of drive mode?");
			     String wheel = input.nextLine();
			     personalInfo.add(wheel);
			     
			     System.out.println("Which department does the client wish to see?");
			     String deptChoice = input.nextLine();
			     personalInfo.add(deptChoice);			     

			 //System.out.println(personalInfo);
			//Creating a new customer profile, pulling in all the info from the prompts
			     
			 Client newPerson = new Client(personalInfo.get(0), personalInfo.get(1), personalInfo.get(2), personalInfo.get(3), personalInfo.get(4), personalInfo.get(5), personalInfo.get(6), personalInfo.get(7), personalInfo.get(8), personalInfo.get(9), personalInfo.get(10));
		 
		 return newPerson; 
	 }
	
//   NOTE: Remove main if done with testing
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(showFrontdeskmenu().getName());
 
   
     
	// System.out.println("Which user are you Type 1 for front desk , Type 2 for Sales Type 3 for whatever else you want: ");
    //if(input.nextLine().equalsIgnoreCase("1"){
    	
  //  	showFrontdeskmenu();
    	
 //   }

	}
 //}



