import java.util.ArrayList;

public class QueueFloat {
	ArrayList<Float> BeratBadan = new ArrayList<Float>();
	int back = -1;
		
		public void insert (Float value){
			BeratBadan.add(value);
		}
		public Float get(){
			Float value = BeratBadan.get(0);
			return value;
		}
		public Float pop(){
			Float value = BeratBadan.get(back);
			back = back - 1;
			return value;
		}
		public void cetak(){
			System.out.println("Berat Badan : " + BeratBadan.toString());
	
}
}