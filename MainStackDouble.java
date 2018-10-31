
public class MainStackDouble {
	public static void main(String[] args) {
		StackDouble Tinggi = new StackDouble();
		Tinggi.Cetak();
		
		Tinggi.push(165.35);Tinggi.Cetak();
		Tinggi.push(160.00);Tinggi.Cetak();
		Tinggi.push(158.25);Tinggi.Cetak();
		Tinggi.push(150.55);Tinggi.Cetak();
		Tinggi.push(145.88);Tinggi.Cetak();
		
		Double tg1 = Tinggi.pop();Tinggi.Cetak();
		System.out.println(tg1);
		Double tg2 = Tinggi.pop();Tinggi.Cetak();
		System.out.println(tg2);
		Double tg3 = Tinggi.pop();Tinggi.Cetak();
		System.out.println(tg3);
		Double tg4 = Tinggi.pop();Tinggi.Cetak();
		System.out.println(tg4);
		Double tg5 = Tinggi.pop();Tinggi.Cetak();
		System.out.println(tg5);

	}

}
