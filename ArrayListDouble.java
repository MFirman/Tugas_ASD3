import java.util.ArrayList;

public class ArrayListDouble {
	public static void main(String[] args) {
		
		ArrayList<Double> TinggiBadan = new ArrayList<Double>();
		TinggiBadan.add(165.35);
		TinggiBadan.add(160.00);
		TinggiBadan.add(158.25);
		TinggiBadan.add(150.55);
		TinggiBadan.add(145.88);
		
		System.out.println("Apakah ArrayList Kosong : " + TinggiBadan.isEmpty());
		System.out.println("Tinggi Badan : " + TinggiBadan);
		System.out.println("Berapa Jumlah Data : " + TinggiBadan.size());
		TinggiBadan.remove(1);
		System.out.println("Tinggi Badan : " + TinggiBadan);
		}

	}

