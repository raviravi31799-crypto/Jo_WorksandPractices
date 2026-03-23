package Practice_Collections;
import java.util.*;

	class Mobile_1 implements Comparable<Mobile>{
		private String name;
		private int ram;
		private int price;
		Mobile_1(String name,int ram,int price){
			this.name=name;
			this.ram=ram;
			this.price=price;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setRam(int ram) {
			this.ram = ram;
		}
		public int getRam() {
			return ram;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getPrice() {
			return price;
		}
		
	
	public int compareTo(Mobile_1 o) {
		if(this.ram>o.getRam()) {
			return 1;
			
		}
		else {
			return -1;
		}
	}
	class PriceCompare implements Comparator<Mobile_1>{
		public int compare(Mobile_1 m1,Mobile_1 m2) {
			if(m1.getPrice()<m2.getPrice())return -1;
			if(m1.getPrice()<m2.getPrice())return 1;
			else return 0;
		}
	}
	class NameCompare implements Comparator<Mobile>{
		public int compare(Mobile_1 m1,Mobile_1 m2) {
			return m1.getName().compareTo(m2.getName());
			
		}
	}
	public class comparator {
	public static void main(String[] args) {
		List<Mobile_1> molist=new ArrayList<>();
		molist.add(new Mobile_1("OppoAx",16,6000));
		molist.add(new Mobile_1("Samsung",8,4000));
		molist.add(new Mobile_1("Redmi",4,2000));
		Collections.sort(molist);
		System.out.println("Mobiles after sorting: ");
		System.out.println("Name"+"\t"+"Ram"+"\t"+"Price" );
		for(Mobile mb:molist) {
			System.out.println(mb.getName()+"\t"+mb.getRam()+"\t"+mb.getPrice());
		}
		
	}

}
	}
	


