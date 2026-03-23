package Practice_Collections;
import java.util.*;

//class mobile implements comparable
class Mobile implements Comparable<Mobile>{
	private String name;
	private int ram;
	private int price;
	Mobile(String name,int ram,int price){
		this.name=name;
		this.ram=ram;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int compareTo(Mobile o) {
		if(this.ram>o.getRam()) {
			return 1;
			
		}
		else {
			return -1;
		}
	}
	
}
public class comparable {
	

	public static void main(String[] args) {
		List<Mobile> mlist=new ArrayList<>();
		mlist.add(new Mobile("Oppo",16,6000));
		mlist.add(new Mobile("Samsung",8,4000));
		mlist.add(new Mobile("Redmi",4,2000));
		Collections.sort(mlist);
		System.out.println("Mobiles after sorting: ");
		System.out.println("Name"+"\t"+"Ram"+"\t"+"Price" );
		for(Mobile mb:mlist) {
			System.out.println(mb.getName()+"\t"+mb.getRam()+"\t"+mb.getPrice());
		}
		
	}

}
