package ro.unitbv.javadatatype.lab2;

public class Prob1 {

	public static void main(String[] args) {
		System.out.println("Prima forma cu If si Else");
		System.out.println("Viteza maxima este:"+getMaxSpeedLimitByIfElse("Zona rezidentiala")+"km/h");
		System.out.println("Viteza maxima este:"+getMaxSpeedLimitByIfElse("Oras")+"km/h");
		System.out.println("Viteza maxima este:"+getMaxSpeedLimitByIfElse("Drum express")+"km/h");
		System.out.println("Viteza maxima este:"+getMaxSpeedLimitByIfElse("Autostrada")+"km/h");
		System.out.println("Viteza maxima este:"+getMaxSpeedLimitByIfElse("???")+"km/h");
		
		System.out.println("\n");
		System.out.println("A doua forma cu If si Else");
		System.out.println("Viteza maxima este:"+getMaxSpeedLimitByIfElseComplex("Zona rezidentiala")+"km/h");
		System.out.println("Viteza maxima este:"+getMaxSpeedLimitByIfElseComplex("Oras")+"km/h");
		System.out.println("Viteza maxima este:"+getMaxSpeedLimitByIfElseComplex("Drum express")+"km/h");
		System.out.println("Viteza maxima este:"+getMaxSpeedLimitByIfElseComplex("Autostrada")+"km/h");
		System.out.println("Viteza maxima este:"+getMaxSpeedLimitByIfElseComplex("???")+"km/h");
		
		System.out.println("\n");
		System.out.println("Forma cu Switch");
		System.out.println("Viteza maxima este:"+getMaxSpeedBySwitch("Zona rezidentiala")+"km/h");
		System.out.println("Viteza maxima este:"+getMaxSpeedBySwitch("Oras")+"km/h");
		System.out.println("Viteza maxima este:"+getMaxSpeedBySwitch("Drum express")+"km/h");
		System.out.println("Viteza maxima este:"+getMaxSpeedBySwitch("Autostrada")+"km/h");
		System.out.println("Viteza maxima este:"+getMaxSpeedBySwitch("???")+"km/h");


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
					if(drum=="Autostrada")
						return 130;
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
