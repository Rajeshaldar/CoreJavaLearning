package list.vector;
import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) {
		Vector V = new Vector();
		V.add(10);
		V.add(20);
		V.add('C');
		V.add(null);
		V.add(null);
		V.add("Sheela");
		V.add(10);
		
		System.out.println(V);
		System.out.println(V.get(2));
		
	}
}
