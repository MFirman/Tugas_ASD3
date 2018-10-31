import java.util.ArrayList;

public class StackDouble {
	ArrayList<Double> TinggiBadan = new ArrayList<Double>();
	int top = -1;
	
	public void push(Double value){
		TinggiBadan.add(value);
		top = top +1;
		}
	
	public double pop (){
		double value = TinggiBadan.get(top);
		TinggiBadan.remove(top);
		top = top -1;
		return value;
		}
	public void Cetak(){
		System.out.println(TinggiBadan.toString());
		
	}

}
