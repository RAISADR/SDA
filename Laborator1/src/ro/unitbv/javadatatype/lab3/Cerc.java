package ro.unitbv.javadatatype.lab3;

public class Cerc implements Shape{
	private int raza ;
	private HexColorValidator validare;
	private String fillColor;
	private static final String nume = "Cerc";
	
	Cerc(int r, String f){
		this.validare=new HexColorValidator();
		this.raza=r;
		this.fillColor=f;
	}

	public void draw() {
		double dist; 
		int radius=raza;
		for (int i = 0; i <= 2 * radius; i++) {     
			for (int j = 0; j <= 2 * radius; j++) { 
				dist = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius)); 

				if (dist > radius - 0.5 && dist < radius + 0.5) 
					System.out.print("*"); 
				else
					System.out.print(" "); 
			} 
			System.out.print("\n"); 
		} 
    }

	public String getName() {
		return nume;
}
	
	public double getArea() {
		if(raza>0) {
			return (3.14*raza*raza);
			}else {
				return 0;
			}
	}
	public String getHexColor() {
		boolean ok=validare.valid(fillColor);	
		if(ok==true)		
		  return  fillColor;	
		
		return "ERROR";
	}
}