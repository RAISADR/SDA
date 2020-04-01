package ro.unitbv.javadatatype.lab2;

import java.util.ArrayList;
import java.util.Arrays;

public class Prob2 {
	public static void main(String[] args) {
		double[] temp = {37.6,37.9,37.4,36.6};
		
        ArrayList<Double> nor = new ArrayList<Double>();
        ArrayList<Double> anor = new ArrayList<Double>();
		System.out.println("Temperaturile pacientilor : "+Arrays.toString(temp));
		
		for(int i=0;i<temp.length;i++) {
			if(temp[i]>37.0) {
				anor.add(temp[i]);
				System.out.println("Pacientul cu nr: "+i+" este nesanatos si are temperatura: "+temp[i]);
			}else {
				nor.add(temp[i]);
				System.out.println("Pacientul cu nr: "+i+" este sanatos si are temperatura: "+temp[i]);
			}
	
		}
		System.out.println("Temperatura normala: " +nor);
		System.out.println("Temperatura anormala: "+anor);
	}
}
