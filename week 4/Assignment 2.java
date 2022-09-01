public class Question42 { 
	public static void main(String args[]){
		int year; 
		java.util.Calendar current;
               
               // Use getInstance() method to initialize the Calendar object.
               current = java.util.Calendar.getInstance();
		
		// Initialize the int variable year with the current year
		year = current.get(current.YEAR);


		// Print the current Year
		System.out.println("Current Year: "+year);
//int month = current.get(current.MONTH);
		System.out.print("Current Month: "+10);
  }  
}