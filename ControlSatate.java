package bharath;

import java.util.Scanner;

public class ControlSatate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double time=0.0;int fare=0;
		System.out.println("tell us your destination");
		String dest=scan.nextLine();
		switch(dest)
		{
		case "channai":case"Chennai":case"CHENNAI":case"vellore":case"dharmapuri":
			System.out.println("destination of"+dest+"has sleeper,ac,seater available choose timing:");
			time=scan.nextDouble();
			if(time>=6.00&&time<=10.00) {
				System.out.println("A/C seater available");
			}
			else if(time>=10.01&&time<=12.00) {
				System.out.println("semi sleeper available");
			}
			else if(time>=12.01&&time<=15.00) {
				System.out.println("A/C sleeper,seater available");
				System.out.println("tell us amount to book seats:");
				fare=scan.nextInt();
				switch(fare) {
				case 350:System.out.println("seater available to "+dest+" in"+time);break;
				case 750:System.out.println("sleeper available to "+dest+" in"+time);break;
				default:System.out.println(fare+"not match in "+time+" to "+dest);
				}
			}
			else {
				System.out.println("No coaches available "+time+" to "+dest);
			}
			break;
		case"banglore":System.out.println("A/C seater available @ banglore timings to "+dest);break;
		case"cochin":System.out.println("A/C seater,sleeperand delux coches available @ eve timings to "+dest);break;
		case"hydrabad":System.out.println("seater and sleeper available @ night timings to "+dest);break;
		default:System.out.println("no coaches available "+dest);
		
		}
		scan.close();
	}

}
