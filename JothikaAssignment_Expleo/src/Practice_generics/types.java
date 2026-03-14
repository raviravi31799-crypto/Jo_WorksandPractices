package Practice_generics;
class Test<T,U,R>{
	T obj;
	U obj1;
	R obj2;
	Test(T obj,U obj1,R obj2){//constructor
		this.obj=obj;
		this.obj1=obj1;
		this.obj2=obj2;
	}
	public void print() {
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
public class types {

	public static void main(String[] args) {
		Test<Integer,Float,String> obj =new Test<>(23,4.5f,"Demo");
		obj.print();
	}

}
