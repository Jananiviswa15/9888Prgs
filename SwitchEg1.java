package ConditionalPrg;

public class SwitchEg1 {

	public static void main(String args[]) {
		
		String device = "mixer";
		switch(device) {
		case "AC":
			System.out.println(" in hall");
		case "wasMach":
			System.out.println("in utitlity");
		case "smartDustBin":
			System.out.println("in utitlity");
		case "heater":
			System.out.println("in bathroom");
		case "dryer":
			System.out.println("in bathroom");
		case "mixer":
		case "grinder":
		case "fridge" :
				System.out.println("kitchen");
		}
	}
}
