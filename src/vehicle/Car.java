package vehicle;

 public class Car {
	  public String sModel;
	  public static String iColor;
	  public int iHighestSpeed;
	  public static int iDoor;
	  public static int iWheels;
	  
	  
		public Car(){
			iDoor = 4;
			iWheels = 4;
		}
	  
	  
		public void DisplayCharacterstics(){
			System.out.println("Model of the Car: " + sModel);
			System.out.println("Color of the Car: " + iColor);
			System.out.println("Max speed of the Car: " + iHighestSpeed);
			System.out.println("Number of door in the Car: " + iDoor);
			System.out.println("Number of wheels in the Car: " + iWheels);
			
			}
		
}
