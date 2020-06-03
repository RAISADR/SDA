package ro.unitbv.javadatatype.lab3;

public class Dreptunghi implements Shape{
	private int lungime;
	private int latime;
	private HexColorValidator validare;
	private String fillColor;
	private static final String nume = "Dreptunghi";
	
	Dreptunghi(int l,int la,String s){
		this.lungime=l;
		this.latime=la;
		this.validare=new HexColorValidator();
		this.fillColor=s;
	}
	
	public void draw() {
		int rows = latime;
		int columns = lungime;
		String array[][]= new String[rows][columns];

		if(lungime==0 && latime==0) {
			System.out.println("Valoare 0");
		}else {
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
	}
	
	public String getName() {
		return nume;
	}
	
	public double getArea() {
		if(lungime>0 && latime>0) {
			return lungime*latime;
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
