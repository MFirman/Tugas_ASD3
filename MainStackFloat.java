
public class MainStackFloat {

	public static void main(String[] args) {
		StackFloat Berat = new StackFloat();
		Berat.Cetak();
		
		Berat.push((float)50.12);Berat.Cetak();
		Berat.push((float)48.15);Berat.Cetak();
		Berat.push((float) 41.25);Berat.Cetak();
		
		Float br1 = Berat.pop();Berat.Cetak();
		System.out.println(br1);
		Float br2 = Berat.pop();Berat.Cetak();
		System.out.println(br2);
		Float br3 = Berat.pop();Berat.Cetak();
		System.out.println(br3);

	}

}
