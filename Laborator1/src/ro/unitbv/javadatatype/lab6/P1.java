package ro.unitbv.javadatatype.lab6;
import java.util.*;

public class P1 {

	public static <Integer,Student> void show(Map<Integer,Student> m) {
        Set<Map.Entry<Integer,Student> > s = m.entrySet();
        System.out.print("\n");
        for (Map.Entry<Integer,Student> me:s) 
           {
               System.out.println("\nStudentul:"+me.getValue());
               System.out.println("CNP:"+me.getKey());
           }
        System.out.println();
    }

	public static void main(String[] args) {
		Map<Integer,StudentDetails> lst1 = new HashMap<Integer,StudentDetails>();
		Map<Integer,StudentDetails> lst2 = new LinkedHashMap<Integer,StudentDetails>();
		Scanner s = new Scanner(System.in);
		
		StudentDetails std1 = new StudentDetails("Bell","Darcy",Arrays.asList(9.8,8.9),Arrays.asList(8.0,9.1));
		StudentDetails std2 = new StudentDetails("Barty","Ash",Arrays.asList(6.8,7.5),Arrays.asList(8.5,9.2));
		StudentDetails std3 = new StudentDetails("Johnson","Peter",Arrays.asList(9.2,9.8),Arrays.asList(7.8,8.8));
		StudentDetails std4 = new StudentDetails("Lori","Didi",Arrays.asList(8.4,7.9),Arrays.asList(7.8,7.8));
		StudentDetails std5 = new StudentDetails("Willie","Cindy",Arrays.asList(9.0,8.8),Arrays.asList(6.8,8.8));
		StudentDetails std6 = new StudentDetails("Mendes","Cami",Arrays.asList(7.9,8.8),Arrays.asList(6.8,8.8));
		lst1.put(1001010, std1);
		lst1.put(1001111, std2);
		lst1.put(1001001, std3);
		lst1.put(1001011, std4);
		lst1.put(1001101, std5);
		
		System.out.print("Introducere CNP:");
		int val = s.nextInt();
		System.out.println("CNP: "+val+"-studentul: "+lst1.get(val));
		
		System.out.println("\nHashMap\nCNP-urile introduse sunt:" +lst1.keySet());
		show(lst1);
		s.close();
		lst2.put(1001010, std1);
		lst2.put(1001111, std2);
		lst2.put(1001001, std3);
		lst2.put(1001011, std4);
		lst2.put(1001101, std5);

		System.out.println("\nLinkedHashMap\nCNP-urile introduse sunt:" +lst2.keySet());
		show(lst2);
		
		lst2.put(1001101, std6);
		System.out.println("\nStudent nou: "+lst2.get(1001101));
	}
}
