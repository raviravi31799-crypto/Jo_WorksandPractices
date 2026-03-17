package Practice_Collections;
import java.util.*;
public class HashMapdemo {

	public static void main(String[] args) {
		HashMap<String,Double> h=new HashMap<String,Double>();
		System.out.println("Size of the HashMap:"+h.size());
		h.put("Jo",91.5);
		h.put("Usha",95.5);
		h.put("Pooja",81.5);
		h.put("Nithi",76.5);
		h.put("Vaiju",90.78);
		h.put("Soundh",67.90);
		System.out.println("HashMap:"+h);
		System.out.println("Size of the HashMap:"+h.size());
		//set conversion
		Set<Map.Entry<String,Double>>Set=h.entrySet();
		for(Map.Entry<String,Double>me:Set) {
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
		}
		
	}

}
