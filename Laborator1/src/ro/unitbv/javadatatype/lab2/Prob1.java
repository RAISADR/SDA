package ro.unitbv.javadatatype.lab2;

public class Prob1 {

	public static void main(String[] args) {
		System.out.println("Prima forma cu If si Else");
		System.out.println("Viteza maxima in zona rezidentiala este:"+getMaxSpeedLimitByIfElse("Zona rezidentiala")+"km/h");
		System.out.println("Viteza maxima in oras este:"+getMaxSpeedLimitByIfElse("Oras")+"km/h");
		System.out.println("Viteza maxima pe drumul express este:"+getMaxSpeedLimitByIfElse("Drum express")+"km/h");
		System.out.println("Viteza maxima pe autostrada este:"+getMaxSpeedLimitByIfElse("Autostrada")+"km/h");
		
		
		System.out.println("\n");
		System.out.println("A doua forma cu If si Else");
		System.out.println("Viteza maxima in zona rezidentiala este:"+getMaxSpeedLimitByIfElseComplex("Zona rezidentiala")+"km/h");
		System.out.println("Viteza maxima in oras este:"+getMaxSpeedLimitByIfElseComplex("Oras")+"km/h");
		System.out.println("Viteza maxima pe drumul express este:"+getMaxSpeedLimitByIfElseComplex("Drum express")+"km/h");
		System.out.println("Viteza maxima pe autostrada este:"+getMaxSpeedLimitByIfElseComplex("Autostrada")+"km/h");
		
		
		System.out.println("\n");
		System.out.println("Forma cu Switch");
		System.out.println("Viteza maxima in zona rezidentiala este:"+getMaxSpeedBySwitch("Zona rezidentiala")+"km/h");
		System.out.println("Viteza maxima in oras este:"+getMaxSpeedBySwitch("Oras")+"km/h");
		System.out.println("Viteza maxima pe drumul express este:"+getMaxSpeedBySwitch("Drum express")+"km/h");
		System.out.println("Viteza maxima pe autostrada este:"+getMaxSpeedBySwitch("Autostrada")+"km/h");
		


	}

	public static int getMaxSpeedLimitByIfElse(String drum ) {
		if (drum == "Zona rezidentiala") {
			return 30;
		}
		else if (drum=="Oras") {
			return 50;
		}
		else if (drum=="Drum express") {
			return 100;
		}
		else if (drum=="Autostrada") {
			return 130;
		}
		return 0;
	}
	
	public static int getMaxSpeedLimitByIfElseComplex(String drum) {
		if(drum=="Zona rezidentiala") {
			return 30;
		 }
		else {
			if(drum=="Oras") {
				return 50;
			}
			else {
				if(drum=="Drum express") {
					return 100;
				}
				else {
					if(drum=="Autostrada") {
						return 130;
				}
				}		
			}
		}
		return 0;
	}
	
	public static int getMaxSpeedBySwitch(String drum) {
		switch(drum) {
		  case "Zona rezidentiala":
		    return 30;		    
		  case "Oras":
		    return 50;		    
		  case "Drum express":
		    return 100;		    
		  case "Autostrada":
		    return 130;		     
		  default:
		    return 0;
		}
	}
}
