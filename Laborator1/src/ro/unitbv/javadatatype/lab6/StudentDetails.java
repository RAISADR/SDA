package ro.unitbv.javadatatype.lab6;
import java.util.*;

public class StudentDetails {
	String nume ;
	String prenume;
	List<Double> note_ro;
	List<Double> note_mate;
		
	public StudentDetails(String nume, String prenume, List<Double> note_ro, List<Double> note_mate) {
		this.nume = nume;
		this.prenume = prenume;
		this.note_ro = note_ro;
		this.note_mate = note_mate;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public List<Double> getnote_ro() {
		return note_ro;
	}

	public void setnote_ro(List<Double> note_ro) {
		this.note_ro = note_ro;
	}

	public List<Double> getnote_mate() {
		return note_mate;
	}

	public void setnote_mate(List<Double> note_mate) {
		this.note_mate = note_mate;
	}
	@Override
	public String toString() {
		return  nume+" "+prenume+"-note romana:"+note_ro+"-note matematica:"+note_mate;
	}
}
