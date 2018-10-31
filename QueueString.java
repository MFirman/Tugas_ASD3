import java.util.ArrayList;

public class QueueString {
	ArrayList<String> Mahasiswa = new ArrayList<String>();
	int back = -1;
		
		public void insert (String value){
			Mahasiswa.add(value);
		}
		public String get(){
			String value = Mahasiswa.get(0);
			return value;
		}
		public String pop(){
			String value = Mahasiswa.get(back);
			back = back - 1;
			return value;
		}
		public void cetak(){
			System.out.println("Nama Mahasiswa : " + Mahasiswa.toString());
}
}
