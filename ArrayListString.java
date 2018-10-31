import java.util.ArrayList;

public class ArrayListString {
	public static void main(String[] args) {
		ArrayList<String> Mahasiswa = new ArrayList<String>();
		Mahasiswa.add("FIRMAN");
		Mahasiswa.add("ARUL");
		Mahasiswa.add("NADRA");
		Mahasiswa.add("JUMARDI");
		Mahasiswa.add("MULIANA");
		
		ArrayList<String> Mahasiswa1 = Mahasiswa;
		System.out.println("1" + Mahasiswa.toString());
		System.out.println("2" + Mahasiswa1.toString());
		Mahasiswa.remove(2);
		System.out.println("1" + Mahasiswa.toString());
		System.out.println("2" + Mahasiswa1.toString());
		}

	}

