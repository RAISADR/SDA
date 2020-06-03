package ro.unitbv.javadatatype.lab3;

public class Patrat implements Shape{
	private int latura ;
	private HexColorValidator validare;
	private String fillColor;
	private static final String nume = "Patrat";
	
	Patrat(int latura,String fillColor){
		this.latura=latura;
		this.validare=new HexColorValidator();
		this.fillColor=fillColor;
	}
	
	public void draw() {
		int rows = latura;
		int columns = latura;
		String array[][]= new String[rows][columns];
		
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				array[i][j] = "*";

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();		 
			} 
		}
	
	public String getName() {
		return nume;
	}
	
	public double getArea() {
		if(latura>0) {
		return latura*latura;
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
