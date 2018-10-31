import java.util.ArrayList;

public class ArrayListFloat {
	public static void main(String[] args) {
		ArrayList <Float> BeratBadan = new ArrayList<Float>();
		BeratBadan.add((float) 50.12);
		BeratBadan.add((float) 48.15);
		BeratBadan.add((float) 41.25);
		
		System.out.println("Berapa Banyak Data : " + BeratBadan.size());
		System.out.println("Berat Badan : " + BeratBadan);
		BeratBadan.set(1, (float) 42.55);
		BeratBadan.set(2, (float) 44.12);
		System.out.println("Berat Badan : " + BeratBadan);
		}

	}

