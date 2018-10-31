
public class MainStackGeneric {
	public static void main(String[] args) {
		StackGeneric tumpuk = new StackGeneric();
		
		tumpuk.push("MULIANA");tumpuk.cetak();
		tumpuk.push("NADRA");tumpuk.cetak();
		tumpuk.push("NARTI");tumpuk.cetak();
		tumpuk.push("NILASARI");tumpuk.cetak();
		tumpuk.push("RAHMAYANA");tumpuk.cetak();
	
		tumpuk.pop();tumpuk.cetak();

	}

}
