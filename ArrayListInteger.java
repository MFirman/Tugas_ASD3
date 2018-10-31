import java.util.ArrayList;

public class ArrayListInteger {
	public static void main(String[] args) {
		ArrayList<Integer> NilaiMahasiswa = new ArrayList<Integer>();
		NilaiMahasiswa.add(95);
		NilaiMahasiswa.add(90);
		NilaiMahasiswa.add(85);
		NilaiMahasiswa.add(80);
		NilaiMahasiswa.add(75);
		
		System.out.println(NilaiMahasiswa.isEmpty());
		System.out.println("Nilai Mahasiswa" + NilaiMahasiswa);
		System.out.println("Ada berapa mahasiswa yang mempunyai nilai 85 : " + NilaiMahasiswa.indexOf(80));
		
		ArrayList<Integer> NilaiMahasiswa1 = NilaiMahasiswa;
		System.out.println("2" + NilaiMahasiswa);
		System.out.println("3" + NilaiMahasiswa1);
		NilaiMahasiswa1.remove(4);
		System.out.println("2" + NilaiMahasiswa);
		System.out.println("3" + NilaiMahasiswa1);
	}

}

