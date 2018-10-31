import java.util.ArrayList;

public class StackFloat {

	ArrayList<Float> BeratBadan = new ArrayList<Float>();
	int top = -1;
	
	public void push(Float value){
		BeratBadan.add(value);
		top = top +1;
		}
	
	public float pop (){
		float value = BeratBadan.get(top);
		BeratBadan.remove(top);
		top = top -1;
		return value;
		}
	
	public void Cetak(){
		System.out.println(BeratBadan.toString());

	}
}
