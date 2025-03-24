package Session_5;

public class Accessfoodmenu implements VegItems, NonVegItems{

	@Override
	public void fry() {
		System.out.println("Chicken fry, mutton fry, prawn fry");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gravy() {
		System.out.println("Chicken gravy,beef gravy, crab gravy");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breakFast() {
		System.out.println("Idly, poori, dosa");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lunch() {
		System.out.println("Biriyani, meals");
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		  
		
		Accessfoodmenu afm = new Accessfoodmenu();
		afm.breakFast();
		afm.lunch();
		afm.fry();
		afm.gravy();
		                        
	}

	
}
