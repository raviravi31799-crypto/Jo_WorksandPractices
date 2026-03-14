package Practice_generics;

public class genericmethods {
static <T>void genericDisplay(T element){//generic method
	System.out.println(element);
	System.out.println(element.getClass().getName()+"=" +element);
}
	public static void main(String[] args) {
		genericDisplay(34);
		genericDisplay(21.5);
		genericDisplay("test");
		

	}

}
