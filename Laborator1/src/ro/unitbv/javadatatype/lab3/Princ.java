package ro.unitbv.javadatatype.lab3;
import java.util.ArrayList;
import java.util.List;

public class Princ {

	public static void main(String[] args) {
		Patrat p = new Patrat(4,"#0019FA");
		p.draw();
		System.out.println("Numele este: " + p.getName());
		System.out.println("Aria este: " + p.getArea());
		System.out.println("Culoarea este: " + p.getHexColor());
		System.out.println( );
		
		Dreptunghi d = new Dreptunghi(5,3,"#0019FA");
		d.draw();
		System.out.println("Numele este: " + d.getName());
		System.out.println("Aria este: " + d.getArea());
		System.out.println("Culoarea este: " + d.getHexColor());
		System.out.println( );
		
		Cerc c = new Cerc(5,"#0019FA");
		c.draw();
		System.out.println("Numele este: " + c.getName());
		System.out.println("Aria este: " + c.getArea());
		System.out.println("Culoarea este: " + c.getHexColor());
		System.out.println( );
		
		List<Shape> forme = new ArrayList<>();
		forme.add(new Patrat(3,"#FAFA00"));
		forme.add(new Dreptunghi(6,4,"#FAFA00"));
		forme.add(new Cerc(7,"#FAFA00"));
		for(Shape f: forme)
		{
			f.draw();
			System.out.print("Numele= ");			
			System.out.println(f.getName());
			System.out.print("Aria= ");	
			System.out.println(f.getArea());
			System.out.print("Culoarea= ");			
			System.out.println(f.getHexColor());
		}
	}
}